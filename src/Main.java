import java.io.*;

import entity.error.ErrorListener;
import entity.error.ErrorManager;
import entity.error.ErrorRecuperationStrategy;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            SciLanguageLexer analex = new SciLanguageLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            SciLanguageParser anasint = new SciLanguageParser(tokens);

            ErrorManager errorManager = new ErrorManager();
            ErrorListener listener = new ErrorListener(errorManager);
            analex.removeErrorListeners();
            anasint.removeErrorListeners();
            analex.addErrorListener(listener);
            anasint.addErrorListener(listener);
            anasint.setErrorManager(errorManager);
            anasint.setErrorHandler(new ErrorRecuperationStrategy());



            try {
                ParseTree tree = anasint.prg();
                Trees.inspect(tree, anasint);
            } catch (Exception e) {
                errorManager.addError("ERROR SINTÁCTICO",
                        "El programa contiene una construcción no válida. Revisa comillas, paréntesis, " +
                                "ENDs y puntos y coma.");
                errorManager.printErrors();
            }
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage()); // input error
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage()); // error opening files
        } catch (RuntimeException e) {
            // other errors
            System.err.println("RUN " + e.getMessage()); // other errors
        }
    }
}