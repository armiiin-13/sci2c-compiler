package entity.error;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
    private final List<String> errors = new ArrayList<>();

    public void addError(String line, String column, String motive) {
        errors.add(
                "[ERROR SEMÁNTICO] Línea " + line +
                        ", columna " + column +
                        ": " + motive
        );
    }

    public void addError(String type, Token token, String message) {
        if (token == null) {
            errors.add(
                    "[" + type + "] Línea ?, columna ?: " + message
            );
            return;
        }

        errors.add(
                "[" + type + "] Línea " + token.getLine() +
                        ", columna " + token.getCharPositionInLine() +
                        ": " + message
        );
    }

    public void addError(int line, int charPositionInLine, String s) {
        this.addError(Integer.toString(line), Integer.toString(charPositionInLine), s);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public void printErrors() {
        errors.forEach(System.err::println);
    }


    public void addError(String error, String message) {
        errors.add("[" + error + "] " + message);
    }
}
