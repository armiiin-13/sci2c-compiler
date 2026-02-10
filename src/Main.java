import java.io.*;
import org.antlr.v4.runtime.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        try{
            CharStream input = CharStreams.fromFileName("src/TestInput.txt");
            SciLanguageLexer analex = new SciLanguageLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            SciLanguageParser anasint = new SciLanguageParser(tokens);
            anasint.axiom();
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage()); // input error
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage()); // error opening files
        } catch (RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage()); // other errors
        }
    }
}