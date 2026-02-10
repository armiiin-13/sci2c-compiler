// Generated from C:/Users/armii/Documents/Universidad/Estructura_Datos_Avanzada/Exams/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SciLanguageParser}.
 */
public interface SciLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#axiom}.
	 * @param ctx the parse tree
	 */
	void enterAxiom(SciLanguageParser.AxiomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#axiom}.
	 * @param ctx the parse tree
	 */
	void exitAxiom(SciLanguageParser.AxiomContext ctx);
}