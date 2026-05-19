package entity.error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class ErrorListener extends BaseErrorListener {
    private final ErrorManager errorManager;

    public ErrorListener(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e
    ) {
        Token token = (Token) offendingSymbol;

        errorManager.addError(
                "ERROR SINTÁCTICO",
                token,
                "Error cerca de '" + token.getText() + "': " + msg
        );
    }
}
