// Generated from C:/Users/armii/Documents/Universidad/Estructura_Datos_Avanzada/Exams/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SciLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SciLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(SciLanguageParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(SciLanguageParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#cabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecera(SciLanguageParser.CabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#cablist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCablist(SciLanguageParser.CablistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#decsubprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecsubprog(SciLanguageParser.DecsubprogContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(SciLanguageParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#sentlist2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist2(SciLanguageParser.Sentlist2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(SciLanguageParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#dcl2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl2(SciLanguageParser.Dcl2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(SciLanguageParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(SciLanguageParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(SciLanguageParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(SciLanguageParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(SciLanguageParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#charlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharlength(SciLanguageParser.CharlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(SciLanguageParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#varlist2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist2(SciLanguageParser.Varlist2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(SciLanguageParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#decproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecproc(SciLanguageParser.DecprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(SciLanguageParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#nomparamlist_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist_init(SciLanguageParser.Nomparamlist_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#nomparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist(SciLanguageParser.NomparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_s_paramlist(SciLanguageParser.Dec_s_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#tipoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoparam(SciLanguageParser.TipoparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#decfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfun(SciLanguageParser.DecfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#dec_fd_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_fd_paramlist(SciLanguageParser.Dec_fd_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#dec_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_paramlist(SciLanguageParser.Dec_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(SciLanguageParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SciLanguageParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(SciLanguageParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SciLanguageParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(SciLanguageParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SciLanguageParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor2(SciLanguageParser.Factor2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(SciLanguageParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(SciLanguageParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SciLanguageParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(SciLanguageParser.SubpparamlistContext ctx);
}