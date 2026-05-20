package entity.error;

import org.antlr.v4.runtime.*;

public class ErrorRecoveryStrategy extends DefaultErrorStrategy {

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        notifyErrorListeners(recognizer, e);

        TokenStream tokens = recognizer.getInputStream();

        while (tokens.LA(1) != Token.EOF && !isSyncToken(tokens.LT(1))) {
            recognizer.consume();
        }

        // Normalmente conviene consumir ;, pero NO siempre consumir tokens de inicio de bloque
        if (tokens.LA(1) != Token.EOF && tokens.LT(1).getText().equals(";")) {
            recognizer.consume();
        }
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        InputMismatchException e = new InputMismatchException(recognizer);
        notifyErrorListeners(recognizer, e);

        try {
            return super.recoverInline(recognizer);
        } catch (RecognitionException ex) {
            recover(recognizer, ex);
            return recognizer.getCurrentToken();
        }
    }

    @Override
    public void sync(Parser recognizer) throws RecognitionException {
        super.sync(recognizer);
    }

    private void notifyErrorListeners(Parser recognizer, RecognitionException e) {
        Token token = recognizer.getCurrentToken();

        recognizer.notifyErrorListeners(
                token,
                "Error sintáctico cerca de '" + token.getText() + "'",
                e
        );
    }

    private boolean isSyncToken(Token token) {
        String text = token.getText();

        return text.equals(";")
                || text.equals("END")
                || text.equals("SUBROUTINE")
                || text.equals("FUNCTION")
                || text.equals("PROGRAM")
                || text.equals("INTERFACE");
    }
}