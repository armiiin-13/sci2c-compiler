// Generated from C:/Users/armii/Documents/Universidad/Procesadores_Lenguajes/Compiler_Sci2C/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2

    import entitiy.*;
    import util.Tuple;

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
		IDENT=25, NUM_INT_CONST=26, NUM_REAL_CONST=27, STRING_CONST=28, COMMENTARY=29, 
		TABS=30, NUM_INT_CONST_B=31, NUM_INT_CONST_O=32, NUM_INT_CONST_H=33;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_cabecera = 2, RULE_cablist = 3, RULE_decsubprog = 4, 
		RULE_sentlist = 5, RULE_sentlist2 = 6, RULE_dcl = 7, RULE_dcl2 = 8, RULE_defcte = 9, 
		RULE_ctelist = 10, RULE_simpvalue = 11, RULE_defvar = 12, RULE_tipo = 13, 
		RULE_charlength = 14, RULE_varlist = 15, RULE_varlist2 = 16, RULE_init = 17, 
		RULE_decproc = 18, RULE_formal_paramlist = 19, RULE_nomparamlist_init = 20, 
		RULE_nomparamlist = 21, RULE_dec_s_paramlist = 22, RULE_tipoparam = 23, 
		RULE_decfun = 24, RULE_dec_f_paramlist = 25, RULE_sent = 26, RULE_exp = 27, 
		RULE_exp2 = 28, RULE_op = 29, RULE_oparit = 30, RULE_factor = 31, RULE_factor2 = 32, 
		RULE_explist = 33, RULE_proc_call = 34, RULE_subpparamlist = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "sentlist2", 
			"dcl", "dcl2", "defcte", "ctelist", "simpvalue", "defvar", "tipo", "charlength", 
			"varlist", "varlist2", "init", "decproc", "formal_paramlist", "nomparamlist_init", 
			"nomparamlist", "dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", 
			"sent", "exp", "exp2", "op", "oparit", "factor", "factor2", "explist", 
			"proc_call", "subpparamlist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'END'", "'INTERFACE'", "','", "'PARAMETER'", 
			"'::'", "'='", "'INTEGER'", "'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", 
			"'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", "'+'", "'-'", "'*'", 
			"'/'", "'CALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
			setState(72);
			match(T__0);
			setState(73);
			((PrgContext)_localctx).IDENT = match(IDENT);
			setState(74);
			match(T__1);

			            ((PrgContext)_localctx).p =  new Program((((PrgContext)_localctx).IDENT!=null?((PrgContext)_localctx).IDENT.getText():null));
			       
			setState(76);
			dcllist(_localctx.p.getConstants(), _localctx.p.getMain().getLocalVariables());
			setState(77);
			cabecera(_localctx.p.getFunctions());
			setState(78);
			((PrgContext)_localctx).sentlist = sentlist(null);

			            _localctx.p.getMain().setBlock(((PrgContext)_localctx).sentlist.body);
			            _localctx.p.printProgram();
			       
			setState(80);
			match(T__2);
			setState(81);
			match(T__0);
			setState(82);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				dcl(_localctx.constants, _localctx.variables);
				setState(85);
				dcllist(_localctx.constants, _localctx.variables);
				}
				break;
			case T__3:
			case T__23:
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__3);
				setState(91);
				cablist(_localctx.functions);
				setState(92);
				match(T__2);
				setState(93);
				match(T__3);
				}
				break;
			case T__23:
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((CablistContext)_localctx).decproc = decproc();
				_localctx.functions.add(((CablistContext)_localctx).decproc.function);
				setState(100);
				decsubprog(_localctx.functions);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((CablistContext)_localctx).decfun = decfun();
				_localctx.functions.add(((CablistContext)_localctx).decfun.function);
				setState(104);
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
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((DecsubprogContext)_localctx).decproc = decproc();
				_localctx.functions.add(((DecsubprogContext)_localctx).decproc.function);
				setState(110);
				decsubprog(_localctx.functions);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((DecsubprogContext)_localctx).decfun = decfun();
				_localctx.functions.add(((DecsubprogContext)_localctx).decfun.function);
				setState(114);
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
		public String funcName;
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
		public SentlistContext(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
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

	public final SentlistContext sentlist(String funcName) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), funcName);
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((SentlistContext)_localctx).sent = sent(_localctx.funcName);
			setState(120);
			((SentlistContext)_localctx).sentlist2 = sentlist2(_localctx.funcName);

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
		public String funcName;
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
		public Sentlist2Context(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
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

	public final Sentlist2Context sentlist2(String funcName) throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState(), funcName);
		enterRule(_localctx, 12, RULE_sentlist2);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((Sentlist2Context)_localctx).sent = sent(_localctx.funcName);
				setState(124);
				((Sentlist2Context)_localctx).sentlist2 = sentlist2(_localctx.funcName);

				        ((Sentlist2Context)_localctx).body =  new Body();
				        _localctx.body.addSentence(((Sentlist2Context)_localctx).sent.s);

				        if (((Sentlist2Context)_localctx).sentlist2.body != null){
				            for (Sentence sen : ((Sentlist2Context)_localctx).sentlist2.body.getSentences()){
				                _localctx.body.addSentence(sen);
				            }
				        }
				    
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{

				        ((Sentlist2Context)_localctx).body =  new Body();
				    
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
			setState(130);
			((DclContext)_localctx).tipo = tipo();
			setState(131);
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				defcte(_localctx.constants);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
			setState(137);
			match(T__4);
			setState(138);
			match(T__5);
			setState(139);
			match(T__6);
			setState(140);
			((DefcteContext)_localctx).IDENT = match(IDENT);
			setState(141);
			match(T__7);
			setState(142);
			((DefcteContext)_localctx).simpvalue = simpvalue();

			                            Constant newConstant = new Constant(((DefcteContext)_localctx).simpvalue.value, (((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null));
			                            _localctx.constants.add(newConstant);
			                         
			setState(144);
			ctelist(_localctx.constants);
			setState(145);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__4);
				setState(148);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(149);
				match(T__7);
				setState(150);
				((CtelistContext)_localctx).simpvalue = simpvalue();

				                            Constant newConstant = new Constant(((CtelistContext)_localctx).simpvalue.value, (((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null));
				                            _localctx.constants.add(newConstant);
				                         
				setState(152);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null);
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				((SimpvalueContext)_localctx).value =  (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null);
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
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
			setState(171);
			match(T__6);
			setState(172);
			varlist(_localctx.variables, _localctx.type);
			setState(173);
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__8);
				((TipoContext)_localctx).type =  "int";
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__9);
				((TipoContext)_localctx).type =  "float";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__10);
				setState(180);
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__11);
				setState(186);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(187);
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
			setState(192);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(193);
			((VarlistContext)_localctx).init = init(_localctx.type, (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null));

			    List<Parameter> parametros = new ArrayList<>();
			    parametros.add(((VarlistContext)_localctx).init.newParam);

			setState(195);
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
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__4);
				setState(198);
				((Varlist2Context)_localctx).IDENT = match(IDENT);
				setState(199);
				((Varlist2Context)_localctx).init = init(_localctx.type, (((Varlist2Context)_localctx).IDENT!=null?((Varlist2Context)_localctx).IDENT.getText():null));
				_localctx.parametros.add(((Varlist2Context)_localctx).init.newParam);
				setState(201);
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
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__7);
				setState(207);
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
		public Token IDENT;
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
			setState(213);
			match(T__13);
			setState(214);
			((DecprocContext)_localctx).IDENT = match(IDENT);

			        ((DecprocContext)_localctx).function =  new Function(new Header("void", (((DecprocContext)_localctx).IDENT!=null?((DecprocContext)_localctx).IDENT.getText():null)), new Body());
			    
			setState(216);
			formal_paramlist(_localctx.function.getHeader());
			setState(217);
			dec_s_paramlist(_localctx.function.getHeader());
			setState(218);
			match(T__2);
			setState(219);
			match(T__13);
			setState(220);
			((DecprocContext)_localctx).IDENT = match(IDENT);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__11);
				setState(223);
				nomparamlist_init(_localctx.header);
				setState(224);
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
			setState(229);
			((Nomparamlist_initContext)_localctx).IDENT = match(IDENT);
			_localctx.header.addParam((((Nomparamlist_initContext)_localctx).IDENT!=null?((Nomparamlist_initContext)_localctx).IDENT.getText():null));
			setState(231);
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
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__4);
				setState(234);
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
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(239);
				match(T__4);
				setState(240);
				match(T__14);
				setState(241);
				match(T__11);
				setState(242);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(243);
				match(T__12);
				setState(244);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);

				        Parameter param = _localctx.header.getParam((((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null));
				        param.setType(((Dec_s_paramlistContext)_localctx).tipo.type);
				        param.setPointer(((Dec_s_paramlistContext)_localctx).tipoparam.value);
				    
				setState(246);
				match(T__1);
				setState(247);
				dec_s_paramlist(_localctx.header);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(T__15);
				((TipoparamContext)_localctx).value =  false;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__16);
				((TipoparamContext)_localctx).value =  true;
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
		public Token IDENT;
		public TipoContext tipo;
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
			setState(260);
			match(T__18);
			setState(261);
			((DecfunContext)_localctx).IDENT = match(IDENT);

			        ((DecfunContext)_localctx).function =  new Function(new Header((((DecfunContext)_localctx).IDENT!=null?((DecfunContext)_localctx).IDENT.getText():null)), new Body());
			    
			setState(263);
			match(T__11);
			setState(264);
			nomparamlist_init(_localctx.function.getHeader());
			setState(265);
			match(T__12);
			setState(266);
			((DecfunContext)_localctx).tipo = tipo();
			setState(267);
			match(T__6);
			setState(268);
			((DecfunContext)_localctx).IDENT = match(IDENT);

			        _localctx.function.getHeader().setType(((DecfunContext)_localctx).tipo.type);
			    
			setState(270);
			match(T__1);
			setState(271);
			dec_f_paramlist(_localctx.function.getHeader());
			setState(272);
			match(T__2);
			setState(273);
			match(T__18);
			setState(274);
			((DecfunContext)_localctx).IDENT = match(IDENT);
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
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((Dec_f_paramlistContext)_localctx).tipo = tipo();
				setState(277);
				match(T__4);
				setState(278);
				match(T__14);
				setState(279);
				match(T__11);
				setState(280);
				((Dec_f_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(281);
				match(T__12);
				setState(282);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(283);
				match(T__1);

				        Parameter param = _localctx.header.getParam((((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null));
				        param.setType(((Dec_f_paramlistContext)_localctx).tipo.type);
				        param.setPointer(((Dec_f_paramlistContext)_localctx).tipoparam.value);
				    
				setState(285);
				dec_f_paramlist(_localctx.header);
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
	public static class SentContext extends ParserRuleContext {
		public String funcName;
		public Sentence s;
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public TerminalNode IDENT() { return getToken(SciLanguageParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentContext(ParserRuleContext parent, int invokingState, String funcName) {
			super(parent, invokingState);
			this.funcName = funcName;
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

	public final SentContext sent(String funcName) throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState(), funcName);
		enterRule(_localctx, 52, RULE_sent);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(291);
				match(T__7);
				setState(292);
				((SentContext)_localctx).exp = exp();
				setState(293);
				match(T__1);

				        if (_localctx.funcName != null && (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null).equals(_localctx.funcName)) {
				            ((SentContext)_localctx).s =  new Sentence(null, "return " + ((SentContext)_localctx).exp.code + ";");
				        } else {
				            ((SentContext)_localctx).s =  new Sentence(null, (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).exp.code + ";");
				        }

				    
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((SentContext)_localctx).proc_call = proc_call();
				setState(297);
				match(T__1);

				        ((SentContext)_localctx).s =  new Sentence(null, ((SentContext)_localctx).proc_call.code + ";");
				    
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
		public String code;
		public FactorContext factor;
		public Exp2Context exp2;
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
		enterRule(_localctx, 54, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((ExpContext)_localctx).factor = factor();
			setState(303);
			((ExpContext)_localctx).exp2 = exp2();

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
		enterRule(_localctx, 56, RULE_exp2);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((Exp2Context)_localctx).op = op();
				setState(307);
				((Exp2Context)_localctx).factor = factor();
				setState(308);
				((Exp2Context)_localctx).exp2 = exp2();

				    ((Exp2Context)_localctx).code =  " " + (((Exp2Context)_localctx).op!=null?_input.getText(((Exp2Context)_localctx).op.start,((Exp2Context)_localctx).op.stop):null) + " " + ((Exp2Context)_localctx).factor.code + ((Exp2Context)_localctx).exp2.code;

				}
				break;
			case T__1:
			case T__4:
			case T__12:
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
			setState(314);
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
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_factor);
		try {
			setState(330);
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
				setState(318);
				((FactorContext)_localctx).simpvalue = simpvalue();

				    ((FactorContext)_localctx).code =  ((FactorContext)_localctx).simpvalue.value;

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__11);
				setState(322);
				((FactorContext)_localctx).exp = exp();
				setState(323);
				match(T__12);

				    ((FactorContext)_localctx).code =  "(" + ((FactorContext)_localctx).exp.code + ")";

				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(327);
				((FactorContext)_localctx).factor2 = factor2();

				    ((FactorContext)_localctx).code =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + ((FactorContext)_localctx).factor2.code;

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
		public String code;
		public ExpContext exp;
		public ExplistContext explist;
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
		enterRule(_localctx, 64, RULE_factor2);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__11);
				setState(333);
				((Factor2Context)_localctx).exp = exp();
				setState(334);
				((Factor2Context)_localctx).explist = explist();
				setState(335);
				match(T__12);

				        ((Factor2Context)_localctx).code =  "(" + ((Factor2Context)_localctx).exp.code + ((Factor2Context)_localctx).explist.code + ")";
				    
				}
				break;
			case T__1:
			case T__4:
			case T__12:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
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
		public String code;
		public ExpContext exp;
		public ExplistContext explist;
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
		enterRule(_localctx, 66, RULE_explist);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__4);
				setState(342);
				((ExplistContext)_localctx).exp = exp();
				setState(343);
				((ExplistContext)_localctx).explist = explist();

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
		public String code;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
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
		enterRule(_localctx, 68, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__23);
			setState(350);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(351);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();

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
		public String code;
		public ExpContext exp;
		public ExplistContext explist;
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
		enterRule(_localctx, 70, RULE_subpparamlist);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__11);
				setState(355);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(356);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(357);
				match(T__12);

				    ((SubpparamlistContext)_localctx).code =  "(" + ((SubpparamlistContext)_localctx).exp.code + ((SubpparamlistContext)_localctx).explist.code + ")";

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

	public static final String _serializedATN =
		"\u0004\u0001!\u016c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Y\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002a\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004v\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0081\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00aa\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b8\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00bf\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00cd\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00d4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00e4\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00ed\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fb\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0103\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0121\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u012d\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u0139\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u014b\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0154\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u015c"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u016a\b#\u0001#\u0000\u0000$\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDF\u0000\u0001\u0001\u0000\u0014\u0017\u0166\u0000"+
		"H\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004`\u0001"+
		"\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000"+
		"\u0000\nw\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000\u000e"+
		"\u0082\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012"+
		"\u0089\u0001\u0000\u0000\u0000\u0014\u009b\u0001\u0000\u0000\u0000\u0016"+
		"\u00a9\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a"+
		"\u00b7\u0001\u0000\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e"+
		"\u00c0\u0001\u0000\u0000\u0000 \u00cc\u0001\u0000\u0000\u0000\"\u00d3"+
		"\u0001\u0000\u0000\u0000$\u00d5\u0001\u0000\u0000\u0000&\u00e3\u0001\u0000"+
		"\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000"+
		",\u00fa\u0001\u0000\u0000\u0000.\u0102\u0001\u0000\u0000\u00000\u0104"+
		"\u0001\u0000\u0000\u00002\u0120\u0001\u0000\u0000\u00004\u012c\u0001\u0000"+
		"\u0000\u00006\u012e\u0001\u0000\u0000\u00008\u0138\u0001\u0000\u0000\u0000"+
		":\u013a\u0001\u0000\u0000\u0000<\u013c\u0001\u0000\u0000\u0000>\u014a"+
		"\u0001\u0000\u0000\u0000@\u0153\u0001\u0000\u0000\u0000B\u015b\u0001\u0000"+
		"\u0000\u0000D\u015d\u0001\u0000\u0000\u0000F\u0169\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0001\u0000\u0000IJ\u0005\u0019\u0000\u0000JK\u0005\u0002\u0000"+
		"\u0000KL\u0006\u0000\uffff\uffff\u0000LM\u0003\u0002\u0001\u0000MN\u0003"+
		"\u0004\u0002\u0000NO\u0003\n\u0005\u0000OP\u0006\u0000\uffff\uffff\u0000"+
		"PQ\u0005\u0003\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0005\u0019\u0000"+
		"\u0000S\u0001\u0001\u0000\u0000\u0000TU\u0003\u000e\u0007\u0000UV\u0003"+
		"\u0002\u0001\u0000VY\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XT\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0004\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0005"+
		"\u0003\u0000\u0000]^\u0005\u0004\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_a\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000a\u0005\u0001\u0000\u0000\u0000bc\u0003$\u0012\u0000cd\u0006\u0003"+
		"\uffff\uffff\u0000de\u0003\b\u0004\u0000ek\u0001\u0000\u0000\u0000fg\u0003"+
		"0\u0018\u0000gh\u0006\u0003\uffff\uffff\u0000hi\u0003\b\u0004\u0000ik"+
		"\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000"+
		"\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0003$\u0012\u0000mn\u0006\u0004"+
		"\uffff\uffff\u0000no\u0003\b\u0004\u0000ov\u0001\u0000\u0000\u0000pq\u0003"+
		"0\u0018\u0000qr\u0006\u0004\uffff\uffff\u0000rs\u0003\b\u0004\u0000sv"+
		"\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000"+
		"\u0000up\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\t\u0001\u0000"+
		"\u0000\u0000wx\u00034\u001a\u0000xy\u0003\f\u0006\u0000yz\u0006\u0005"+
		"\uffff\uffff\u0000z\u000b\u0001\u0000\u0000\u0000{|\u00034\u001a\u0000"+
		"|}\u0003\f\u0006\u0000}~\u0006\u0006\uffff\uffff\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0006\u0006\uffff\uffff\u0000\u0080{\u0001\u0000"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084\u0003\u0010\b\u0000"+
		"\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0088\u0003\u0012\t\u0000\u0086"+
		"\u0088\u0003\u0018\f\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0005\u0000\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b\u008c"+
		"\u0005\u0007\u0000\u0000\u008c\u008d\u0005\u0019\u0000\u0000\u008d\u008e"+
		"\u0005\b\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090\u0006"+
		"\t\uffff\uffff\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0092\u0005"+
		"\u0002\u0000\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0005\u0000\u0000\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0005"+
		"\b\u0000\u0000\u0096\u0097\u0003\u0016\u000b\u0000\u0097\u0098\u0006\n"+
		"\uffff\uffff\u0000\u0098\u0099\u0003\u0014\n\u0000\u0099\u009c\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u0015\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u001a\u0000\u0000\u009e\u00aa\u0006\u000b"+
		"\uffff\uffff\u0000\u009f\u00a0\u0005\u001b\u0000\u0000\u00a0\u00aa\u0006"+
		"\u000b\uffff\uffff\u0000\u00a1\u00a2\u0005\u001c\u0000\u0000\u00a2\u00aa"+
		"\u0006\u000b\uffff\uffff\u0000\u00a3\u00a4\u0005\u001f\u0000\u0000\u00a4"+
		"\u00aa\u0006\u000b\uffff\uffff\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6"+
		"\u00aa\u0006\u000b\uffff\uffff\u0000\u00a7\u00a8\u0005!\u0000\u0000\u00a8"+
		"\u00aa\u0006\u000b\uffff\uffff\u0000\u00a9\u009d\u0001\u0000\u0000\u0000"+
		"\u00a9\u009f\u0001\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u00ad\u0003\u001e\u000f\u0000"+
		"\u00ad\u00ae\u0005\u0002\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u00b8\u0006\r\uffff\uffff\u0000"+
		"\u00b1\u00b2\u0005\n\u0000\u0000\u00b2\u00b8\u0006\r\uffff\uffff\u0000"+
		"\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4\u00b5\u0003\u001c\u000e\u0000"+
		"\u00b5\u00b6\u0006\r\uffff\uffff\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005\f\u0000\u0000\u00ba\u00bb\u0005\u001a\u0000\u0000\u00bb"+
		"\u00bc\u0005\r\u0000\u0000\u00bc\u00bf\u0006\u000e\uffff\uffff\u0000\u00bd"+
		"\u00bf\u0006\u000e\uffff\uffff\u0000\u00be\u00b9\u0001\u0000\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u001d\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0019\u0000\u0000\u00c1\u00c2\u0003\"\u0011\u0000\u00c2"+
		"\u00c3\u0006\u000f\uffff\uffff\u0000\u00c3\u00c4\u0003 \u0010\u0000\u00c4"+
		"\u001f\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0019\u0000\u0000\u00c7\u00c8\u0003\"\u0011\u0000\u00c8\u00c9"+
		"\u0006\u0010\uffff\uffff\u0000\u00c9\u00ca\u0003 \u0010\u0000\u00ca\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cd\u0006\u0010\uffff\uffff\u0000\u00cc"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"!\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000\u00cf\u00d0"+
		"\u0003\u0016\u000b\u0000\u00d0\u00d1\u0006\u0011\uffff\uffff\u0000\u00d1"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d4\u0006\u0011\uffff\uffff\u0000"+
		"\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u000e\u0000\u0000\u00d6"+
		"\u00d7\u0005\u0019\u0000\u0000\u00d7\u00d8\u0006\u0012\uffff\uffff\u0000"+
		"\u00d8\u00d9\u0003&\u0013\u0000\u00d9\u00da\u0003,\u0016\u0000\u00da\u00db"+
		"\u0005\u0003\u0000\u0000\u00db\u00dc\u0005\u000e\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0019\u0000\u0000\u00dd%\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\f\u0000\u0000\u00df\u00e0\u0003(\u0014\u0000\u00e0\u00e1\u0005\r\u0000"+
		"\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\'\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0019\u0000\u0000"+
		"\u00e6\u00e7\u0006\u0014\uffff\uffff\u0000\u00e7\u00e8\u0003*\u0015\u0000"+
		"\u00e8)\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0005\u0000\u0000\u00ea"+
		"\u00ed\u0003(\u0014\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed+\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0003\u001a\r\u0000\u00ef\u00f0\u0005\u0005"+
		"\u0000\u0000\u00f0\u00f1\u0005\u000f\u0000\u0000\u00f1\u00f2\u0005\f\u0000"+
		"\u0000\u00f2\u00f3\u0003.\u0017\u0000\u00f3\u00f4\u0005\r\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0019\u0000\u0000\u00f5\u00f6\u0006\u0016\uffff\uffff"+
		"\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000\u00f7\u00f8\u0003,\u0016\u0000"+
		"\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00ee\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb-\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0010\u0000\u0000\u00fd"+
		"\u0103\u0006\u0017\uffff\uffff\u0000\u00fe\u00ff\u0005\u0011\u0000\u0000"+
		"\u00ff\u0103\u0006\u0017\uffff\uffff\u0000\u0100\u0101\u0005\u0012\u0000"+
		"\u0000\u0101\u0103\u0006\u0017\uffff\uffff\u0000\u0102\u00fc\u0001\u0000"+
		"\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103/\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0013\u0000"+
		"\u0000\u0105\u0106\u0005\u0019\u0000\u0000\u0106\u0107\u0006\u0018\uffff"+
		"\uffff\u0000\u0107\u0108\u0005\f\u0000\u0000\u0108\u0109\u0003(\u0014"+
		"\u0000\u0109\u010a\u0005\r\u0000\u0000\u010a\u010b\u0003\u001a\r\u0000"+
		"\u010b\u010c\u0005\u0007\u0000\u0000\u010c\u010d\u0005\u0019\u0000\u0000"+
		"\u010d\u010e\u0006\u0018\uffff\uffff\u0000\u010e\u010f\u0005\u0002\u0000"+
		"\u0000\u010f\u0110\u00032\u0019\u0000\u0110\u0111\u0005\u0003\u0000\u0000"+
		"\u0111\u0112\u0005\u0013\u0000\u0000\u0112\u0113\u0005\u0019\u0000\u0000"+
		"\u01131\u0001\u0000\u0000\u0000\u0114\u0115\u0003\u001a\r\u0000\u0115"+
		"\u0116\u0005\u0005\u0000\u0000\u0116\u0117\u0005\u000f\u0000\u0000\u0117"+
		"\u0118\u0005\f\u0000\u0000\u0118\u0119\u0003.\u0017\u0000\u0119\u011a"+
		"\u0005\r\u0000\u0000\u011a\u011b\u0005\u0019\u0000\u0000\u011b\u011c\u0005"+
		"\u0002\u0000\u0000\u011c\u011d\u0006\u0019\uffff\uffff\u0000\u011d\u011e"+
		"\u00032\u0019\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u0121\u0001"+
		"\u0000\u0000\u0000\u0120\u0114\u0001\u0000\u0000\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u01213\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0019"+
		"\u0000\u0000\u0123\u0124\u0005\b\u0000\u0000\u0124\u0125\u00036\u001b"+
		"\u0000\u0125\u0126\u0005\u0002\u0000\u0000\u0126\u0127\u0006\u001a\uffff"+
		"\uffff\u0000\u0127\u012d\u0001\u0000\u0000\u0000\u0128\u0129\u0003D\""+
		"\u0000\u0129\u012a\u0005\u0002\u0000\u0000\u012a\u012b\u0006\u001a\uffff"+
		"\uffff\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0122\u0001\u0000"+
		"\u0000\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012d5\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0003>\u001f\u0000\u012f\u0130\u00038\u001c\u0000\u0130"+
		"\u0131\u0006\u001b\uffff\uffff\u0000\u01317\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0003:\u001d\u0000\u0133\u0134\u0003>\u001f\u0000\u0134\u0135\u0003"+
		"8\u001c\u0000\u0135\u0136\u0006\u001c\uffff\uffff\u0000\u0136\u0139\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0006\u001c\uffff\uffff\u0000\u0138\u0132"+
		"\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u01399\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0003<\u001e\u0000\u013b;\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0007\u0000\u0000\u0000\u013d=\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0003\u0016\u000b\u0000\u013f\u0140\u0006\u001f\uffff\uffff"+
		"\u0000\u0140\u014b\u0001\u0000\u0000\u0000\u0141\u0142\u0005\f\u0000\u0000"+
		"\u0142\u0143\u00036\u001b\u0000\u0143\u0144\u0005\r\u0000\u0000\u0144"+
		"\u0145\u0006\u001f\uffff\uffff\u0000\u0145\u014b\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005\u0019\u0000\u0000\u0147\u0148\u0003@ \u0000\u0148\u0149"+
		"\u0006\u001f\uffff\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u013e\u0001\u0000\u0000\u0000\u014a\u0141\u0001\u0000\u0000\u0000\u014a"+
		"\u0146\u0001\u0000\u0000\u0000\u014b?\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005\f\u0000\u0000\u014d\u014e\u00036\u001b\u0000\u014e\u014f\u0003"+
		"B!\u0000\u014f\u0150\u0005\r\u0000\u0000\u0150\u0151\u0006 \uffff\uffff"+
		"\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0154\u0006 \uffff\uffff"+
		"\u0000\u0153\u014c\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154A\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0005\u0000\u0000"+
		"\u0156\u0157\u00036\u001b\u0000\u0157\u0158\u0003B!\u0000\u0158\u0159"+
		"\u0006!\uffff\uffff\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u0006!\uffff\uffff\u0000\u015b\u0155\u0001\u0000\u0000\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015cC\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"\u0018\u0000\u0000\u015e\u015f\u0005\u0019\u0000\u0000\u015f\u0160\u0003"+
		"F#\u0000\u0160\u0161\u0006\"\uffff\uffff\u0000\u0161E\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\f\u0000\u0000\u0163\u0164\u00036\u001b\u0000"+
		"\u0164\u0165\u0003B!\u0000\u0165\u0166\u0005\r\u0000\u0000\u0166\u0167"+
		"\u0006#\uffff\uffff\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u016a"+
		"\u0006#\uffff\uffff\u0000\u0169\u0162\u0001\u0000\u0000\u0000\u0169\u0168"+
		"\u0001\u0000\u0000\u0000\u016aG\u0001\u0000\u0000\u0000\u0017X`ju\u0080"+
		"\u0087\u009b\u00a9\u00b7\u00be\u00cc\u00d3\u00e3\u00ec\u00fa\u0102\u0120"+
		"\u012c\u0138\u014a\u0153\u015b\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}