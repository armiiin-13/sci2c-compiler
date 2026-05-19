package entity.error;

import org.antlr.v4.runtime.*;

public class ErrorRecuperationStrategy extends DefaultErrorStrategy {
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        notifyErrorListeners(recognizer, e);
        synchronize(recognizer);
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        InputMismatchException e = new InputMismatchException(recognizer);
        notifyErrorListeners(recognizer, e);
        synchronize(recognizer);
        return recognizer.getCurrentToken();
    }

    @Override
    public void sync(Parser recognizer) { }

    private void notifyErrorListeners(Parser recognizer, RecognitionException e) {
        Token token = recognizer.getCurrentToken();

        recognizer.notifyErrorListeners(
                token,
                "Error sintáctico cerca de '" + token.getText() + "'",
                e
        );
    }

    private void synchronize(Parser recognizer) {
        TokenStream tokens = recognizer.getInputStream();

        while (tokens.LA(1) != Token.EOF &&
                !isSyncToken(tokens.LT(1).getText())) {
            recognizer.consume();
        }

        // Si estamos en ';', lo consumimos para pasar a la siguiente sentencia.
        if (tokens.LT(1).getText().equals(";")) {
            recognizer.consume();
        }
    }

    private boolean isSyncToken(String tokenText) {
        return tokenText.equals(";")
                || tokenText.equals("END")
                || tokenText.equals("SUBROUTINE")
                || tokenText.equals("FUNCTION")
                || tokenText.equals("PROGRAM")
                || tokenText.equals("INTERFACE");
    }
}
