// Generated from C:/Users/armii/Documents/Universidad/Procesadores_Lenguajes/Compiler_Sci2C/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2

    import entity.error.*;
    import entity.program.*;
    import entity.routine.*;
    import entity.statement.*;
    import entity.statement.conditional.*;
    import entity.statement.switchcase.*;
    import entity.util.Tuple;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SciLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, IDENT=49, NUM_INT_CONST=50, NUM_REAL_CONST=51, 
		STRING_CONST=52, COMMENTARY=53, TABS=54, NUM_INT_CONST_B=55, NUM_INT_CONST_O=56, 
		NUM_INT_CONST_H=57;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_cabecera = 2, RULE_cablist = 3, RULE_decsubprog = 4, 
		RULE_sentlist = 5, RULE_sentlist2 = 6, RULE_dcl = 7, RULE_dcl2 = 8, RULE_defcte = 9, 
		RULE_ctelist = 10, RULE_simpvalue = 11, RULE_defvar = 12, RULE_tipo = 13, 
		RULE_charlength = 14, RULE_varlist = 15, RULE_varlist2 = 16, RULE_init = 17, 
		RULE_decproc = 18, RULE_formal_paramlist = 19, RULE_nomparamlist_init = 20, 
		RULE_nomparamlist = 21, RULE_dec_s_paramlist = 22, RULE_tipoparam = 23, 
		RULE_decfun = 24, RULE_dec_f_paramlist = 25, RULE_sent = 26, RULE_exp = 27, 
		RULE_exp2 = 28, RULE_op = 29, RULE_oparit = 30, RULE_factor = 31, RULE_factor2 = 32, 
		RULE_explist = 33, RULE_proc_call = 34, RULE_subpparamlist = 35, RULE_actual_params = 36, 
		RULE_actual_params_tail = 37, RULE_subproglist = 38, RULE_codproc = 39, 
		RULE_codfun = 40, RULE_expcond = 41, RULE_expcond2 = 42, RULE_oplog = 43, 
		RULE_factorcond = 44, RULE_opcomp = 45, RULE_if_then = 46, RULE_then_else = 47, 
		RULE_do_body = 48, RULE_doval = 49, RULE_casos = 50, RULE_casos2 = 51, 
		RULE_etiquetas = 52, RULE_etiquetas2 = 53, RULE_etiquetas3 = 54, RULE_listaetiquetas = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "sentlist2", 
			"dcl", "dcl2", "defcte", "ctelist", "simpvalue", "defvar", "tipo", "charlength", 
			"varlist", "varlist2", "init", "decproc", "formal_paramlist", "nomparamlist_init", 
			"nomparamlist", "dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", 
			"sent", "exp", "exp2", "op", "oparit", "factor", "factor2", "explist", 
			"proc_call", "subpparamlist", "actual_params", "actual_params_tail", 
			"subproglist", "codproc", "codfun", "expcond", "expcond2", "oplog", "factorcond", 
			"opcomp", "if_then", "then_else", "do_body", "doval", "casos", "casos2", 
			"etiquetas", "etiquetas2", "etiquetas3", "listaetiquetas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'END'", "'INTERFACE'", "','", "'PARAMETER'", 
			"'::'", "'='", "'INTEGER'", "'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", 
			"'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", "'IF'", "'DO'", 
			"'SELECT'", "'CASE'", "'+'", "'-'", "'*'", "'/'", "'CALL'", "'.OR.'", 
			"'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'", "'.TRUE.'", "'.FALSE.'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'/='", "'THEN'", "'ENDIF'", "'ELSE'", 
			"'WHILE'", "'ENDDO'", "'DEFAULT'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENTARY", 
			"TABS", "NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SciLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ErrorManager errorManager;

	    public void setErrorManager(ErrorManager errorManager) {
	        this.errorManager = errorManager;
	    }

	public SciLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public Program p;
		public Token IDENT;
		public SentlistContext sentlist;
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__0);
			setState(113);
			((PrgContext)_localctx).IDENT = match(IDENT);
			setState(114);
			match(T__1);

			            ((PrgContext)_localctx).p =  new Program((((PrgContext)_localctx).IDENT!=null?((PrgContext)_localctx).IDENT.getText():null));
			       
			setState(116);
			dcllist(_localctx.p.getConstants(), _localctx.p.getMain().getLocalVariables());
			setState(117);
			cabecera(_localctx.p.getFunctions());
			setState(118);
			((PrgContext)_localctx).sentlist = sentlist(_localctx.p, null,null);

			            _localctx.p.getMain().setBlock(((PrgContext)_localctx).sentlist.body);
			       
			setState(120);
			match(T__2);
			setState(121);
			match(T__0);
			setState(122);
			((PrgContext)_localctx).IDENT = match(IDENT);
			setState(123);
			subproglist(_localctx.p);
			_localctx.p.exportProgram(errorManager);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public List<Constant> constants;
		public List<Tuple<String, List<Parameter>>> variables;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, List<Constant> constants, List<Tuple<String, List<Parameter>>> variables) {
			super(parent, invokingState);
			this.constants = constants;
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist(List<Constant> constants,List<Tuple<String, List<Parameter>>> variables) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), constants, variables);
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				dcl(_localctx.constants, _localctx.variables);
				setState(127);
				dcllist(_localctx.constants, _localctx.variables);
				}
				break;
			case T__3:
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CabeceraContext extends ParserRuleContext {
		public List<Function> functions;
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CabeceraContext(ParserRuleContext parent, int invokingState, List<Function> functions) {
			super(parent, invokingState);
			this.functions = functions;
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCabecera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCabecera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraContext cabecera(List<Function> functions) throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState(), functions);
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__3);
				setState(133);
				cablist(_localctx.functions);
				setState(134);
				match(T__2);
				setState(135);
				match(T__3);
				}
				break;
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CablistContext extends ParserRuleContext {
		public List<Function> functions;
		public DecprocContext decproc;
		public DecfunContext decfun;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CablistContext(ParserRuleContext parent, int invokingState, List<Function> functions) {
			super(parent, invokingState);
			this.functions = functions;
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCablist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCablist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CablistContext cablist(List<Function> functions) throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState(), functions);
		enterRule(_localctx, 6, RULE_cablist);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((CablistContext)_localctx).decproc = decproc();
				_localctx.functions.add(((CablistContext)_localctx).decproc.function);
				setState(142);
				decsubprog(_localctx.functions);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((CablistContext)_localctx).decfun = decfun();
				_localctx.functions.add(((CablistContext)_localctx).decfun.function);
				setState(146);
				decsubprog(_localctx.functions);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecsubprogContext extends ParserRuleContext {
		public List<Function> functions;
		public DecprocContext decproc;
		public DecfunContext decfun;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DecsubprogContext(ParserRuleContext parent, int invokingState, List<Function> functions) {
			super(parent, invokingState);
			this.functions = functions;
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDecsubprog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDecsubprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecsubprogContext decsubprog(List<Function> functions) throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState(), functions);
		enterRule(_localctx, 8, RULE_decsubprog);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((DecsubprogContext)_localctx).decproc = decproc();
				_localctx.functions.add(((DecsubprogContext)_localctx).decproc.function);
				setState(152);
				decsubprog(_localctx.functions);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((DecsubprogContext)_localctx).decfun = decfun();
				_localctx.functions.add(((DecsubprogContext)_localctx).decfun.function);
				setState(156);
				decsubprog(_localctx.functions);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public Body body;
		public SentContext sent;
		public Sentlist2Context sentlist2;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist(Program p,String funcName,Header funcHeader) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), p, funcName, funcHeader);
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((SentlistContext)_localctx).sent = sent(_localctx.p, _localctx.funcName, funcHeader);
			setState(162);
			((SentlistContext)_localctx).sentlist2 = sentlist2(_localctx.p, _localctx.funcName, funcHeader);

			    ((SentlistContext)_localctx).body =  new Body();
			    _localctx.body.addSentence(((SentlistContext)_localctx).sent.s);

			    if (((SentlistContext)_localctx).sentlist2.body != null) {
			        for (Sentence sen : ((SentlistContext)_localctx).sentlist2.body.getSentences()){
			            _localctx.body.addSentence(sen);
			        }
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentlist2Context extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public Body body;
		public SentContext sent;
		public Sentlist2Context sentlist2;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public Sentlist2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sentlist2Context(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_sentlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterSentlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitSentlist2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitSentlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist2Context sentlist2(Program p,String funcName,Header funcHeader) throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState(), p, funcName, funcHeader);
		enterRule(_localctx, 12, RULE_sentlist2);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((Sentlist2Context)_localctx).sent = sent(_localctx.p, _localctx.funcName, funcHeader);
				setState(166);
				((Sentlist2Context)_localctx).sentlist2 = sentlist2(_localctx.p, _localctx.funcName, funcHeader);

				        ((Sentlist2Context)_localctx).body =  new Body();
				        _localctx.body.addSentence(((Sentlist2Context)_localctx).sent.s);

				        if (((Sentlist2Context)_localctx).sentlist2.body != null){
				            for (Sentence sen : ((Sentlist2Context)_localctx).sentlist2.body.getSentences()){
				                _localctx.body.addSentence(sen);
				            }
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				        ((Sentlist2Context)_localctx).body =  new Body();
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public List<Constant> constants;
		public List<Tuple<String, List<Parameter>>> variables;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dcl2Context dcl2() {
			return getRuleContext(Dcl2Context.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DclContext(ParserRuleContext parent, int invokingState, List<Constant> constants, List<Tuple<String, List<Parameter>>> variables) {
			super(parent, invokingState);
			this.constants = constants;
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl(List<Constant> constants,List<Tuple<String, List<Parameter>>> variables) throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState(), constants, variables);
		enterRule(_localctx, 14, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((DclContext)_localctx).tipo = tipo();
			setState(173);
			dcl2(_localctx.constants, _localctx.variables, ((DclContext)_localctx).tipo.type);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dcl2Context extends ParserRuleContext {
		public List<Constant> constants;
		public List<Tuple<String, List<Parameter>>> variables;
		public String type;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public Dcl2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dcl2Context(ParserRuleContext parent, int invokingState, List<Constant> constants, List<Tuple<String, List<Parameter>>> variables, String type) {
			super(parent, invokingState);
			this.constants = constants;
			this.variables = variables;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_dcl2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDcl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDcl2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDcl2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl2Context dcl2(List<Constant> constants,List<Tuple<String, List<Parameter>>> variables,String type) throws RecognitionException {
		Dcl2Context _localctx = new Dcl2Context(_ctx, getState(), constants, variables, type);
		enterRule(_localctx, 16, RULE_dcl2);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				defcte(_localctx.constants);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				defvar(_localctx.variables, _localctx.type);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefcteContext extends ParserRuleContext {
		public List<Constant> constants;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefcteContext(ParserRuleContext parent, int invokingState, List<Constant> constants) {
			super(parent, invokingState);
			this.constants = constants;
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte(List<Constant> constants) throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState(), constants);
		enterRule(_localctx, 18, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__4);
			setState(180);
			match(T__5);
			setState(181);
			match(T__6);
			setState(182);
			((DefcteContext)_localctx).IDENT = match(IDENT);
			setState(183);
			match(T__7);
			setState(184);
			((DefcteContext)_localctx).simpvalue = simpvalue();

			                            Constant newConstant = new Constant(((DefcteContext)_localctx).simpvalue.value, (((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null));
			                            _localctx.constants.add(newConstant);
			                         
			setState(186);
			ctelist(_localctx.constants);
			setState(187);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public List<Constant> constants;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistContext(ParserRuleContext parent, int invokingState, List<Constant> constants) {
			super(parent, invokingState);
			this.constants = constants;
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist(List<Constant> constants) throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState(), constants);
		enterRule(_localctx, 20, RULE_ctelist);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__4);
				setState(190);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(191);
				match(T__7);
				setState(192);
				((CtelistContext)_localctx).simpvalue = simpvalue();

				                            Constant newConstant = new Constant(((CtelistContext)_localctx).simpvalue.value, (((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null));
				                            _localctx.constants.add(newConstant);
				                         
				setState(194);
				ctelist(_localctx.constants);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public String value;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(SciLanguageParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(SciLanguageParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(SciLanguageParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(SciLanguageParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(SciLanguageParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(SciLanguageParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpvalue);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null);
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null);
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarContext extends ParserRuleContext {
		public List<Tuple<String, List<Parameter>>> variables;
		public String type;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarContext(ParserRuleContext parent, int invokingState, List<Tuple<String, List<Parameter>>> variables, String type) {
			super(parent, invokingState);
			this.variables = variables;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar(List<Tuple<String, List<Parameter>>> variables,String type) throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState(), variables, type);
		enterRule(_localctx, 24, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__6);
			setState(214);
			varlist(_localctx.variables, _localctx.type);
			setState(215);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public String type;
		public CharlengthContext charlength;
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__8);
				((TipoContext)_localctx).type =  "int";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__9);
				((TipoContext)_localctx).type =  "float";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__10);
				setState(222);
				((TipoContext)_localctx).charlength = charlength();
				((TipoContext)_localctx).type =  "char" + ((TipoContext)_localctx).charlength.length;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharlengthContext extends ParserRuleContext {
		public String length;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(SciLanguageParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCharlength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCharlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_charlength);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__11);
				setState(228);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(229);
				match(T__12);
				((CharlengthContext)_localctx).length =  "["+ (((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null) +"]";
				}
				break;
			case T__4:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				((CharlengthContext)_localctx).length =  "[]";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public List<Tuple<String, List<Parameter>>> variables;
		public String type;
		public Token IDENT;
		public InitContext init;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, List<Tuple<String, List<Parameter>>> variables, String type) {
			super(parent, invokingState);
			this.variables = variables;
			this.type = type;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist(List<Tuple<String, List<Parameter>>> variables,String type) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), variables, type);
		enterRule(_localctx, 30, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(235);
			((VarlistContext)_localctx).init = init(_localctx.type, (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null));

			    List<Parameter> parametros = new ArrayList<>();
			    parametros.add(((VarlistContext)_localctx).init.newParam);

			setState(237);
			varlist2(_localctx.variables, _localctx.type, parametros);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Varlist2Context extends ParserRuleContext {
		public List<Tuple<String, List<Parameter>>> variables;
		public String type;
		public List<Parameter> parametros;
		public Token IDENT;
		public InitContext init;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public Varlist2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Varlist2Context(ParserRuleContext parent, int invokingState, List<Tuple<String, List<Parameter>>> variables, String type, List<Parameter> parametros) {
			super(parent, invokingState);
			this.variables = variables;
			this.type = type;
			this.parametros = parametros;
		}
		@Override public int getRuleIndex() { return RULE_varlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterVarlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitVarlist2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitVarlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist2Context varlist2(List<Tuple<String, List<Parameter>>> variables,String type,List<Parameter> parametros) throws RecognitionException {
		Varlist2Context _localctx = new Varlist2Context(_ctx, getState(), variables, type, parametros);
		enterRule(_localctx, 32, RULE_varlist2);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__4);
				setState(240);
				((Varlist2Context)_localctx).IDENT = match(IDENT);
				setState(241);
				((Varlist2Context)_localctx).init = init(_localctx.type, (((Varlist2Context)_localctx).IDENT!=null?((Varlist2Context)_localctx).IDENT.getText():null));
				_localctx.parametros.add(((Varlist2Context)_localctx).init.newParam);
				setState(243);
				varlist2(_localctx.variables, _localctx.type, _localctx.parametros);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				variables.add(new Tuple<>(type,parametros));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public String type;
		public String name;
		public Parameter newParam;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitContext(ParserRuleContext parent, int invokingState, String type, String name) {
			super(parent, invokingState);
			this.type = type;
			this.name = name;
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init(String type,String name) throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState(), type, name);
		enterRule(_localctx, 34, RULE_init);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__7);
				setState(249);
				((InitContext)_localctx).simpvalue = simpvalue();
				 ((InitContext)_localctx).newParam =  new Parameter(type, name, ((InitContext)_localctx).simpvalue.value); 
				}
				break;
			case T__1:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				 ((InitContext)_localctx).newParam =  new Parameter(type, name); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecprocContext extends ParserRuleContext {
		public Function function;
		public Token id1;
		public Token id2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDecproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDecproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__13);
			setState(256);
			((DecprocContext)_localctx).id1 = match(IDENT);

			        ((DecprocContext)_localctx).function =  new Function(new Header("void", (((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null)), new Body());
			    
			setState(258);
			formal_paramlist(_localctx.function.getHeader());
			setState(259);
			dec_s_paramlist(_localctx.function.getHeader());
			setState(260);
			match(T__2);
			setState(261);
			match(T__13);
			setState(262);
			((DecprocContext)_localctx).id2 = match(IDENT);

			        if (! (((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null).equals((((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null))) {
			            errorManager.addError(
			                ((DecprocContext)_localctx).id2.getLine(),
			                ((DecprocContext)_localctx).id2.getCharPositionInLine(),
			                "IDENT de apertura (" + (((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null) + ") distinto del IDENT de cierre (" + (((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null) + ")"
			            );
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public Header header;
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState, Header header) {
			super(parent, invokingState);
			this.header = header;
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist(Header header) throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState(), header);
		enterRule(_localctx, 38, RULE_formal_paramlist);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__11);
				setState(266);
				nomparamlist_init(_localctx.header);
				setState(267);
				match(T__12);
				}
				break;
			case T__2:
			case T__8:
			case T__9:
			case T__10:
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nomparamlist_initContext extends ParserRuleContext {
		public Header header;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Nomparamlist_initContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Nomparamlist_initContext(ParserRuleContext parent, int invokingState, Header header) {
			super(parent, invokingState);
			this.header = header;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterNomparamlist_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitNomparamlist_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitNomparamlist_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nomparamlist_initContext nomparamlist_init(Header header) throws RecognitionException {
		Nomparamlist_initContext _localctx = new Nomparamlist_initContext(_ctx, getState(), header);
		enterRule(_localctx, 40, RULE_nomparamlist_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((Nomparamlist_initContext)_localctx).IDENT = match(IDENT);
			_localctx.header.addParam((((Nomparamlist_initContext)_localctx).IDENT!=null?((Nomparamlist_initContext)_localctx).IDENT.getText():null));
			setState(274);
			nomparamlist(_localctx.header);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NomparamlistContext extends ParserRuleContext {
		public Header header;
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NomparamlistContext(ParserRuleContext parent, int invokingState, Header header) {
			super(parent, invokingState);
			this.header = header;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitNomparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitNomparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistContext nomparamlist(Header header) throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState(), header);
		enterRule(_localctx, 42, RULE_nomparamlist);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__4);
				setState(277);
				nomparamlist_init(_localctx.header);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public Header header;
		public TipoContext tipo;
		public TipoparamContext tipoparam;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState, Header header) {
			super(parent, invokingState);
			this.header = header;
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDec_s_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDec_s_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist(Header header) throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState(), header);
		enterRule(_localctx, 44, RULE_dec_s_paramlist);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(282);
				match(T__4);
				setState(283);
				match(T__14);
				setState(284);
				match(T__11);
				setState(285);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(286);
				match(T__12);
				setState(287);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);

				        Parameter param = _localctx.header.getParam((((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), ((Dec_s_paramlistContext)_localctx).IDENT.getLine(), ((Dec_s_paramlistContext)_localctx).IDENT.getCharPositionInLine(), errorManager);
				        if (param != null){
				            param.setType(((Dec_s_paramlistContext)_localctx).tipo.type);
				            param.setPointer(((Dec_s_paramlistContext)_localctx).tipoparam.value);
				        }
				    
				setState(289);
				match(T__1);
				setState(290);
				dec_s_paramlist(_localctx.header);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoparamContext extends ParserRuleContext {
		public boolean value;
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitTipoparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitTipoparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipoparam);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__15);
				((TipoparamContext)_localctx).value =  false;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__16);
				((TipoparamContext)_localctx).value =  true;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(T__17);
				((TipoparamContext)_localctx).value =  true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecfunContext extends ParserRuleContext {
		public Function function;
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDecfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDecfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__18);
			setState(304);
			((DecfunContext)_localctx).id1 = match(IDENT);

			        ((DecfunContext)_localctx).function =  new Function(new Header((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null)), new Body());
			    
			setState(306);
			match(T__11);
			setState(307);
			nomparamlist_init(_localctx.function.getHeader());
			setState(308);
			match(T__12);
			setState(309);
			((DecfunContext)_localctx).tipo = tipo();
			setState(310);
			match(T__6);
			setState(311);
			match(IDENT);

			        _localctx.function.getHeader().setType(((DecfunContext)_localctx).tipo.type);
			    
			setState(313);
			match(T__1);
			setState(314);
			dec_f_paramlist(_localctx.function.getHeader());
			setState(315);
			match(T__2);
			setState(316);
			match(T__18);
			setState(317);
			((DecfunContext)_localctx).id2 = match(IDENT);

			        if (! (((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null).equals((((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null))){
			            errorManager.addError(
			                ((DecfunContext)_localctx).id2.getLine(),
			                ((DecfunContext)_localctx).id2.getCharPositionInLine(),
			                "IDENT de apertura (" + (((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null) + ") distinto del IDENT de cierre (" + (((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null) + ")"
			            );
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public Header header;
		public TipoContext tipo;
		public TipoparamContext tipoparam;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState, Header header) {
			super(parent, invokingState);
			this.header = header;
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDec_f_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDec_f_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist(Header header) throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState(), header);
		enterRule(_localctx, 50, RULE_dec_f_paramlist);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(321);
				match(T__4);
				setState(322);
				match(T__14);
				setState(323);
				match(T__11);
				setState(324);
				((Dec_f_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(325);
				match(T__12);
				setState(326);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(327);
				match(T__1);

				        Parameter param = _localctx.header.getParam((((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), ((Dec_f_paramlistContext)_localctx).IDENT.getLine(), ((Dec_f_paramlistContext)_localctx).IDENT.getCharPositionInLine(), errorManager);
				        if (param != null){
				            param.setType(((Dec_f_paramlistContext)_localctx).tipo.type);
				            param.setPointer(((Dec_f_paramlistContext)_localctx).tipoparam.value);
				        }
				    
				setState(329);
				dec_f_paramlist(_localctx.header);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

				        _localctx.header.checkIfNoTypeParam(_localctx.getStart().getLine(), _localctx.getStart().getCharPositionInLine(), errorManager);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public Sentence s;
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public If_thenContext if_then;
		public Do_bodyContext do_body;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public If_thenContext if_then() {
			return getRuleContext(If_thenContext.class,0);
		}
		public Do_bodyContext do_body() {
			return getRuleContext(Do_bodyContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent(Program p,String funcName,Header funcHeader) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), p, funcName, funcHeader);
		enterRule(_localctx, 52, RULE_sent);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(335);
				match(T__7);
				setState(336);
				((SentContext)_localctx).exp = exp(funcHeader);
				setState(337);
				match(T__1);

				        if (_localctx.funcName != null && (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null).equals(_localctx.funcName)) {
				            ((SentContext)_localctx).s =  new Sentence("return " + ((SentContext)_localctx).exp.code + ";");
				        } else {
				            String left;
				            if (_localctx.funcHeader != null && _localctx.funcHeader.isParameter((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null))){
				                Parameter param = _localctx.funcHeader.getParam((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null),((SentContext)_localctx).IDENT.getLine(), ((SentContext)_localctx).IDENT.getCharPositionInLine(), errorManager);
				                if (param != null && param.isPointer()){
				                    left = "*" + (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null);
				                } else {
				                    left = (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null);
				                }
				            } else {
				                left = (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null);
				            }

				            ((SentContext)_localctx).s =  new Sentence(left + " = " + ((SentContext)_localctx).exp.code + ";");
				        }

				    
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				((SentContext)_localctx).proc_call = proc_call(p);
				setState(341);
				match(T__1);

				        ((SentContext)_localctx).s =  new Sentence(((SentContext)_localctx).proc_call.code + ";");
				    
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(T__19);
				setState(345);
				match(T__11);
				setState(346);
				((SentContext)_localctx).expcond = expcond(_localctx.funcHeader);
				setState(347);
				match(T__12);
				setState(348);
				((SentContext)_localctx).if_then = if_then(_localctx.p, _localctx.funcName, _localctx.funcHeader, ((SentContext)_localctx).expcond.code);

				        ((SentContext)_localctx).s =  ((SentContext)_localctx).if_then.s;
				    
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(T__20);
				setState(352);
				((SentContext)_localctx).do_body = do_body(_localctx.p, _localctx.funcName, _localctx.funcHeader);

				        ((SentContext)_localctx).s =  ((SentContext)_localctx).do_body.s;
				    
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				match(T__21);
				setState(356);
				match(T__22);
				setState(357);
				match(T__11);
				setState(358);
				((SentContext)_localctx).exp = exp(_localctx.funcHeader);
				setState(359);
				match(T__12);

				        Switch switchSentence = new Switch(((SentContext)_localctx).exp.code);
				    
				setState(361);
				casos(_localctx.p, _localctx.funcName, _localctx.funcHeader, switchSentence);
				setState(362);
				match(T__2);
				setState(363);
				match(T__21);

				        ((SentContext)_localctx).s =  switchSentence;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public FactorContext factor;
		public Exp2Context exp2;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp(Header funcHeader) throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState(), funcHeader);
		enterRule(_localctx, 54, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((ExpContext)_localctx).factor = factor(funcHeader);
			setState(369);
			((ExpContext)_localctx).exp2 = exp2(funcHeader);

			    ((ExpContext)_localctx).code =  ((ExpContext)_localctx).factor.code + ((ExpContext)_localctx).exp2.code;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp2Context extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public OpContext op;
		public FactorContext factor;
		public Exp2Context exp2;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp2Context(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2(Header funcHeader) throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState(), funcHeader);
		enterRule(_localctx, 56, RULE_exp2);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				((Exp2Context)_localctx).op = op();
				setState(373);
				((Exp2Context)_localctx).factor = factor(funcHeader);
				setState(374);
				((Exp2Context)_localctx).exp2 = exp2(funcHeader);

				    ((Exp2Context)_localctx).code =  " " + (((Exp2Context)_localctx).op!=null?_input.getText(((Exp2Context)_localctx).op.start,((Exp2Context)_localctx).op.stop):null) + " " + ((Exp2Context)_localctx).factor.code + ((Exp2Context)_localctx).exp2.code;

				}
				break;
			case T__1:
			case T__4:
			case T__12:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{

				    ((Exp2Context)_localctx).code =  "";

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			oparit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitOparit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENT;
		public Factor2Context factor2;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public Factor2Context factor2() {
			return getRuleContext(Factor2Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor(Header funcHeader) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), funcHeader);
		enterRule(_localctx, 62, RULE_factor);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				((FactorContext)_localctx).simpvalue = simpvalue();

				    ((FactorContext)_localctx).code =  ((FactorContext)_localctx).simpvalue.value;

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__11);
				setState(388);
				((FactorContext)_localctx).exp = exp(funcHeader);
				setState(389);
				match(T__12);

				    ((FactorContext)_localctx).code =  "(" + ((FactorContext)_localctx).exp.code + ")";

				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(393);
				((FactorContext)_localctx).factor2 = factor2(funcHeader);

				    String name = (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null);
				    ((FactorContext)_localctx).code =  name + ((FactorContext)_localctx).factor2.code;
				    if (_localctx.funcHeader != null && _localctx.funcHeader.isParameter(name)){

				        Parameter param = _localctx.funcHeader.getParam(name,
				            ((FactorContext)_localctx).IDENT.getLine(), ((FactorContext)_localctx).IDENT.getCharPositionInLine(), errorManager);

				        if (param != null && param.isPointer() && ((FactorContext)_localctx).factor2.code.equals("")){
				            ((FactorContext)_localctx).code =  "*" + name;
				        }

				    } else {
				        ((FactorContext)_localctx).code =  name + ((FactorContext)_localctx).factor2.code;
				    }

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor2Context extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Factor2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Factor2Context(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitFactor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitFactor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor2Context factor2(Header funcHeader) throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState(), funcHeader);
		enterRule(_localctx, 64, RULE_factor2);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__11);
				setState(399);
				((Factor2Context)_localctx).exp = exp(funcHeader);
				setState(400);
				((Factor2Context)_localctx).explist = explist(funcHeader);
				setState(401);
				match(T__12);

				        ((Factor2Context)_localctx).code =  "(" + ((Factor2Context)_localctx).exp.code + ((Factor2Context)_localctx).explist.code + ")";
				    
				}
				break;
			case T__1:
			case T__4:
			case T__12:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{

				        ((Factor2Context)_localctx).code =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistContext(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist(Header funcHeader) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), funcHeader);
		enterRule(_localctx, 66, RULE_explist);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__4);
				setState(408);
				((ExplistContext)_localctx).exp = exp(funcHeader);
				setState(409);
				((ExplistContext)_localctx).explist = explist(_localctx.funcHeader);

				    ((ExplistContext)_localctx).code =  ", " + ((ExplistContext)_localctx).exp.code + ((ExplistContext)_localctx).explist.code;

				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{

				    ((ExplistContext)_localctx).code =  "";

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public Program p;
		public String code;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Proc_callContext(ParserRuleContext parent, int invokingState, Program p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call(Program p) throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState(), p);
		enterRule(_localctx, 68, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__27);
			setState(416);
			((Proc_callContext)_localctx).IDENT = match(IDENT);

			    Function function = _localctx.p.getFunction((((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null));
			    Header funcHeader = function != null ? function.getHeader() : null;

			setState(418);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist(funcHeader);

			    ((Proc_callContext)_localctx).code =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + ((Proc_callContext)_localctx).subpparamlist.code;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubpparamlistContext extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public Actual_paramsContext actual_params;
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist(Header funcHeader) throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState(), funcHeader);
		enterRule(_localctx, 70, RULE_subpparamlist);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(T__11);
				setState(422);
				((SubpparamlistContext)_localctx).actual_params = actual_params(funcHeader, 0);
				setState(423);
				match(T__12);

				        ((SubpparamlistContext)_localctx).code =  "(" + ((SubpparamlistContext)_localctx).actual_params.code + ")";
				    
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{

				        ((SubpparamlistContext)_localctx).code =  "()";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_paramsContext extends ParserRuleContext {
		public Header funcHeader;
		public int idx;
		public String code;
		public ExpContext exp;
		public Actual_params_tailContext actual_params_tail;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Actual_params_tailContext actual_params_tail() {
			return getRuleContext(Actual_params_tailContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Actual_paramsContext(ParserRuleContext parent, int invokingState, Header funcHeader, int idx) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
			this.idx = idx;
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitActual_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitActual_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_paramsContext actual_params(Header funcHeader,int idx) throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState(), funcHeader, idx);
		enterRule(_localctx, 72, RULE_actual_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			((Actual_paramsContext)_localctx).exp = exp(null);
			setState(430);
			((Actual_paramsContext)_localctx).actual_params_tail = actual_params_tail(funcHeader, idx + 1);

			        String arg = ((Actual_paramsContext)_localctx).exp.code;

			        if (arg.startsWith("'") && arg.endsWith("'")) {
			            arg = "\"" + arg.substring(1, arg.length() - 1) + "\"";
			        }

			        if (funcHeader != null
			            && funcHeader.getParams().get(idx).isPointer()) {
			            arg = "&" + arg;
			        }

			        ((Actual_paramsContext)_localctx).code =  arg + ((Actual_paramsContext)_localctx).actual_params_tail.code;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Actual_params_tailContext extends ParserRuleContext {
		public Header funcHeader;
		public int idx;
		public String code;
		public ExpContext exp;
		public Actual_params_tailContext actual_params_tail;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Actual_params_tailContext actual_params_tail() {
			return getRuleContext(Actual_params_tailContext.class,0);
		}
		public Actual_params_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Actual_params_tailContext(ParserRuleContext parent, int invokingState, Header funcHeader, int idx) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
			this.idx = idx;
		}
		@Override public int getRuleIndex() { return RULE_actual_params_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterActual_params_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitActual_params_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitActual_params_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_params_tailContext actual_params_tail(Header funcHeader,int idx) throws RecognitionException {
		Actual_params_tailContext _localctx = new Actual_params_tailContext(_ctx, getState(), funcHeader, idx);
		enterRule(_localctx, 74, RULE_actual_params_tail);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__4);
				setState(434);
				((Actual_params_tailContext)_localctx).exp = exp(null);
				setState(435);
				((Actual_params_tailContext)_localctx).actual_params_tail = actual_params_tail(funcHeader, idx + 1);

				        String arg = ((Actual_params_tailContext)_localctx).exp.code;

				        if (arg.startsWith("'") && arg.endsWith("'")) {
				            arg = "\"" + arg.substring(1, arg.length() - 1) + "\"";
				        }

				        if (funcHeader != null
				            && funcHeader.getParams().get(idx).isPointer()) {
				            arg = "&" + arg;
				        }

				        ((Actual_params_tailContext)_localctx).code =  ", " + arg + ((Actual_params_tailContext)_localctx).actual_params_tail.code;
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{

				        ((Actual_params_tailContext)_localctx).code =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubproglistContext extends ParserRuleContext {
		public Program p;
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubproglistContext(ParserRuleContext parent, int invokingState, Program p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitSubproglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitSubproglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubproglistContext subproglist(Program p) throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState(), p);
		enterRule(_localctx, 76, RULE_subproglist);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				codproc(_localctx.p);
				setState(442);
				subproglist(_localctx.p);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				codfun(_localctx.p);
				setState(445);
				subproglist(_localctx.p);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodprocContext extends ParserRuleContext {
		public Program p;
		public Token beginId;
		public SentlistContext sentlist;
		public Token endId;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodprocContext(ParserRuleContext parent, int invokingState, Program p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCodproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCodproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodprocContext codproc(Program p) throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState(), p);
		enterRule(_localctx, 78, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__13);
			setState(451);
			((CodprocContext)_localctx).beginId = match(IDENT);

			    Function func = _localctx.p.getFunction((((CodprocContext)_localctx).beginId!=null?((CodprocContext)_localctx).beginId.getText():null));
			    if (func == null) {
			        func = new Function(new Header("void", (((CodprocContext)_localctx).beginId!=null?((CodprocContext)_localctx).beginId.getText():null)), new Body());
			        _localctx.p.getFunctions().add(func);
			    }

			setState(453);
			formal_paramlist(func.getHeader());
			setState(454);
			dec_s_paramlist(func.getHeader());
			setState(455);
			dcllist(new ArrayList<Constant>(), func.getLocalVariables());
			setState(456);
			((CodprocContext)_localctx).sentlist = sentlist(_localctx.p, null,func.getHeader());
			func.setBlock(((CodprocContext)_localctx).sentlist.body);
			setState(458);
			match(T__2);
			setState(459);
			match(T__13);
			setState(460);
			((CodprocContext)_localctx).endId = match(IDENT);

			        if(!(((CodprocContext)_localctx).beginId!=null?((CodprocContext)_localctx).beginId.getText():null).equals((((CodprocContext)_localctx).endId!=null?((CodprocContext)_localctx).endId.getText():null))){
			            errorManager.addError(
			                ((CodprocContext)_localctx).endId.getLine(),
			                ((CodprocContext)_localctx).endId.getCharPositionInLine(),
			                "IDENT de apertura (" + (((CodprocContext)_localctx).beginId!=null?((CodprocContext)_localctx).beginId.getText():null) + ") distinto del IDENT de cierre (" + (((CodprocContext)_localctx).endId!=null?((CodprocContext)_localctx).endId.getText():null) + ")"
			            );
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodfunContext extends ParserRuleContext {
		public Program p;
		public Token beginId;
		public TipoContext tipo;
		public SentlistContext sentlist;
		public Token returnId;
		public ExpContext exp;
		public Token endId;
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodfunContext(ParserRuleContext parent, int invokingState, Program p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCodfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCodfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodfunContext codfun(Program p) throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState(), p);
		enterRule(_localctx, 80, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__18);
			setState(464);
			((CodfunContext)_localctx).beginId = match(IDENT);

			        Function func = _localctx.p.getFunction((((CodfunContext)_localctx).beginId!=null?((CodfunContext)_localctx).beginId.getText():null));

			        if (func == null) {
			            func = new Function(new Header((((CodfunContext)_localctx).beginId!=null?((CodfunContext)_localctx).beginId.getText():null)), new Body());
			            _localctx.p.getFunctions().add(func);
			        }
			    
			setState(466);
			match(T__11);
			setState(467);
			nomparamlist_init(func.getHeader());
			setState(468);
			match(T__12);
			setState(469);
			((CodfunContext)_localctx).tipo = tipo();
			setState(470);
			match(T__6);
			setState(471);
			match(IDENT);

			        func.getHeader().setType(((CodfunContext)_localctx).tipo.type);
			    
			setState(473);
			match(T__1);
			setState(474);
			dec_f_paramlist(func.getHeader());
			setState(475);
			dcllist(new ArrayList<Constant>(), func.getLocalVariables());
			setState(476);
			((CodfunContext)_localctx).sentlist = sentlist(_localctx.p, (((CodfunContext)_localctx).beginId!=null?((CodfunContext)_localctx).beginId.getText():null), func.getHeader());

			        func.setBlock(((CodfunContext)_localctx).sentlist.body);
			    
			setState(478);
			((CodfunContext)_localctx).returnId = match(IDENT);
			setState(479);
			match(T__7);
			setState(480);
			((CodfunContext)_localctx).exp = exp(func.getHeader());
			func.getBlock().addSentence(new Sentence("return " + ((CodfunContext)_localctx).exp.code + ";"));
			setState(482);
			match(T__1);
			setState(483);
			match(T__2);
			setState(484);
			match(T__18);
			setState(485);
			((CodfunContext)_localctx).endId = match(IDENT);

			        if(!(((CodfunContext)_localctx).beginId!=null?((CodfunContext)_localctx).beginId.getText():null).equals((((CodfunContext)_localctx).endId!=null?((CodfunContext)_localctx).endId.getText():null))){
			            errorManager.addError(
			                ((CodfunContext)_localctx).endId.getLine(),
			                ((CodfunContext)_localctx).endId.getCharPositionInLine(),
			                "IDENT de apertura (" + (((CodfunContext)_localctx).beginId!=null?((CodfunContext)_localctx).beginId.getText():null) + ") distinto del IDENT de cierre (" + (((CodfunContext)_localctx).endId!=null?((CodfunContext)_localctx).endId.getText():null) + ")"
			            );
			        }
			        if(! (((CodfunContext)_localctx).returnId!=null?((CodfunContext)_localctx).returnId.getText():null).equals((((CodfunContext)_localctx).endId!=null?((CodfunContext)_localctx).endId.getText():null))){
			            errorManager.addError(
			                ((CodfunContext)_localctx).returnId.getLine(),
			                ((CodfunContext)_localctx).returnId.getCharPositionInLine(),
			                "IDENT del valor de retorno (" + (((CodfunContext)_localctx).returnId!=null?((CodfunContext)_localctx).returnId.getText():null) + ") distinto del IDENT de nombre de la función (" + (((CodfunContext)_localctx).endId!=null?((CodfunContext)_localctx).endId.getText():null) + ")"
			            );
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public FactorcondContext factorcond;
		public Expcond2Context expcond2;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond2Context expcond2() {
			return getRuleContext(Expcond2Context.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpcondContext(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond(Header funcHeader) throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState(), funcHeader);
		enterRule(_localctx, 82, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			((ExpcondContext)_localctx).factorcond = factorcond(_localctx.funcHeader);
			setState(489);
			((ExpcondContext)_localctx).expcond2 = expcond2(_localctx.funcHeader);

			        ((ExpcondContext)_localctx).code =  ((ExpcondContext)_localctx).factorcond.code + ((ExpcondContext)_localctx).expcond2.code;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expcond2Context extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public OplogContext oplog;
		public FactorcondContext factorcond;
		public Expcond2Context expcond2;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond2Context expcond2() {
			return getRuleContext(Expcond2Context.class,0);
		}
		public Expcond2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expcond2Context(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_expcond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterExpcond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitExpcond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitExpcond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond2Context expcond2(Header funcHeader) throws RecognitionException {
		Expcond2Context _localctx = new Expcond2Context(_ctx, getState(), funcHeader);
		enterRule(_localctx, 84, RULE_expcond2);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				((Expcond2Context)_localctx).oplog = oplog();
				setState(493);
				((Expcond2Context)_localctx).factorcond = factorcond(_localctx.funcHeader);
				setState(494);
				((Expcond2Context)_localctx).expcond2 = expcond2(_localctx.funcHeader);

				        ((Expcond2Context)_localctx).code =  " " + ((Expcond2Context)_localctx).oplog.code + " " + ((Expcond2Context)_localctx).factorcond.code + ((Expcond2Context)_localctx).expcond2.code;
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{

				        ((Expcond2Context)_localctx).code =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OplogContext extends ParserRuleContext {
		public String code;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_oplog);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(T__28);
				((OplogContext)_localctx).code =  "||";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(T__29);
				((OplogContext)_localctx).code =  "&&";
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(T__30);
				((OplogContext)_localctx).code =  "!^";
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				match(T__31);
				((OplogContext)_localctx).code =  "^";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public Header funcHeader;
		public String code;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorcondContext(ParserRuleContext parent, int invokingState, Header funcHeader) {
			super(parent, invokingState);
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond(Header funcHeader) throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState(), funcHeader);
		enterRule(_localctx, 88, RULE_factorcond);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				((FactorcondContext)_localctx).e1 = exp(_localctx.funcHeader);
				setState(511);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(512);
				((FactorcondContext)_localctx).e2 = exp(_localctx.funcHeader);

				        ((FactorcondContext)_localctx).code =  ((FactorcondContext)_localctx).e1.code + " " + ((FactorcondContext)_localctx).opcomp.code + " " + ((FactorcondContext)_localctx).e2.code;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(T__11);
				setState(516);
				((FactorcondContext)_localctx).expcond = expcond(_localctx.funcHeader);
				setState(517);
				match(T__12);

				        ((FactorcondContext)_localctx).code =  "(" + ((FactorcondContext)_localctx).expcond.code + ")";
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(T__32);
				setState(521);
				((FactorcondContext)_localctx).factorcond = factorcond(_localctx.funcHeader);

				        ((FactorcondContext)_localctx).code =  "!" + ((FactorcondContext)_localctx).factorcond.code;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				match(T__33);
				((FactorcondContext)_localctx).code =  "1";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526);
				match(T__34);
				((FactorcondContext)_localctx).code =  "0";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public String code;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_opcomp);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(T__35);
				((OpcompContext)_localctx).code =  "<";
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(T__36);
				((OpcompContext)_localctx).code =  ">";
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				match(T__37);
				((OpcompContext)_localctx).code =  "<=";
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				match(T__38);
				((OpcompContext)_localctx).code =  ">=";
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(538);
				match(T__39);
				((OpcompContext)_localctx).code =  "==";
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(540);
				match(T__40);
				((OpcompContext)_localctx).code =  "!=";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_thenContext extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public String condition;
		public Sentence s;
		public SentContext sent;
		public SentlistContext sentlist;
		public Then_elseContext then_else;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public Then_elseContext then_else() {
			return getRuleContext(Then_elseContext.class,0);
		}
		public If_thenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_thenContext(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader, String condition) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
			this.condition = condition;
		}
		@Override public int getRuleIndex() { return RULE_if_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterIf_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitIf_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_thenContext if_then(Program p,String funcName,Header funcHeader,String condition) throws RecognitionException {
		If_thenContext _localctx = new If_thenContext(_ctx, getState(), p, funcName, funcHeader, condition);
		enterRule(_localctx, 92, RULE_if_then);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				((If_thenContext)_localctx).sent = sent(_localctx.p, _localctx.funcName, _localctx.funcHeader);

				        IfThenElse ifSentence = new IfThenElse(_localctx.condition);
				        Body ifBody = new Body();
				        ifBody.addSentence(((If_thenContext)_localctx).sent.s);
				        ifSentence.setIfBody(ifBody);
				        ((If_thenContext)_localctx).s =  ifSentence;
				    
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(T__41);
				setState(548);
				((If_thenContext)_localctx).sentlist = sentlist(_localctx.p, _localctx.funcName, _localctx.funcHeader);
				setState(549);
				((If_thenContext)_localctx).then_else = then_else(_localctx.p, _localctx.funcName, _localctx.funcHeader, _localctx.condition, ((If_thenContext)_localctx).sentlist.body);

				        ((If_thenContext)_localctx).s =  ((If_thenContext)_localctx).then_else.s;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Then_elseContext extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public String condition;
		public Body ifBody;
		public Sentence s;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public Then_elseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Then_elseContext(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader, String condition, Body ifBody) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
			this.condition = condition;
			this.ifBody = ifBody;
		}
		@Override public int getRuleIndex() { return RULE_then_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterThen_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitThen_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitThen_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_elseContext then_else(Program p,String funcName,Header funcHeader,String condition,Body ifBody) throws RecognitionException {
		Then_elseContext _localctx = new Then_elseContext(_ctx, getState(), p, funcName, funcHeader, condition, ifBody);
		enterRule(_localctx, 94, RULE_then_else);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(T__42);

				        IfThenElse ifSentence = new IfThenElse(_localctx.condition);
				        ifSentence.setIfBody(_localctx.ifBody);
				        ((Then_elseContext)_localctx).s =  ifSentence;
				    
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(T__43);
				setState(557);
				((Then_elseContext)_localctx).sentlist = sentlist(_localctx.p, _localctx.funcName, _localctx.funcHeader);
				setState(558);
				match(T__42);

				        IfThenElse ifSentence = new IfThenElse(_localctx.condition);
				        ifSentence.setIfBody(_localctx.ifBody);
				        ifSentence.setElseBody(((Then_elseContext)_localctx).sentlist.body);
				        ((Then_elseContext)_localctx).s =  ifSentence;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_bodyContext extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public Sentence s;
		public ExpcondContext expcond;
		public SentlistContext sentlist;
		public Token nameVariable;
		public DovalContext dStart;
		public DovalContext dEnd;
		public DovalContext dInc;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public Do_bodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Do_bodyContext(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
		}
		@Override public int getRuleIndex() { return RULE_do_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDo_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDo_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDo_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_bodyContext do_body(Program p,String funcName,Header funcHeader) throws RecognitionException {
		Do_bodyContext _localctx = new Do_bodyContext(_ctx, getState(), p, funcName, funcHeader);
		enterRule(_localctx, 96, RULE_do_body);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(T__44);
				setState(564);
				match(T__11);
				setState(565);
				((Do_bodyContext)_localctx).expcond = expcond(_localctx.funcHeader);
				setState(566);
				match(T__12);
				setState(567);
				((Do_bodyContext)_localctx).sentlist = sentlist(_localctx.p, _localctx.funcName, _localctx.funcHeader);
				setState(568);
				match(T__45);

				        While whileSentence = new While(((Do_bodyContext)_localctx).expcond.code);
				        whileSentence.setWhileBody(((Do_bodyContext)_localctx).sentlist.body);
				        ((Do_bodyContext)_localctx).s =  whileSentence;
				    
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				((Do_bodyContext)_localctx).nameVariable = match(IDENT);
				setState(572);
				match(T__7);
				setState(573);
				((Do_bodyContext)_localctx).dStart = doval();
				setState(574);
				match(T__4);
				setState(575);
				((Do_bodyContext)_localctx).dEnd = doval();
				setState(576);
				match(T__4);
				setState(577);
				((Do_bodyContext)_localctx).dInc = doval();
				setState(578);
				((Do_bodyContext)_localctx).sentlist = sentlist(_localctx.p, _localctx.funcName, _localctx.funcHeader);
				setState(579);
				match(T__45);

				        String inc;

				        if (((Do_bodyContext)_localctx).dInc.code != null) {
				            inc = ((Do_bodyContext)_localctx).dInc.code;
				        } else {
				            inc = "1";
				        }


				        For forSentence = new For((((Do_bodyContext)_localctx).nameVariable!=null?((Do_bodyContext)_localctx).nameVariable.getText():null), (((Do_bodyContext)_localctx).dStart!=null?_input.getText(((Do_bodyContext)_localctx).dStart.start,((Do_bodyContext)_localctx).dStart.stop):null), (((Do_bodyContext)_localctx).dEnd!=null?_input.getText(((Do_bodyContext)_localctx).dEnd.start,((Do_bodyContext)_localctx).dEnd.stop):null), inc);
				        forSentence.setForBody(((Do_bodyContext)_localctx).sentlist.body);
				        ((Do_bodyContext)_localctx).s =  forSentence;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DovalContext extends ParserRuleContext {
		public String code;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(SciLanguageParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDoval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDoval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_doval);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((DovalContext)_localctx).code =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				((DovalContext)_localctx).IDENT = match(IDENT);
				((DovalContext)_localctx).code =  (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasosContext extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public Switch switchSentence;
		public Casos2Context casos2() {
			return getRuleContext(Casos2Context.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CasosContext(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader, Switch switchSentence) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
			this.switchSentence = switchSentence;
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos(Program p,String funcName,Header funcHeader,Switch switchSentence) throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState(), p, funcName, funcHeader, switchSentence);
		enterRule(_localctx, 100, RULE_casos);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(T__22);
				setState(591);
				casos2(_localctx.p, _localctx.funcName, _localctx.funcHeader, _localctx.switchSentence);

				    
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Casos2Context extends ParserRuleContext {
		public Program p;
		public String funcName;
		public Header funcHeader;
		public Switch switchSentence;
		public EtiquetasContext etiquetas;
		public SentlistContext sentlist;
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public Casos2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Casos2Context(ParserRuleContext parent, int invokingState, Program p, String funcName, Header funcHeader, Switch switchSentence) {
			super(parent, invokingState);
			this.p = p;
			this.funcName = funcName;
			this.funcHeader = funcHeader;
			this.switchSentence = switchSentence;
		}
		@Override public int getRuleIndex() { return RULE_casos2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterCasos2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitCasos2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitCasos2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Casos2Context casos2(Program p,String funcName,Header funcHeader,Switch switchSentence) throws RecognitionException {
		Casos2Context _localctx = new Casos2Context(_ctx, getState(), p, funcName, funcHeader, switchSentence);
		enterRule(_localctx, 102, RULE_casos2);
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(T__11);
				setState(598);
				((Casos2Context)_localctx).etiquetas = etiquetas();
				setState(599);
				match(T__12);
				setState(600);
				((Casos2Context)_localctx).sentlist = sentlist(_localctx.p, _localctx.funcName, _localctx.funcHeader);

				        SwitchCase switchCase = new SwitchCase(((Casos2Context)_localctx).etiquetas.code);
				        switchCase.setBody(((Casos2Context)_localctx).sentlist.body);
				        _localctx.switchSentence.addCase(switchCase);
				    
				setState(602);
				casos(_localctx.p, _localctx.funcName, _localctx.funcHeader, _localctx.switchSentence);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(T__46);
				setState(605);
				((Casos2Context)_localctx).sentlist = sentlist(_localctx.p, _localctx.funcName, _localctx.funcHeader);

				        _localctx.switchSentence.getDefaultCase().setBody(((Casos2Context)_localctx).sentlist.body);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetasContext extends ParserRuleContext {
		public String code;
		public SimpvalueContext simpvalue;
		public Etiquetas2Context etiquetas2;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Etiquetas2Context etiquetas2() {
			return getRuleContext(Etiquetas2Context.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitEtiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_etiquetas);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(611);
				((EtiquetasContext)_localctx).etiquetas2 = etiquetas2();

				        if (((EtiquetasContext)_localctx).etiquetas2.code.equals("to_empty")) {
				            ((EtiquetasContext)_localctx).code =  "case > " + ((EtiquetasContext)_localctx).simpvalue.value;
				        } else {
				            ((EtiquetasContext)_localctx).code =  "case " + ((EtiquetasContext)_localctx).simpvalue.value + ((EtiquetasContext)_localctx).etiquetas2.code;
				        }
				    
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				match(T__47);
				setState(615);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();

				        ((EtiquetasContext)_localctx).code =  "case < " + ((EtiquetasContext)_localctx).simpvalue.value;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Etiquetas2Context extends ParserRuleContext {
		public String code;
		public ListaetiquetasContext listaetiquetas;
		public Etiquetas3Context etiquetas3;
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public Etiquetas3Context etiquetas3() {
			return getRuleContext(Etiquetas3Context.class,0);
		}
		public Etiquetas2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterEtiquetas2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitEtiquetas2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitEtiquetas2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Etiquetas2Context etiquetas2() throws RecognitionException {
		Etiquetas2Context _localctx = new Etiquetas2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_etiquetas2);
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				((Etiquetas2Context)_localctx).listaetiquetas = listaetiquetas();

				        ((Etiquetas2Context)_localctx).code =  ((Etiquetas2Context)_localctx).listaetiquetas.code;
				    
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(T__47);
				setState(624);
				((Etiquetas2Context)_localctx).etiquetas3 = etiquetas3();

				        if (((Etiquetas2Context)_localctx).etiquetas3.code.equals(""))
				            ((Etiquetas2Context)_localctx).code =  "to_empty";
				        else
				            ((Etiquetas2Context)_localctx).code =  " to " + ((Etiquetas2Context)_localctx).etiquetas3.code;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Etiquetas3Context extends ParserRuleContext {
		public String code;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Etiquetas3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterEtiquetas3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitEtiquetas3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitEtiquetas3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Etiquetas3Context etiquetas3() throws RecognitionException {
		Etiquetas3Context _localctx = new Etiquetas3Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_etiquetas3);
		try {
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				((Etiquetas3Context)_localctx).simpvalue = simpvalue();

				        ((Etiquetas3Context)_localctx).code =  ((Etiquetas3Context)_localctx).simpvalue.value;
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{

				        ((Etiquetas3Context)_localctx).code =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaetiquetasContext extends ParserRuleContext {
		public String code;
		public SimpvalueContext simpvalue;
		public ListaetiquetasContext listaetiquetas;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public ListaetiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterListaetiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitListaetiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitListaetiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_listaetiquetas);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(T__4);
				setState(636);
				((ListaetiquetasContext)_localctx).simpvalue = simpvalue();
				setState(637);
				((ListaetiquetasContext)_localctx).listaetiquetas = listaetiquetas();

				        ((ListaetiquetasContext)_localctx).code =  " ," + ((ListaetiquetasContext)_localctx).simpvalue.value + ((ListaetiquetasContext)_localctx).listaetiquetas.code;
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{

				        ((ListaetiquetasContext)_localctx).code =  "";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0284\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0083\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008b\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0095\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a0\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ab"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00b2"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00e2\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00e9\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00f7\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00fe\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u010f\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0118\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0126\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012e\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u014d\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u016f\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u017b\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u018d\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u0196\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u019e\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01ac\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01b8\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01c1"+
		"\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u01f3\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u01fd\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u0211\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u021f\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u0229\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u0232\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u0247\b0\u00011\u00011\u00011\u0001"+
		"1\u00031\u024d\b1\u00012\u00012\u00012\u00012\u00012\u00032\u0254\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00033\u0261\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u026b\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u0274\b5\u00016\u00016\u00016\u00016\u00036\u027a\b6\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00037\u0282\b7\u00017\u0000\u00008\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u0001\u0001\u0000\u0018"+
		"\u001b\u0287\u0000p\u0001\u0000\u0000\u0000\u0002\u0082\u0001\u0000\u0000"+
		"\u0000\u0004\u008a\u0001\u0000\u0000\u0000\u0006\u0094\u0001\u0000\u0000"+
		"\u0000\b\u009f\u0001\u0000\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000"+
		"\f\u00aa\u0001\u0000\u0000\u0000\u000e\u00ac\u0001\u0000\u0000\u0000\u0010"+
		"\u00b1\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000\u0000\u0000\u0014"+
		"\u00c5\u0001\u0000\u0000\u0000\u0016\u00d3\u0001\u0000\u0000\u0000\u0018"+
		"\u00d5\u0001\u0000\u0000\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c"+
		"\u00e8\u0001\u0000\u0000\u0000\u001e\u00ea\u0001\u0000\u0000\u0000 \u00f6"+
		"\u0001\u0000\u0000\u0000\"\u00fd\u0001\u0000\u0000\u0000$\u00ff\u0001"+
		"\u0000\u0000\u0000&\u010e\u0001\u0000\u0000\u0000(\u0110\u0001\u0000\u0000"+
		"\u0000*\u0117\u0001\u0000\u0000\u0000,\u0125\u0001\u0000\u0000\u0000."+
		"\u012d\u0001\u0000\u0000\u00000\u012f\u0001\u0000\u0000\u00002\u014c\u0001"+
		"\u0000\u0000\u00004\u016e\u0001\u0000\u0000\u00006\u0170\u0001\u0000\u0000"+
		"\u00008\u017a\u0001\u0000\u0000\u0000:\u017c\u0001\u0000\u0000\u0000<"+
		"\u017e\u0001\u0000\u0000\u0000>\u018c\u0001\u0000\u0000\u0000@\u0195\u0001"+
		"\u0000\u0000\u0000B\u019d\u0001\u0000\u0000\u0000D\u019f\u0001\u0000\u0000"+
		"\u0000F\u01ab\u0001\u0000\u0000\u0000H\u01ad\u0001\u0000\u0000\u0000J"+
		"\u01b7\u0001\u0000\u0000\u0000L\u01c0\u0001\u0000\u0000\u0000N\u01c2\u0001"+
		"\u0000\u0000\u0000P\u01cf\u0001\u0000\u0000\u0000R\u01e8\u0001\u0000\u0000"+
		"\u0000T\u01f2\u0001\u0000\u0000\u0000V\u01fc\u0001\u0000\u0000\u0000X"+
		"\u0210\u0001\u0000\u0000\u0000Z\u021e\u0001\u0000\u0000\u0000\\\u0228"+
		"\u0001\u0000\u0000\u0000^\u0231\u0001\u0000\u0000\u0000`\u0246\u0001\u0000"+
		"\u0000\u0000b\u024c\u0001\u0000\u0000\u0000d\u0253\u0001\u0000\u0000\u0000"+
		"f\u0260\u0001\u0000\u0000\u0000h\u026a\u0001\u0000\u0000\u0000j\u0273"+
		"\u0001\u0000\u0000\u0000l\u0279\u0001\u0000\u0000\u0000n\u0281\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u00051\u0000\u0000rs\u0005\u0002"+
		"\u0000\u0000st\u0006\u0000\uffff\uffff\u0000tu\u0003\u0002\u0001\u0000"+
		"uv\u0003\u0004\u0002\u0000vw\u0003\n\u0005\u0000wx\u0006\u0000\uffff\uffff"+
		"\u0000xy\u0005\u0003\u0000\u0000yz\u0005\u0001\u0000\u0000z{\u00051\u0000"+
		"\u0000{|\u0003L&\u0000|}\u0006\u0000\uffff\uffff\u0000}\u0001\u0001\u0000"+
		"\u0000\u0000~\u007f\u0003\u000e\u0007\u0000\u007f\u0080\u0003\u0002\u0001"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000"+
		"\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0003\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0004\u0000\u0000"+
		"\u0085\u0086\u0003\u0006\u0003\u0000\u0086\u0087\u0005\u0003\u0000\u0000"+
		"\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0005\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0003$\u0012\u0000\u008d\u008e\u0006\u0003\uffff\uffff\u0000"+
		"\u008e\u008f\u0003\b\u0004\u0000\u008f\u0095\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u00030\u0018\u0000\u0091\u0092\u0006\u0003\uffff\uffff\u0000\u0092"+
		"\u0093\u0003\b\u0004\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008c"+
		"\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u0007"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0003$\u0012\u0000\u0097\u0098\u0006"+
		"\u0004\uffff\uffff\u0000\u0098\u0099\u0003\b\u0004\u0000\u0099\u00a0\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u00030\u0018\u0000\u009b\u009c\u0006\u0004"+
		"\uffff\uffff\u0000\u009c\u009d\u0003\b\u0004\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0096\u0001\u0000"+
		"\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\t\u0001\u0000\u0000\u0000\u00a1\u00a2\u00034\u001a"+
		"\u0000\u00a2\u00a3\u0003\f\u0006\u0000\u00a3\u00a4\u0006\u0005\uffff\uffff"+
		"\u0000\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5\u00a6\u00034\u001a\u0000"+
		"\u00a6\u00a7\u0003\f\u0006\u0000\u00a7\u00a8\u0006\u0006\uffff\uffff\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u0006\u0006\uffff\uffff"+
		"\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\r\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u001a\r\u0000"+
		"\u00ad\u00ae\u0003\u0010\b\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0003\u0012\t\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u0011"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0006\u0000\u0000\u00b5\u00b6\u0005\u0007\u0000\u0000\u00b6\u00b7"+
		"\u00051\u0000\u0000\u00b7\u00b8\u0005\b\u0000\u0000\u00b8\u00b9\u0003"+
		"\u0016\u000b\u0000\u00b9\u00ba\u0006\t\uffff\uffff\u0000\u00ba\u00bb\u0003"+
		"\u0014\n\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc\u0013\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\u0005\u0000\u0000\u00be\u00bf\u00051\u0000"+
		"\u0000\u00bf\u00c0\u0005\b\u0000\u0000\u00c0\u00c1\u0003\u0016\u000b\u0000"+
		"\u00c1\u00c2\u0006\n\uffff\uffff\u0000\u00c2\u00c3\u0003\u0014\n\u0000"+
		"\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u0015\u0001\u0000\u0000\u0000\u00c7\u00c8\u00052\u0000\u0000\u00c8"+
		"\u00d4\u0006\u000b\uffff\uffff\u0000\u00c9\u00ca\u00053\u0000\u0000\u00ca"+
		"\u00d4\u0006\u000b\uffff\uffff\u0000\u00cb\u00cc\u00054\u0000\u0000\u00cc"+
		"\u00d4\u0006\u000b\uffff\uffff\u0000\u00cd\u00ce\u00057\u0000\u0000\u00ce"+
		"\u00d4\u0006\u000b\uffff\uffff\u0000\u00cf\u00d0\u00058\u0000\u0000\u00d0"+
		"\u00d4\u0006\u000b\uffff\uffff\u0000\u00d1\u00d2\u00059\u0000\u0000\u00d2"+
		"\u00d4\u0006\u000b\uffff\uffff\u0000\u00d3\u00c7\u0001\u0000\u0000\u0000"+
		"\u00d3\u00c9\u0001\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d3\u00cd\u0001\u0000\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u0017\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000"+
		"\u00d7\u00d8\u0005\u0002\u0000\u0000\u00d8\u0019\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\t\u0000\u0000\u00da\u00e2\u0006\r\uffff\uffff\u0000"+
		"\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00e2\u0006\r\uffff\uffff\u0000"+
		"\u00dd\u00de\u0005\u000b\u0000\u0000\u00de\u00df\u0003\u001c\u000e\u0000"+
		"\u00df\u00e0\u0006\r\uffff\uffff\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000"+
		"\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e2\u001b\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\f\u0000\u0000\u00e4\u00e5\u00052\u0000\u0000\u00e5"+
		"\u00e6\u0005\r\u0000\u0000\u00e6\u00e9\u0006\u000e\uffff\uffff\u0000\u00e7"+
		"\u00e9\u0006\u000e\uffff\uffff\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u001d\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u00051\u0000\u0000\u00eb\u00ec\u0003\"\u0011\u0000\u00ec"+
		"\u00ed\u0006\u000f\uffff\uffff\u0000\u00ed\u00ee\u0003 \u0010\u0000\u00ee"+
		"\u001f\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0005\u0000\u0000\u00f0"+
		"\u00f1\u00051\u0000\u0000\u00f1\u00f2\u0003\"\u0011\u0000\u00f2\u00f3"+
		"\u0006\u0010\uffff\uffff\u0000\u00f3\u00f4\u0003 \u0010\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0006\u0010\uffff\uffff\u0000\u00f6"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"!\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\b\u0000\u0000\u00f9\u00fa"+
		"\u0003\u0016\u000b\u0000\u00fa\u00fb\u0006\u0011\uffff\uffff\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fe\u0006\u0011\uffff\uffff\u0000"+
		"\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe#\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u000e\u0000\u0000\u0100"+
		"\u0101\u00051\u0000\u0000\u0101\u0102\u0006\u0012\uffff\uffff\u0000\u0102"+
		"\u0103\u0003&\u0013\u0000\u0103\u0104\u0003,\u0016\u0000\u0104\u0105\u0005"+
		"\u0003\u0000\u0000\u0105\u0106\u0005\u000e\u0000\u0000\u0106\u0107\u0005"+
		"1\u0000\u0000\u0107\u0108\u0006\u0012\uffff\uffff\u0000\u0108%\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\f\u0000\u0000\u010a\u010b\u0003(\u0014"+
		"\u0000\u010b\u010c\u0005\r\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000\u0000\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010f\'\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u00051\u0000\u0000\u0111\u0112\u0006\u0014\uffff\uffff\u0000\u0112"+
		"\u0113\u0003*\u0015\u0000\u0113)\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"\u0005\u0000\u0000\u0115\u0118\u0003(\u0014\u0000\u0116\u0118\u0001\u0000"+
		"\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0118+\u0001\u0000\u0000\u0000\u0119\u011a\u0003\u001a\r"+
		"\u0000\u011a\u011b\u0005\u0005\u0000\u0000\u011b\u011c\u0005\u000f\u0000"+
		"\u0000\u011c\u011d\u0005\f\u0000\u0000\u011d\u011e\u0003.\u0017\u0000"+
		"\u011e\u011f\u0005\r\u0000\u0000\u011f\u0120\u00051\u0000\u0000\u0120"+
		"\u0121\u0006\u0016\uffff\uffff\u0000\u0121\u0122\u0005\u0002\u0000\u0000"+
		"\u0122\u0123\u0003,\u0016\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0119\u0001\u0000\u0000\u0000\u0125"+
		"\u0124\u0001\u0000\u0000\u0000\u0126-\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0005\u0010\u0000\u0000\u0128\u012e\u0006\u0017\uffff\uffff\u0000\u0129"+
		"\u012a\u0005\u0011\u0000\u0000\u012a\u012e\u0006\u0017\uffff\uffff\u0000"+
		"\u012b\u012c\u0005\u0012\u0000\u0000\u012c\u012e\u0006\u0017\uffff\uffff"+
		"\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e/\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0005\u0013\u0000\u0000\u0130\u0131\u00051\u0000\u0000\u0131"+
		"\u0132\u0006\u0018\uffff\uffff\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133"+
		"\u0134\u0003(\u0014\u0000\u0134\u0135\u0005\r\u0000\u0000\u0135\u0136"+
		"\u0003\u001a\r\u0000\u0136\u0137\u0005\u0007\u0000\u0000\u0137\u0138\u0005"+
		"1\u0000\u0000\u0138\u0139\u0006\u0018\uffff\uffff\u0000\u0139\u013a\u0005"+
		"\u0002\u0000\u0000\u013a\u013b\u00032\u0019\u0000\u013b\u013c\u0005\u0003"+
		"\u0000\u0000\u013c\u013d\u0005\u0013\u0000\u0000\u013d\u013e\u00051\u0000"+
		"\u0000\u013e\u013f\u0006\u0018\uffff\uffff\u0000\u013f1\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0003\u001a\r\u0000\u0141\u0142\u0005\u0005\u0000\u0000"+
		"\u0142\u0143\u0005\u000f\u0000\u0000\u0143\u0144\u0005\f\u0000\u0000\u0144"+
		"\u0145\u0003.\u0017\u0000\u0145\u0146\u0005\r\u0000\u0000\u0146\u0147"+
		"\u00051\u0000\u0000\u0147\u0148\u0005\u0002\u0000\u0000\u0148\u0149\u0006"+
		"\u0019\uffff\uffff\u0000\u0149\u014a\u00032\u0019\u0000\u014a\u014d\u0001"+
		"\u0000\u0000\u0000\u014b\u014d\u0006\u0019\uffff\uffff\u0000\u014c\u0140"+
		"\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d3\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u00051\u0000\u0000\u014f\u0150\u0005\b"+
		"\u0000\u0000\u0150\u0151\u00036\u001b\u0000\u0151\u0152\u0005\u0002\u0000"+
		"\u0000\u0152\u0153\u0006\u001a\uffff\uffff\u0000\u0153\u016f\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0003D\"\u0000\u0155\u0156\u0005\u0002\u0000"+
		"\u0000\u0156\u0157\u0006\u001a\uffff\uffff\u0000\u0157\u016f\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0005\u0014\u0000\u0000\u0159\u015a\u0005\f\u0000"+
		"\u0000\u015a\u015b\u0003R)\u0000\u015b\u015c\u0005\r\u0000\u0000\u015c"+
		"\u015d\u0003\\.\u0000\u015d\u015e\u0006\u001a\uffff\uffff\u0000\u015e"+
		"\u016f\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0015\u0000\u0000\u0160"+
		"\u0161\u0003`0\u0000\u0161\u0162\u0006\u001a\uffff\uffff\u0000\u0162\u016f"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0016\u0000\u0000\u0164\u0165"+
		"\u0005\u0017\u0000\u0000\u0165\u0166\u0005\f\u0000\u0000\u0166\u0167\u0003"+
		"6\u001b\u0000\u0167\u0168\u0005\r\u0000\u0000\u0168\u0169\u0006\u001a"+
		"\uffff\uffff\u0000\u0169\u016a\u0003d2\u0000\u016a\u016b\u0005\u0003\u0000"+
		"\u0000\u016b\u016c\u0005\u0016\u0000\u0000\u016c\u016d\u0006\u001a\uffff"+
		"\uffff\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u014e\u0001\u0000"+
		"\u0000\u0000\u016e\u0154\u0001\u0000\u0000\u0000\u016e\u0158\u0001\u0000"+
		"\u0000\u0000\u016e\u015f\u0001\u0000\u0000\u0000\u016e\u0163\u0001\u0000"+
		"\u0000\u0000\u016f5\u0001\u0000\u0000\u0000\u0170\u0171\u0003>\u001f\u0000"+
		"\u0171\u0172\u00038\u001c\u0000\u0172\u0173\u0006\u001b\uffff\uffff\u0000"+
		"\u01737\u0001\u0000\u0000\u0000\u0174\u0175\u0003:\u001d\u0000\u0175\u0176"+
		"\u0003>\u001f\u0000\u0176\u0177\u00038\u001c\u0000\u0177\u0178\u0006\u001c"+
		"\uffff\uffff\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u017b\u0006"+
		"\u001c\uffff\uffff\u0000\u017a\u0174\u0001\u0000\u0000\u0000\u017a\u0179"+
		"\u0001\u0000\u0000\u0000\u017b9\u0001\u0000\u0000\u0000\u017c\u017d\u0003"+
		"<\u001e\u0000\u017d;\u0001\u0000\u0000\u0000\u017e\u017f\u0007\u0000\u0000"+
		"\u0000\u017f=\u0001\u0000\u0000\u0000\u0180\u0181\u0003\u0016\u000b\u0000"+
		"\u0181\u0182\u0006\u001f\uffff\uffff\u0000\u0182\u018d\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\f\u0000\u0000\u0184\u0185\u00036\u001b\u0000"+
		"\u0185\u0186\u0005\r\u0000\u0000\u0186\u0187\u0006\u001f\uffff\uffff\u0000"+
		"\u0187\u018d\u0001\u0000\u0000\u0000\u0188\u0189\u00051\u0000\u0000\u0189"+
		"\u018a\u0003@ \u0000\u018a\u018b\u0006\u001f\uffff\uffff\u0000\u018b\u018d"+
		"\u0001\u0000\u0000\u0000\u018c\u0180\u0001\u0000\u0000\u0000\u018c\u0183"+
		"\u0001\u0000\u0000\u0000\u018c\u0188\u0001\u0000\u0000\u0000\u018d?\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005\f\u0000\u0000\u018f\u0190\u00036"+
		"\u001b\u0000\u0190\u0191\u0003B!\u0000\u0191\u0192\u0005\r\u0000\u0000"+
		"\u0192\u0193\u0006 \uffff\uffff\u0000\u0193\u0196\u0001\u0000\u0000\u0000"+
		"\u0194\u0196\u0006 \uffff\uffff\u0000\u0195\u018e\u0001\u0000\u0000\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0196A\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005\u0005\u0000\u0000\u0198\u0199\u00036\u001b\u0000\u0199\u019a"+
		"\u0003B!\u0000\u019a\u019b\u0006!\uffff\uffff\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019e\u0006!\uffff\uffff\u0000\u019d\u0197\u0001"+
		"\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019eC\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0005\u001c\u0000\u0000\u01a0\u01a1\u00051\u0000"+
		"\u0000\u01a1\u01a2\u0006\"\uffff\uffff\u0000\u01a2\u01a3\u0003F#\u0000"+
		"\u01a3\u01a4\u0006\"\uffff\uffff\u0000\u01a4E\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0005\f\u0000\u0000\u01a6\u01a7\u0003H$\u0000\u01a7\u01a8"+
		"\u0005\r\u0000\u0000\u01a8\u01a9\u0006#\uffff\uffff\u0000\u01a9\u01ac"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ac\u0006#\uffff\uffff\u0000\u01ab\u01a5"+
		"\u0001\u0000\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01acG\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u00036\u001b\u0000\u01ae\u01af\u0003J%"+
		"\u0000\u01af\u01b0\u0006$\uffff\uffff\u0000\u01b0I\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0005\u0005\u0000\u0000\u01b2\u01b3\u00036\u001b\u0000\u01b3"+
		"\u01b4\u0003J%\u0000\u01b4\u01b5\u0006%\uffff\uffff\u0000\u01b5\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b8\u0006%\uffff\uffff\u0000\u01b7\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8K\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0003N\'\u0000\u01ba\u01bb\u0003L&\u0000"+
		"\u01bb\u01c1\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003P(\u0000\u01bd\u01be"+
		"\u0003L&\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c0\u01b9\u0001\u0000\u0000\u0000\u01c0\u01bc\u0001\u0000"+
		"\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1M\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005\u000e\u0000\u0000\u01c3\u01c4\u00051\u0000\u0000"+
		"\u01c4\u01c5\u0006\'\uffff\uffff\u0000\u01c5\u01c6\u0003&\u0013\u0000"+
		"\u01c6\u01c7\u0003,\u0016\u0000\u01c7\u01c8\u0003\u0002\u0001\u0000\u01c8"+
		"\u01c9\u0003\n\u0005\u0000\u01c9\u01ca\u0006\'\uffff\uffff\u0000\u01ca"+
		"\u01cb\u0005\u0003\u0000\u0000\u01cb\u01cc\u0005\u000e\u0000\u0000\u01cc"+
		"\u01cd\u00051\u0000\u0000\u01cd\u01ce\u0006\'\uffff\uffff\u0000\u01ce"+
		"O\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0013\u0000\u0000\u01d0\u01d1"+
		"\u00051\u0000\u0000\u01d1\u01d2\u0006(\uffff\uffff\u0000\u01d2\u01d3\u0005"+
		"\f\u0000\u0000\u01d3\u01d4\u0003(\u0014\u0000\u01d4\u01d5\u0005\r\u0000"+
		"\u0000\u01d5\u01d6\u0003\u001a\r\u0000\u01d6\u01d7\u0005\u0007\u0000\u0000"+
		"\u01d7\u01d8\u00051\u0000\u0000\u01d8\u01d9\u0006(\uffff\uffff\u0000\u01d9"+
		"\u01da\u0005\u0002\u0000\u0000\u01da\u01db\u00032\u0019\u0000\u01db\u01dc"+
		"\u0003\u0002\u0001\u0000\u01dc\u01dd\u0003\n\u0005\u0000\u01dd\u01de\u0006"+
		"(\uffff\uffff\u0000\u01de\u01df\u00051\u0000\u0000\u01df\u01e0\u0005\b"+
		"\u0000\u0000\u01e0\u01e1\u00036\u001b\u0000\u01e1\u01e2\u0006(\uffff\uffff"+
		"\u0000\u01e2\u01e3\u0005\u0002\u0000\u0000\u01e3\u01e4\u0005\u0003\u0000"+
		"\u0000\u01e4\u01e5\u0005\u0013\u0000\u0000\u01e5\u01e6\u00051\u0000\u0000"+
		"\u01e6\u01e7\u0006(\uffff\uffff\u0000\u01e7Q\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0003X,\u0000\u01e9\u01ea\u0003T*\u0000\u01ea\u01eb\u0006)\uffff"+
		"\uffff\u0000\u01ebS\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003V+\u0000"+
		"\u01ed\u01ee\u0003X,\u0000\u01ee\u01ef\u0003T*\u0000\u01ef\u01f0\u0006"+
		"*\uffff\uffff\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01f3\u0006"+
		"*\uffff\uffff\u0000\u01f2\u01ec\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3U\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u001d"+
		"\u0000\u0000\u01f5\u01fd\u0006+\uffff\uffff\u0000\u01f6\u01f7\u0005\u001e"+
		"\u0000\u0000\u01f7\u01fd\u0006+\uffff\uffff\u0000\u01f8\u01f9\u0005\u001f"+
		"\u0000\u0000\u01f9\u01fd\u0006+\uffff\uffff\u0000\u01fa\u01fb\u0005 \u0000"+
		"\u0000\u01fb\u01fd\u0006+\uffff\uffff\u0000\u01fc\u01f4\u0001\u0000\u0000"+
		"\u0000\u01fc\u01f6\u0001\u0000\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fdW\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u00036\u001b\u0000\u01ff\u0200\u0003Z-\u0000\u0200\u0201"+
		"\u00036\u001b\u0000\u0201\u0202\u0006,\uffff\uffff\u0000\u0202\u0211\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0005\f\u0000\u0000\u0204\u0205\u0003R"+
		")\u0000\u0205\u0206\u0005\r\u0000\u0000\u0206\u0207\u0006,\uffff\uffff"+
		"\u0000\u0207\u0211\u0001\u0000\u0000\u0000\u0208\u0209\u0005!\u0000\u0000"+
		"\u0209\u020a\u0003X,\u0000\u020a\u020b\u0006,\uffff\uffff\u0000\u020b"+
		"\u0211\u0001\u0000\u0000\u0000\u020c\u020d\u0005\"\u0000\u0000\u020d\u0211"+
		"\u0006,\uffff\uffff\u0000\u020e\u020f\u0005#\u0000\u0000\u020f\u0211\u0006"+
		",\uffff\uffff\u0000\u0210\u01fe\u0001\u0000\u0000\u0000\u0210\u0203\u0001"+
		"\u0000\u0000\u0000\u0210\u0208\u0001\u0000\u0000\u0000\u0210\u020c\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211Y\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0005$\u0000\u0000\u0213\u021f\u0006-\uffff\uffff"+
		"\u0000\u0214\u0215\u0005%\u0000\u0000\u0215\u021f\u0006-\uffff\uffff\u0000"+
		"\u0216\u0217\u0005&\u0000\u0000\u0217\u021f\u0006-\uffff\uffff\u0000\u0218"+
		"\u0219\u0005\'\u0000\u0000\u0219\u021f\u0006-\uffff\uffff\u0000\u021a"+
		"\u021b\u0005(\u0000\u0000\u021b\u021f\u0006-\uffff\uffff\u0000\u021c\u021d"+
		"\u0005)\u0000\u0000\u021d\u021f\u0006-\uffff\uffff\u0000\u021e\u0212\u0001"+
		"\u0000\u0000\u0000\u021e\u0214\u0001\u0000\u0000\u0000\u021e\u0216\u0001"+
		"\u0000\u0000\u0000\u021e\u0218\u0001\u0000\u0000\u0000\u021e\u021a\u0001"+
		"\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f[\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u00034\u001a\u0000\u0221\u0222\u0006.\uffff\uffff"+
		"\u0000\u0222\u0229\u0001\u0000\u0000\u0000\u0223\u0224\u0005*\u0000\u0000"+
		"\u0224\u0225\u0003\n\u0005\u0000\u0225\u0226\u0003^/\u0000\u0226\u0227"+
		"\u0006.\uffff\uffff\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0220"+
		"\u0001\u0000\u0000\u0000\u0228\u0223\u0001\u0000\u0000\u0000\u0229]\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0005+\u0000\u0000\u022b\u0232\u0006/\uffff"+
		"\uffff\u0000\u022c\u022d\u0005,\u0000\u0000\u022d\u022e\u0003\n\u0005"+
		"\u0000\u022e\u022f\u0005+\u0000\u0000\u022f\u0230\u0006/\uffff\uffff\u0000"+
		"\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u022a\u0001\u0000\u0000\u0000"+
		"\u0231\u022c\u0001\u0000\u0000\u0000\u0232_\u0001\u0000\u0000\u0000\u0233"+
		"\u0234\u0005-\u0000\u0000\u0234\u0235\u0005\f\u0000\u0000\u0235\u0236"+
		"\u0003R)\u0000\u0236\u0237\u0005\r\u0000\u0000\u0237\u0238\u0003\n\u0005"+
		"\u0000\u0238\u0239\u0005.\u0000\u0000\u0239\u023a\u00060\uffff\uffff\u0000"+
		"\u023a\u0247\u0001\u0000\u0000\u0000\u023b\u023c\u00051\u0000\u0000\u023c"+
		"\u023d\u0005\b\u0000\u0000\u023d\u023e\u0003b1\u0000\u023e\u023f\u0005"+
		"\u0005\u0000\u0000\u023f\u0240\u0003b1\u0000\u0240\u0241\u0005\u0005\u0000"+
		"\u0000\u0241\u0242\u0003b1\u0000\u0242\u0243\u0003\n\u0005\u0000\u0243"+
		"\u0244\u0005.\u0000\u0000\u0244\u0245\u00060\uffff\uffff\u0000\u0245\u0247"+
		"\u0001\u0000\u0000\u0000\u0246\u0233\u0001\u0000\u0000\u0000\u0246\u023b"+
		"\u0001\u0000\u0000\u0000\u0247a\u0001\u0000\u0000\u0000\u0248\u0249\u0005"+
		"2\u0000\u0000\u0249\u024d\u00061\uffff\uffff\u0000\u024a\u024b\u00051"+
		"\u0000\u0000\u024b\u024d\u00061\uffff\uffff\u0000\u024c\u0248\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024dc\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0005\u0017\u0000\u0000\u024f\u0250\u0003f3\u0000\u0250"+
		"\u0251\u00062\uffff\uffff\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252"+
		"\u0254\u0001\u0000\u0000\u0000\u0253\u024e\u0001\u0000\u0000\u0000\u0253"+
		"\u0252\u0001\u0000\u0000\u0000\u0254e\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005\f\u0000\u0000\u0256\u0257\u0003h4\u0000\u0257\u0258\u0005\r\u0000"+
		"\u0000\u0258\u0259\u0003\n\u0005\u0000\u0259\u025a\u00063\uffff\uffff"+
		"\u0000\u025a\u025b\u0003d2\u0000\u025b\u0261\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0005/\u0000\u0000\u025d\u025e\u0003\n\u0005\u0000\u025e\u025f"+
		"\u00063\uffff\uffff\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u0255"+
		"\u0001\u0000\u0000\u0000\u0260\u025c\u0001\u0000\u0000\u0000\u0261g\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0003\u0016\u000b\u0000\u0263\u0264\u0003"+
		"j5\u0000\u0264\u0265\u00064\uffff\uffff\u0000\u0265\u026b\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u00050\u0000\u0000\u0267\u0268\u0003\u0016\u000b"+
		"\u0000\u0268\u0269\u00064\uffff\uffff\u0000\u0269\u026b\u0001\u0000\u0000"+
		"\u0000\u026a\u0262\u0001\u0000\u0000\u0000\u026a\u0266\u0001\u0000\u0000"+
		"\u0000\u026bi\u0001\u0000\u0000\u0000\u026c\u026d\u0003n7\u0000\u026d"+
		"\u026e\u00065\uffff\uffff\u0000\u026e\u0274\u0001\u0000\u0000\u0000\u026f"+
		"\u0270\u00050\u0000\u0000\u0270\u0271\u0003l6\u0000\u0271\u0272\u0006"+
		"5\uffff\uffff\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u026c\u0001"+
		"\u0000\u0000\u0000\u0273\u026f\u0001\u0000\u0000\u0000\u0274k\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0003\u0016\u000b\u0000\u0276\u0277\u00066\uffff"+
		"\uffff\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u027a\u00066\uffff"+
		"\uffff\u0000\u0279\u0275\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000"+
		"\u0000\u0000\u027am\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u0005\u0000"+
		"\u0000\u027c\u027d\u0003\u0016\u000b\u0000\u027d\u027e\u0003n7\u0000\u027e"+
		"\u027f\u00067\uffff\uffff\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280"+
		"\u0282\u00067\uffff\uffff\u0000\u0281\u027b\u0001\u0000\u0000\u0000\u0281"+
		"\u0280\u0001\u0000\u0000\u0000\u0282o\u0001\u0000\u0000\u0000\'\u0082"+
		"\u008a\u0094\u009f\u00aa\u00b1\u00c5\u00d3\u00e1\u00e8\u00f6\u00fd\u010e"+
		"\u0117\u0125\u012d\u014c\u016e\u017a\u018c\u0195\u019d\u01ab\u01b7\u01c0"+
		"\u01f2\u01fc\u0210\u021e\u0228\u0231\u0246\u024c\u0253\u0260\u026a\u0273"+
		"\u0279\u0281";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}