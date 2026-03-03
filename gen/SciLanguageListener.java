// Generated from C:/Users/armii/Documents/Universidad/Estructura_Datos_Avanzada/Exams/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SciLanguageParser}.
 */
public interface SciLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(SciLanguageParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(SciLanguageParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(SciLanguageParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(SciLanguageParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(SciLanguageParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(SciLanguageParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#cablist}.
	 * @param ctx the parse tree
	 */
	void enterCablist(SciLanguageParser.CablistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#cablist}.
	 * @param ctx the parse tree
	 */
	void exitCablist(SciLanguageParser.CablistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void enterDecsubprog(SciLanguageParser.DecsubprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void exitDecsubprog(SciLanguageParser.DecsubprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(SciLanguageParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(SciLanguageParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#sentlist2}.
	 * @param ctx the parse tree
	 */
	void enterSentlist2(SciLanguageParser.Sentlist2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#sentlist2}.
	 * @param ctx the parse tree
	 */
	void exitSentlist2(SciLanguageParser.Sentlist2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(SciLanguageParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(SciLanguageParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#dcl2}.
	 * @param ctx the parse tree
	 */
	void enterDcl2(SciLanguageParser.Dcl2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#dcl2}.
	 * @param ctx the parse tree
	 */
	void exitDcl2(SciLanguageParser.Dcl2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(SciLanguageParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(SciLanguageParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(SciLanguageParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(SciLanguageParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(SciLanguageParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(SciLanguageParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(SciLanguageParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(SciLanguageParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SciLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SciLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#charlength}.
	 * @param ctx the parse tree
	 */
	void enterCharlength(SciLanguageParser.CharlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#charlength}.
	 * @param ctx the parse tree
	 */
	void exitCharlength(SciLanguageParser.CharlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(SciLanguageParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(SciLanguageParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#varlist2}.
	 * @param ctx the parse tree
	 */
	void enterVarlist2(SciLanguageParser.Varlist2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#varlist2}.
	 * @param ctx the parse tree
	 */
	void exitVarlist2(SciLanguageParser.Varlist2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(SciLanguageParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(SciLanguageParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#decproc}.
	 * @param ctx the parse tree
	 */
	void enterDecproc(SciLanguageParser.DecprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#decproc}.
	 * @param ctx the parse tree
	 */
	void exitDecproc(SciLanguageParser.DecprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(SciLanguageParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(SciLanguageParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#nomparamlist_init}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist_init(SciLanguageParser.Nomparamlist_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#nomparamlist_init}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist_init(SciLanguageParser.Nomparamlist_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist(SciLanguageParser.NomparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist(SciLanguageParser.NomparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_s_paramlist(SciLanguageParser.Dec_s_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_s_paramlist(SciLanguageParser.Dec_s_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void enterTipoparam(SciLanguageParser.TipoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void exitTipoparam(SciLanguageParser.TipoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#decfun}.
	 * @param ctx the parse tree
	 */
	void enterDecfun(SciLanguageParser.DecfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#decfun}.
	 * @param ctx the parse tree
	 */
	void exitDecfun(SciLanguageParser.DecfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist(SciLanguageParser.Dec_f_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist(SciLanguageParser.Dec_f_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#dec_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_paramlist(SciLanguageParser.Dec_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#dec_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_paramlist(SciLanguageParser.Dec_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(SciLanguageParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(SciLanguageParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SciLanguageParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SciLanguageParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(SciLanguageParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(SciLanguageParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(SciLanguageParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(SciLanguageParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(SciLanguageParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(SciLanguageParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SciLanguageParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SciLanguageParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#factor2}.
	 * @param ctx the parse tree
	 */
	void enterFactor2(SciLanguageParser.Factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#factor2}.
	 * @param ctx the parse tree
	 */
	void exitFactor2(SciLanguageParser.Factor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(SciLanguageParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(SciLanguageParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(SciLanguageParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(SciLanguageParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(SciLanguageParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(SciLanguageParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void enterSubproglist(SciLanguageParser.SubproglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void exitSubproglist(SciLanguageParser.SubproglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#codproc}.
	 * @param ctx the parse tree
	 */
	void enterCodproc(SciLanguageParser.CodprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#codproc}.
	 * @param ctx the parse tree
	 */
	void exitCodproc(SciLanguageParser.CodprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#codfun}.
	 * @param ctx the parse tree
	 */
	void enterCodfun(SciLanguageParser.CodfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#codfun}.
	 * @param ctx the parse tree
	 */
	void exitCodfun(SciLanguageParser.CodfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(SciLanguageParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(SciLanguageParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#if_then}.
	 * @param ctx the parse tree
	 */
	void enterIf_then(SciLanguageParser.If_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#if_then}.
	 * @param ctx the parse tree
	 */
	void exitIf_then(SciLanguageParser.If_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#then_else}.
	 * @param ctx the parse tree
	 */
	void enterThen_else(SciLanguageParser.Then_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#then_else}.
	 * @param ctx the parse tree
	 */
	void exitThen_else(SciLanguageParser.Then_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#do_body}.
	 * @param ctx the parse tree
	 */
	void enterDo_body(SciLanguageParser.Do_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#do_body}.
	 * @param ctx the parse tree
	 */
	void exitDo_body(SciLanguageParser.Do_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#doval}.
	 * @param ctx the parse tree
	 */
	void enterDoval(SciLanguageParser.DovalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#doval}.
	 * @param ctx the parse tree
	 */
	void exitDoval(SciLanguageParser.DovalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(SciLanguageParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(SciLanguageParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#casos2}.
	 * @param ctx the parse tree
	 */
	void enterCasos2(SciLanguageParser.Casos2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#casos2}.
	 * @param ctx the parse tree
	 */
	void exitCasos2(SciLanguageParser.Casos2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(SciLanguageParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(SciLanguageParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#etiquetas2}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas2(SciLanguageParser.Etiquetas2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#etiquetas2}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas2(SciLanguageParser.Etiquetas2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#etiquetas3}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas3(SciLanguageParser.Etiquetas3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#etiquetas3}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas3(SciLanguageParser.Etiquetas3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SciLanguageParser#listaetiqetas}.
	 * @param ctx the parse tree
	 */
	void enterListaetiqetas(SciLanguageParser.ListaetiqetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SciLanguageParser#listaetiqetas}.
	 * @param ctx the parse tree
	 */
	void exitListaetiqetas(SciLanguageParser.ListaetiqetasContext ctx);
}