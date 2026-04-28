// Generated from C:/Users/armii/Documents/Universidad/Procesadores_Lenguajes/Compiler_Sci2C/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2

    import entitiy.*;

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
		RULE_decfun = 24, RULE_dec_f_paramlist = 25, RULE_dec_paramlist = 26, 
		RULE_sent = 27, RULE_exp = 28, RULE_exp2 = 29, RULE_op = 30, RULE_oparit = 31, 
		RULE_factor = 32, RULE_factor2 = 33, RULE_explist = 34, RULE_proc_call = 35, 
		RULE_subpparamlist = 36, RULE_expcond = 37, RULE_expcond2 = 38, RULE_oplog = 39, 
		RULE_factorcond = 40, RULE_opcomp = 41, RULE_if_then = 42, RULE_then_else = 43, 
		RULE_do_body = 44, RULE_doval = 45, RULE_casos = 46, RULE_casos2 = 47, 
		RULE_etiquetas = 48, RULE_etiquetas2 = 49, RULE_etiquetas3 = 50, RULE_listaetiqetas = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "sentlist2", 
			"dcl", "dcl2", "defcte", "ctelist", "simpvalue", "defvar", "tipo", "charlength", 
			"varlist", "varlist2", "init", "decproc", "formal_paramlist", "nomparamlist_init", 
			"nomparamlist", "dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", 
			"dec_paramlist", "sent", "exp", "exp2", "op", "oparit", "factor", "factor2", 
			"explist", "proc_call", "subpparamlist", "expcond", "expcond2", "oplog", 
			"factorcond", "opcomp", "if_then", "then_else", "do_body", "doval", "casos", 
			"casos2", "etiquetas", "etiquetas2", "etiquetas3", "listaetiqetas"
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

	public SciLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public Program p;
		public Token IDENT;
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
			setState(104);
			match(T__0);
			setState(105);
			((PrgContext)_localctx).IDENT = match(IDENT);
			setState(106);
			match(T__1);

			            ((PrgContext)_localctx).p =  new Program((((PrgContext)_localctx).IDENT!=null?((PrgContext)_localctx).IDENT.getText():null));
			       
			setState(108);
			dcllist(_localctx.p.getConstants(), _localctx.p.getParameters());
			_localctx.p.printProgram();
			setState(110);
			cabecera();
			setState(111);
			sentlist();
			setState(112);
			match(T__2);
			setState(113);
			match(T__0);
			setState(114);
			((PrgContext)_localctx).IDENT = match(IDENT);
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
		public List<Parameter> variables;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, List<Constant> constants, List<Parameter> variables) {
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

	public final DcllistContext dcllist(List<Constant> constants,List<Parameter> variables) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), constants, variables);
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				dcl(_localctx.constants, _localctx.variables);
				setState(117);
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
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__3);
				setState(123);
				cablist();
				setState(124);
				match(T__2);
				setState(125);
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
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cablist);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				decproc();
				setState(131);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				decfun();
				setState(134);
				decsubprog();
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
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decsubprog);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				decproc();
				setState(139);
				decsubprog();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				decfun();
				setState(142);
				decsubprog();
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			sent();
			setState(148);
			sentlist2();
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public Sentlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Sentlist2Context sentlist2() throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentlist2);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				sent();
				setState(151);
				sentlist2();
				}
				break;
			case T__2:
			case T__22:
			case T__42:
			case T__43:
			case T__45:
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
	public static class DclContext extends ParserRuleContext {
		public List<Constant> constants;
		public List<Parameter> variables;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dcl2Context dcl2() {
			return getRuleContext(Dcl2Context.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DclContext(ParserRuleContext parent, int invokingState, List<Constant> constants, List<Parameter> variables) {
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

	public final DclContext dcl(List<Constant> constants,List<Parameter> variables) throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState(), constants, variables);
		enterRule(_localctx, 14, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((DclContext)_localctx).tipo = tipo();
			setState(157);
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
		public List<Parameter> variables;
		public String type;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public Dcl2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dcl2Context(ParserRuleContext parent, int invokingState, List<Constant> constants, List<Parameter> variables, String type) {
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

	public final Dcl2Context dcl2(List<Constant> constants,List<Parameter> variables,String type) throws RecognitionException {
		Dcl2Context _localctx = new Dcl2Context(_ctx, getState(), constants, variables, type);
		enterRule(_localctx, 16, RULE_dcl2);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				defcte(_localctx.constants);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
			setState(163);
			match(T__4);
			setState(164);
			match(T__5);
			setState(165);
			match(T__6);
			setState(166);
			((DefcteContext)_localctx).IDENT = match(IDENT);
			setState(167);
			match(T__7);
			setState(168);
			((DefcteContext)_localctx).simpvalue = simpvalue();

			                            Constant newConstant = new Constant(((DefcteContext)_localctx).simpvalue.value, (((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null));
			                            _localctx.constants.add(newConstant);
			                         
			setState(170);
			ctelist(_localctx.constants);
			setState(171);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__4);
				setState(174);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(175);
				match(T__7);
				setState(176);
				((CtelistContext)_localctx).simpvalue = simpvalue();

				                            Constant newConstant = new Constant(((CtelistContext)_localctx).simpvalue.value, (((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null));
				                            _localctx.constants.add(newConstant);
				                         
				setState(178);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null);
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null);
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
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
		public List<Parameter> variables;
		public String type;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarContext(ParserRuleContext parent, int invokingState, List<Parameter> variables, String type) {
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

	public final DefvarContext defvar(List<Parameter> variables,String type) throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState(), variables, type);
		enterRule(_localctx, 24, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__6);
			setState(198);
			varlist();
			setState(199);
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__8);
				((TipoContext)_localctx).type =  "int";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__9);
				((TipoContext)_localctx).type =  "float";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(T__10);
				setState(206);
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
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__11);
				setState(212);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(213);
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
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENT);
			setState(219);
			init();
			setState(220);
			varlist2();
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
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist2Context varlist2() {
			return getRuleContext(Varlist2Context.class,0);
		}
		public Varlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Varlist2Context varlist2() throws RecognitionException {
		Varlist2Context _localctx = new Varlist2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_varlist2);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__4);
				setState(223);
				match(IDENT);
				setState(224);
				init();
				setState(225);
				varlist2();
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
	public static class InitContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(T__7);
				setState(231);
				simpvalue();
				}
				break;
			case T__1:
			case T__4:
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
	public static class DecprocContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
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
			setState(235);
			match(T__13);
			setState(236);
			match(IDENT);
			setState(237);
			formal_paramlist();
			setState(238);
			dec_s_paramlist();
			setState(239);
			match(T__2);
			setState(240);
			match(T__13);
			setState(241);
			match(IDENT);
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
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_paramlist);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__11);
				setState(244);
				nomparamlist_init();
				setState(245);
				match(T__12);
				}
				break;
			case T__2:
			case T__8:
			case T__9:
			case T__10:
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
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Nomparamlist_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Nomparamlist_initContext nomparamlist_init() throws RecognitionException {
		Nomparamlist_initContext _localctx = new Nomparamlist_initContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nomparamlist_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(IDENT);
			setState(251);
			nomparamlist();
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
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nomparamlist);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__4);
				setState(254);
				nomparamlist_init();
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
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dec_s_paramlist);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				tipo();
				setState(259);
				match(T__4);
				setState(260);
				match(T__14);
				setState(261);
				match(T__11);
				setState(262);
				tipoparam();
				setState(263);
				match(T__12);
				setState(264);
				match(IDENT);
				setState(265);
				match(T__1);
				setState(266);
				dec_s_paramlist();
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
	public static class TipoparamContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
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
	public static class DecfunContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(SciLanguageParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(SciLanguageParser.IDENT, i);
		}
		public Nomparamlist_initContext nomparamlist_init() {
			return getRuleContext(Nomparamlist_initContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
			setState(273);
			match(T__18);
			setState(274);
			match(IDENT);
			setState(275);
			match(T__11);
			setState(276);
			nomparamlist_init();
			setState(277);
			match(T__12);
			setState(278);
			tipo();
			setState(279);
			match(T__6);
			setState(280);
			match(IDENT);
			setState(281);
			match(T__1);
			setState(282);
			dec_f_paramlist();
			setState(283);
			match(T__2);
			setState(284);
			match(T__18);
			setState(285);
			match(IDENT);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_paramlistContext dec_paramlist() {
			return getRuleContext(Dec_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dec_f_paramlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			tipo();
			setState(288);
			match(T__4);
			setState(289);
			match(T__14);
			setState(290);
			match(T__11);
			setState(291);
			dec_paramlist();
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
	public static class Dec_paramlistContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public Dec_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterDec_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitDec_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitDec_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_paramlistContext dec_paramlist() throws RecognitionException {
		Dec_paramlistContext _localctx = new Dec_paramlistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dec_paramlist);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__15);
				setState(294);
				match(T__12);
				setState(295);
				match(IDENT);
				setState(296);
				match(T__1);
				setState(297);
				dec_f_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				tipoparam();
				setState(299);
				match(T__12);
				setState(300);
				match(IDENT);
				setState(301);
				match(T__1);
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
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sent);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(IDENT);
				setState(306);
				match(T__7);
				setState(307);
				exp();
				setState(308);
				match(T__1);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				proc_call();
				setState(311);
				match(T__1);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(T__19);
				setState(314);
				match(T__11);
				setState(315);
				expcond();
				setState(316);
				match(T__12);
				setState(317);
				if_then();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(T__20);
				setState(320);
				do_body();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(T__21);
				setState(322);
				match(T__22);
				setState(323);
				match(T__11);
				setState(324);
				exp();
				setState(325);
				match(T__12);
				setState(326);
				casos();
				setState(327);
				match(T__2);
				setState(328);
				match(T__21);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			factor();
			setState(333);
			exp2();
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
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_exp2);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				op();
				setState(336);
				factor();
				setState(337);
				exp2();
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
		enterRule(_localctx, 60, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		enterRule(_localctx, 62, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(353);
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
				setState(346);
				simpvalue();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__11);
				setState(348);
				exp();
				setState(349);
				match(T__12);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(IDENT);
				setState(352);
				factor2();
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_factor2);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__11);
				setState(356);
				exp();
				setState(357);
				explist();
				setState(358);
				match(T__12);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_explist);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T__4);
				setState(364);
				exp();
				setState(365);
				explist();
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
	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__27);
			setState(371);
			match(IDENT);
			setState(372);
			subpparamlist();
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subpparamlist);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__11);
				setState(375);
				exp();
				setState(376);
				explist();
				setState(377);
				match(T__12);
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
	public static class ExpcondContext extends ParserRuleContext {
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond2Context expcond2() {
			return getRuleContext(Expcond2Context.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			factorcond();
			setState(383);
			expcond2();
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
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond2Context expcond2() {
			return getRuleContext(Expcond2Context.class,0);
		}
		public Expcond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Expcond2Context expcond2() throws RecognitionException {
		Expcond2Context _localctx = new Expcond2Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_expcond2);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				oplog();
				setState(386);
				factorcond();
				setState(387);
				expcond2();
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
	public static class OplogContext extends ParserRuleContext {
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
		enterRule(_localctx, 78, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
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
	public static class FactorcondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factorcond);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				exp();
				setState(395);
				opcomp();
				setState(396);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(T__11);
				setState(399);
				expcond();
				setState(400);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(T__32);
				setState(403);
				factorcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(T__33);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				match(T__34);
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
		enterRule(_localctx, 82, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) ) {
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
	public static class If_thenContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public Then_elseContext then_else() {
			return getRuleContext(Then_elseContext.class,0);
		}
		public If_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final If_thenContext if_then() throws RecognitionException {
		If_thenContext _localctx = new If_thenContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_if_then);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				sent();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T__41);
				setState(412);
				sentlist();
				setState(413);
				then_else();
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
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public Then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Then_elseContext then_else() throws RecognitionException {
		Then_elseContext _localctx = new Then_elseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_then_else);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(T__43);
				setState(419);
				sentlist();
				setState(420);
				match(T__42);
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
		public Do_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Do_bodyContext do_body() throws RecognitionException {
		Do_bodyContext _localctx = new Do_bodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_do_body);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__44);
				setState(425);
				match(T__11);
				setState(426);
				expcond();
				setState(427);
				match(T__12);
				setState(428);
				sentlist();
				setState(429);
				match(T__45);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(IDENT);
				setState(432);
				match(T__7);
				setState(433);
				doval();
				setState(434);
				match(T__4);
				setState(435);
				doval();
				setState(436);
				match(T__4);
				setState(437);
				doval();
				setState(438);
				sentlist();
				setState(439);
				match(T__45);
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
		enterRule(_localctx, 90, RULE_doval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==NUM_INT_CONST) ) {
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
	public static class CasosContext extends ParserRuleContext {
		public Casos2Context casos2() {
			return getRuleContext(Casos2Context.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_casos);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(T__22);
				setState(446);
				casos2();
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
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public Casos2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Casos2Context casos2() throws RecognitionException {
		Casos2Context _localctx = new Casos2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_casos2);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__11);
				setState(451);
				etiquetas();
				setState(452);
				match(T__12);
				setState(453);
				sentlist();
				setState(454);
				casos();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(T__46);
				setState(457);
				sentlist();
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
		enterRule(_localctx, 96, RULE_etiquetas);
		try {
			setState(465);
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
				setState(460);
				simpvalue();
				setState(461);
				etiquetas2();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(T__47);
				setState(464);
				simpvalue();
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
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
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
		enterRule(_localctx, 98, RULE_etiquetas2);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				listaetiqetas();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(T__47);
				setState(469);
				etiquetas3();
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
		enterRule(_localctx, 100, RULE_etiquetas3);
		try {
			setState(474);
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
				setState(472);
				simpvalue();
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
	public static class ListaetiqetasContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiqetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).enterListaetiqetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SciLanguageListener ) ((SciLanguageListener)listener).exitListaetiqetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SciLanguageVisitor ) return ((SciLanguageVisitor<? extends T>)visitor).visitListaetiqetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaetiqetasContext listaetiqetas() throws RecognitionException {
		ListaetiqetasContext _localctx = new ListaetiqetasContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_listaetiqetas);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(T__4);
				setState(477);
				simpvalue();
				setState(478);
				listaetiqetas();
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

	public static final String _serializedATN =
		"\u0004\u00019\u01e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0081\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0089\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009b\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00a2\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00b6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00c4\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00d2\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00d9\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00ea\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00f9\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0101\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u010e\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0130\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u014b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0155\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0162\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u016a\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0171\b\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0003$\u017d\b$\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0187\b&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0197\b(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01a0"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01a7\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u01ba\b,\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0003.\u01c1\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u01cb\b/\u00010\u00010\u00010\u00010\u00010\u00030\u01d2"+
		"\b0\u00011\u00011\u00011\u00031\u01d7\b1\u00012\u00012\u00032\u01db\b"+
		"2\u00013\u00013\u00013\u00013\u00013\u00033\u01e2\b3\u00013\u0000\u0000"+
		"4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0005\u0001\u0000"+
		"\u0010\u0012\u0001\u0000\u0018\u001b\u0001\u0000\u001d \u0001\u0000$)"+
		"\u0001\u000012\u01dd\u0000h\u0001\u0000\u0000\u0000\u0002x\u0001\u0000"+
		"\u0000\u0000\u0004\u0080\u0001\u0000\u0000\u0000\u0006\u0088\u0001\u0000"+
		"\u0000\u0000\b\u0091\u0001\u0000\u0000\u0000\n\u0093\u0001\u0000\u0000"+
		"\u0000\f\u009a\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000"+
		"\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000"+
		"\u0014\u00b5\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000"+
		"\u0018\u00c5\u0001\u0000\u0000\u0000\u001a\u00d1\u0001\u0000\u0000\u0000"+
		"\u001c\u00d8\u0001\u0000\u0000\u0000\u001e\u00da\u0001\u0000\u0000\u0000"+
		" \u00e4\u0001\u0000\u0000\u0000\"\u00e9\u0001\u0000\u0000\u0000$\u00eb"+
		"\u0001\u0000\u0000\u0000&\u00f8\u0001\u0000\u0000\u0000(\u00fa\u0001\u0000"+
		"\u0000\u0000*\u0100\u0001\u0000\u0000\u0000,\u010d\u0001\u0000\u0000\u0000"+
		".\u010f\u0001\u0000\u0000\u00000\u0111\u0001\u0000\u0000\u00002\u011f"+
		"\u0001\u0000\u0000\u00004\u012f\u0001\u0000\u0000\u00006\u014a\u0001\u0000"+
		"\u0000\u00008\u014c\u0001\u0000\u0000\u0000:\u0154\u0001\u0000\u0000\u0000"+
		"<\u0156\u0001\u0000\u0000\u0000>\u0158\u0001\u0000\u0000\u0000@\u0161"+
		"\u0001\u0000\u0000\u0000B\u0169\u0001\u0000\u0000\u0000D\u0170\u0001\u0000"+
		"\u0000\u0000F\u0172\u0001\u0000\u0000\u0000H\u017c\u0001\u0000\u0000\u0000"+
		"J\u017e\u0001\u0000\u0000\u0000L\u0186\u0001\u0000\u0000\u0000N\u0188"+
		"\u0001\u0000\u0000\u0000P\u0196\u0001\u0000\u0000\u0000R\u0198\u0001\u0000"+
		"\u0000\u0000T\u019f\u0001\u0000\u0000\u0000V\u01a6\u0001\u0000\u0000\u0000"+
		"X\u01b9\u0001\u0000\u0000\u0000Z\u01bb\u0001\u0000\u0000\u0000\\\u01c0"+
		"\u0001\u0000\u0000\u0000^\u01ca\u0001\u0000\u0000\u0000`\u01d1\u0001\u0000"+
		"\u0000\u0000b\u01d6\u0001\u0000\u0000\u0000d\u01da\u0001\u0000\u0000\u0000"+
		"f\u01e1\u0001\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u00051\u0000"+
		"\u0000jk\u0005\u0002\u0000\u0000kl\u0006\u0000\uffff\uffff\u0000lm\u0003"+
		"\u0002\u0001\u0000mn\u0006\u0000\uffff\uffff\u0000no\u0003\u0004\u0002"+
		"\u0000op\u0003\n\u0005\u0000pq\u0005\u0003\u0000\u0000qr\u0005\u0001\u0000"+
		"\u0000rs\u00051\u0000\u0000s\u0001\u0001\u0000\u0000\u0000tu\u0003\u000e"+
		"\u0007\u0000uv\u0003\u0002\u0001\u0000vy\u0001\u0000\u0000\u0000wy\u0001"+
		"\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"y\u0003\u0001\u0000\u0000\u0000z{\u0005\u0004\u0000\u0000{|\u0003\u0006"+
		"\u0003\u0000|}\u0005\u0003\u0000\u0000}~\u0005\u0004\u0000\u0000~\u0081"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080z\u0001"+
		"\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0005\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0003$\u0012\u0000\u0083\u0084\u0003\b"+
		"\u0004\u0000\u0084\u0089\u0001\u0000\u0000\u0000\u0085\u0086\u00030\u0018"+
		"\u0000\u0086\u0087\u0003\b\u0004\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000"+
		"\u0089\u0007\u0001\u0000\u0000\u0000\u008a\u008b\u0003$\u0012\u0000\u008b"+
		"\u008c\u0003\b\u0004\u0000\u008c\u0092\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u00030\u0018\u0000\u008e\u008f\u0003\b\u0004\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008a\u0001"+
		"\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0094\u00036"+
		"\u001b\u0000\u0094\u0095\u0003\f\u0006\u0000\u0095\u000b\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u00036\u001b\u0000\u0097\u0098\u0003\f\u0006\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\r\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u001a\r\u0000\u009d"+
		"\u009e\u0003\u0010\b\u0000\u009e\u000f\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0003\u0012\t\u0000\u00a0\u00a2\u0003\u0018\f\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0011\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0006\u0000\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6\u00a7\u0005"+
		"1\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000\u00a8\u00a9\u0003\u0016"+
		"\u000b\u0000\u00a9\u00aa\u0006\t\uffff\uffff\u0000\u00aa\u00ab\u0003\u0014"+
		"\n\u0000\u00ab\u00ac\u0005\u0002\u0000\u0000\u00ac\u0013\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae\u00af\u00051\u0000\u0000"+
		"\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0003\u0016\u000b\u0000\u00b1"+
		"\u00b2\u0006\n\uffff\uffff\u0000\u00b2\u00b3\u0003\u0014\n\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u0015\u0001\u0000\u0000\u0000\u00b7\u00b8\u00052\u0000\u0000\u00b8\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00b9\u00ba\u00053\u0000\u0000\u00ba\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00bb\u00bc\u00054\u0000\u0000\u00bc\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00bd\u00be\u00057\u0000\u0000\u00be\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00bf\u00c0\u00058\u0000\u0000\u00c0\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00c1\u00c2\u00059\u0000\u0000\u00c2\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00c3\u00b7\u0001\u0000\u0000\u0000\u00c3"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u0017\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000\u00c7"+
		"\u00c8\u0005\u0002\u0000\u0000\u00c8\u0019\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005\t\u0000\u0000\u00ca\u00d2\u0006\r\uffff\uffff\u0000\u00cb"+
		"\u00cc\u0005\n\u0000\u0000\u00cc\u00d2\u0006\r\uffff\uffff\u0000\u00cd"+
		"\u00ce\u0005\u000b\u0000\u0000\u00ce\u00cf\u0003\u001c\u000e\u0000\u00cf"+
		"\u00d0\u0006\r\uffff\uffff\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d2\u001b\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005\f\u0000\u0000\u00d4\u00d5\u00052\u0000\u0000\u00d5\u00d6"+
		"\u0005\r\u0000\u0000\u00d6\u00d9\u0006\u000e\uffff\uffff\u0000\u00d7\u00d9"+
		"\u0006\u000e\uffff\uffff\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u001d\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u00051\u0000\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc\u00dd"+
		"\u0003 \u0010\u0000\u00dd\u001f\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\u0005\u0000\u0000\u00df\u00e0\u00051\u0000\u0000\u00e0\u00e1\u0003\""+
		"\u0011\u0000\u00e1\u00e2\u0003 \u0010\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00de\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5!\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\b\u0000\u0000\u00e7\u00ea\u0003\u0016\u000b\u0000\u00e8"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea#\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005\u000e\u0000\u0000\u00ec\u00ed\u00051\u0000\u0000\u00ed\u00ee\u0003"+
		"&\u0013\u0000\u00ee\u00ef\u0003,\u0016\u0000\u00ef\u00f0\u0005\u0003\u0000"+
		"\u0000\u00f0\u00f1\u0005\u000e\u0000\u0000\u00f1\u00f2\u00051\u0000\u0000"+
		"\u00f2%\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\f\u0000\u0000\u00f4"+
		"\u00f5\u0003(\u0014\u0000\u00f5\u00f6\u0005\r\u0000\u0000\u00f6\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\'\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u00051\u0000\u0000\u00fb\u00fc\u0003*\u0015"+
		"\u0000\u00fc)\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0005\u0000\u0000"+
		"\u00fe\u0101\u0003(\u0014\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"+\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u001a\r\u0000\u0103\u0104"+
		"\u0005\u0005\u0000\u0000\u0104\u0105\u0005\u000f\u0000\u0000\u0105\u0106"+
		"\u0005\f\u0000\u0000\u0106\u0107\u0003.\u0017\u0000\u0107\u0108\u0005"+
		"\r\u0000\u0000\u0108\u0109\u00051\u0000\u0000\u0109\u010a\u0005\u0002"+
		"\u0000\u0000\u010a\u010b\u0003,\u0016\u0000\u010b\u010e\u0001\u0000\u0000"+
		"\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0102\u0001\u0000\u0000"+
		"\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e-\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0007\u0000\u0000\u0000\u0110/\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0005\u0013\u0000\u0000\u0112\u0113\u00051\u0000\u0000\u0113\u0114"+
		"\u0005\f\u0000\u0000\u0114\u0115\u0003(\u0014\u0000\u0115\u0116\u0005"+
		"\r\u0000\u0000\u0116\u0117\u0003\u001a\r\u0000\u0117\u0118\u0005\u0007"+
		"\u0000\u0000\u0118\u0119\u00051\u0000\u0000\u0119\u011a\u0005\u0002\u0000"+
		"\u0000\u011a\u011b\u00032\u0019\u0000\u011b\u011c\u0005\u0003\u0000\u0000"+
		"\u011c\u011d\u0005\u0013\u0000\u0000\u011d\u011e\u00051\u0000\u0000\u011e"+
		"1\u0001\u0000\u0000\u0000\u011f\u0120\u0003\u001a\r\u0000\u0120\u0121"+
		"\u0005\u0005\u0000\u0000\u0121\u0122\u0005\u000f\u0000\u0000\u0122\u0123"+
		"\u0005\f\u0000\u0000\u0123\u0124\u00034\u001a\u0000\u01243\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\u0010\u0000\u0000\u0126\u0127\u0005\r\u0000"+
		"\u0000\u0127\u0128\u00051\u0000\u0000\u0128\u0129\u0005\u0002\u0000\u0000"+
		"\u0129\u0130\u00032\u0019\u0000\u012a\u012b\u0003.\u0017\u0000\u012b\u012c"+
		"\u0005\r\u0000\u0000\u012c\u012d\u00051\u0000\u0000\u012d\u012e\u0005"+
		"\u0002\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0125\u0001"+
		"\u0000\u0000\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u01305\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u00051\u0000\u0000\u0132\u0133\u0005\b\u0000"+
		"\u0000\u0133\u0134\u00038\u001c\u0000\u0134\u0135\u0005\u0002\u0000\u0000"+
		"\u0135\u014b\u0001\u0000\u0000\u0000\u0136\u0137\u0003F#\u0000\u0137\u0138"+
		"\u0005\u0002\u0000\u0000\u0138\u014b\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005\u0014\u0000\u0000\u013a\u013b\u0005\f\u0000\u0000\u013b\u013c\u0003"+
		"J%\u0000\u013c\u013d\u0005\r\u0000\u0000\u013d\u013e\u0003T*\u0000\u013e"+
		"\u014b\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0015\u0000\u0000\u0140"+
		"\u014b\u0003X,\u0000\u0141\u0142\u0005\u0016\u0000\u0000\u0142\u0143\u0005"+
		"\u0017\u0000\u0000\u0143\u0144\u0005\f\u0000\u0000\u0144\u0145\u00038"+
		"\u001c\u0000\u0145\u0146\u0005\r\u0000\u0000\u0146\u0147\u0003\\.\u0000"+
		"\u0147\u0148\u0005\u0003\u0000\u0000\u0148\u0149\u0005\u0016\u0000\u0000"+
		"\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0131\u0001\u0000\u0000\u0000"+
		"\u014a\u0136\u0001\u0000\u0000\u0000\u014a\u0139\u0001\u0000\u0000\u0000"+
		"\u014a\u013f\u0001\u0000\u0000\u0000\u014a\u0141\u0001\u0000\u0000\u0000"+
		"\u014b7\u0001\u0000\u0000\u0000\u014c\u014d\u0003@ \u0000\u014d\u014e"+
		"\u0003:\u001d\u0000\u014e9\u0001\u0000\u0000\u0000\u014f\u0150\u0003<"+
		"\u001e\u0000\u0150\u0151\u0003@ \u0000\u0151\u0152\u0003:\u001d\u0000"+
		"\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000"+
		"\u0154\u014f\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0155;\u0001\u0000\u0000\u0000\u0156\u0157\u0003>\u001f\u0000\u0157="+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0007\u0001\u0000\u0000\u0159?\u0001"+
		"\u0000\u0000\u0000\u015a\u0162\u0003\u0016\u000b\u0000\u015b\u015c\u0005"+
		"\f\u0000\u0000\u015c\u015d\u00038\u001c\u0000\u015d\u015e\u0005\r\u0000"+
		"\u0000\u015e\u0162\u0001\u0000\u0000\u0000\u015f\u0160\u00051\u0000\u0000"+
		"\u0160\u0162\u0003B!\u0000\u0161\u015a\u0001\u0000\u0000\u0000\u0161\u015b"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162A\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005\f\u0000\u0000\u0164\u0165\u00038"+
		"\u001c\u0000\u0165\u0166\u0003D\"\u0000\u0166\u0167\u0005\r\u0000\u0000"+
		"\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000"+
		"\u0169\u0163\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016aC\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0005\u0000\u0000\u016c"+
		"\u016d\u00038\u001c\u0000\u016d\u016e\u0003D\"\u0000\u016e\u0171\u0001"+
		"\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016b\u0001"+
		"\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171E\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0005\u001c\u0000\u0000\u0173\u0174\u00051\u0000"+
		"\u0000\u0174\u0175\u0003H$\u0000\u0175G\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005\f\u0000\u0000\u0177\u0178\u00038\u001c\u0000\u0178\u0179"+
		"\u0003D\"\u0000\u0179\u017a\u0005\r\u0000\u0000\u017a\u017d\u0001\u0000"+
		"\u0000\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0176\u0001\u0000"+
		"\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017dI\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0003P(\u0000\u017f\u0180\u0003L&\u0000\u0180K\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0003N\'\u0000\u0182\u0183\u0003P(\u0000"+
		"\u0183\u0184\u0003L&\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0187"+
		"\u0001\u0000\u0000\u0000\u0186\u0181\u0001\u0000\u0000\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0187M\u0001\u0000\u0000\u0000\u0188\u0189\u0007"+
		"\u0002\u0000\u0000\u0189O\u0001\u0000\u0000\u0000\u018a\u018b\u00038\u001c"+
		"\u0000\u018b\u018c\u0003R)\u0000\u018c\u018d\u00038\u001c\u0000\u018d"+
		"\u0197\u0001\u0000\u0000\u0000\u018e\u018f\u0005\f\u0000\u0000\u018f\u0190"+
		"\u0003J%\u0000\u0190\u0191\u0005\r\u0000\u0000\u0191\u0197\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0005!\u0000\u0000\u0193\u0197\u0003P(\u0000"+
		"\u0194\u0197\u0005\"\u0000\u0000\u0195\u0197\u0005#\u0000\u0000\u0196"+
		"\u018a\u0001\u0000\u0000\u0000\u0196\u018e\u0001\u0000\u0000\u0000\u0196"+
		"\u0192\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0195\u0001\u0000\u0000\u0000\u0197Q\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0007\u0003\u0000\u0000\u0199S\u0001\u0000\u0000\u0000\u019a\u01a0\u0003"+
		"6\u001b\u0000\u019b\u019c\u0005*\u0000\u0000\u019c\u019d\u0003\n\u0005"+
		"\u0000\u019d\u019e\u0003V+\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f"+
		"\u019a\u0001\u0000\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u01a0"+
		"U\u0001\u0000\u0000\u0000\u01a1\u01a7\u0005+\u0000\u0000\u01a2\u01a3\u0005"+
		",\u0000\u0000\u01a3\u01a4\u0003\n\u0005\u0000\u01a4\u01a5\u0005+\u0000"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a7W\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0005-\u0000\u0000\u01a9\u01aa\u0005\f\u0000\u0000\u01aa"+
		"\u01ab\u0003J%\u0000\u01ab\u01ac\u0005\r\u0000\u0000\u01ac\u01ad\u0003"+
		"\n\u0005\u0000\u01ad\u01ae\u0005.\u0000\u0000\u01ae\u01ba\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u00051\u0000\u0000\u01b0\u01b1\u0005\b\u0000"+
		"\u0000\u01b1\u01b2\u0003Z-\u0000\u01b2\u01b3\u0005\u0005\u0000\u0000\u01b3"+
		"\u01b4\u0003Z-\u0000\u01b4\u01b5\u0005\u0005\u0000\u0000\u01b5\u01b6\u0003"+
		"Z-\u0000\u01b6\u01b7\u0003\n\u0005\u0000\u01b7\u01b8\u0005.\u0000\u0000"+
		"\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01a8\u0001\u0000\u0000\u0000"+
		"\u01b9\u01af\u0001\u0000\u0000\u0000\u01baY\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0007\u0004\u0000\u0000\u01bc[\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0005\u0017\u0000\u0000\u01be\u01c1\u0003^/\u0000\u01bf\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1]\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\f\u0000"+
		"\u0000\u01c3\u01c4\u0003`0\u0000\u01c4\u01c5\u0005\r\u0000\u0000\u01c5"+
		"\u01c6\u0003\n\u0005\u0000\u01c6\u01c7\u0003\\.\u0000\u01c7\u01cb\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0005/\u0000\u0000\u01c9\u01cb\u0003\n"+
		"\u0005\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000"+
		"\u0000\u0000\u01cb_\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003\u0016\u000b"+
		"\u0000\u01cd\u01ce\u0003b1\u0000\u01ce\u01d2\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u00050\u0000\u0000\u01d0\u01d2\u0003\u0016\u000b\u0000\u01d1\u01cc"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2a\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d7\u0003f3\u0000\u01d4\u01d5\u00050\u0000"+
		"\u0000\u01d5\u01d7\u0003d2\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d7c\u0001\u0000\u0000\u0000\u01d8\u01db"+
		"\u0003\u0016\u000b\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01dbe\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0005\u0005\u0000\u0000\u01dd\u01de\u0003"+
		"\u0016\u000b\u0000\u01de\u01df\u0003f3\u0000\u01df\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01dc\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2g\u0001\u0000\u0000\u0000"+
		"!x\u0080\u0088\u0091\u009a\u00a1\u00b5\u00c3\u00d1\u00d8\u00e4\u00e9\u00f8"+
		"\u0100\u010d\u012f\u014a\u0154\u0161\u0169\u0170\u017c\u0186\u0196\u019f"+
		"\u01a6\u01b9\u01c0\u01ca\u01d1\u01d6\u01da\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}