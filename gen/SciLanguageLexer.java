// Generated from C:/Users/armii/Documents/Universidad/Estructura_Datos_Avanzada/Exams/sci2c-compiler/src/SciLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SciLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENT=1, NUM_INT_CONST=2, NUM_REAL_CONST=3, STRING_CONST=4, COMMENTARY=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENTARY", 
			"LETTER", "DIGIT", "SIGN", "STRING_SIMPLE", "STRING_DOUBLE", "TEXT", 
			"EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMMENTARY"
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


	public SciLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SciLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0005{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001e\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0004"+
		"\u0001%\b\u0001\u000b\u0001\f\u0001&\u0001\u0002\u0001\u0002\u0004\u0002"+
		"+\b\u0002\u000b\u0002\f\u0002,\u0001\u0002\u0001\u0002\u0004\u00021\b"+
		"\u0002\u000b\u0002\f\u00022\u0001\u0002\u0001\u0002\u0004\u00027\b\u0002"+
		"\u000b\u0002\f\u00028\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		">\b\u0002\u000b\u0002\f\u0002?\u0001\u0002\u0001\u0002\u0004\u0002D\b"+
		"\u0002\u000b\u0002\f\u0002E\u0001\u0002\u0001\u0002\u0004\u0002J\b\u0002"+
		"\u000b\u0002\f\u0002K\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"Q\b\u0002\u000b\u0002\f\u0002R\u0003\u0002U\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003_\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0003\u0007l\b\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0004\ns\b\n\u000b\n\f\nt\u0001\u000b\u0003\u000bx\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013"+
		"\u0000\u0015\u0000\u0017\u0000\u0001\u0000\u0004\u0002\u0000EEee\u0002"+
		"\u0000AZaz\u0001\u000009\u0002\u0000\n\n\r\r\u0085\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000"+
		"\u0005T\u0001\u0000\u0000\u0000\u0007^\u0001\u0000\u0000\u0000\t`\u0001"+
		"\u0000\u0000\u0000\u000bf\u0001\u0000\u0000\u0000\rh\u0001\u0000\u0000"+
		"\u0000\u000fk\u0001\u0000\u0000\u0000\u0011m\u0001\u0000\u0000\u0000\u0013"+
		"o\u0001\u0000\u0000\u0000\u0015r\u0001\u0000\u0000\u0000\u0017w\u0001"+
		"\u0000\u0000\u0000\u0019\u001f\u0003\u000b\u0005\u0000\u001a\u001e\u0003"+
		"\u000b\u0005\u0000\u001b\u001e\u0003\r\u0006\u0000\u001c\u001e\u0005_"+
		"\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u0002\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0003"+
		"\u000f\u0007\u0000#%\u0003\r\u0006\u0000$#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'\u0004\u0001\u0000\u0000\u0000(*\u0003\u000f\u0007\u0000)+\u0003\r\u0006"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0005"+
		".\u0000\u0000/1\u0003\r\u0006\u00000/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3U\u0001\u0000\u0000\u000046\u0003\u000f\u0007\u000057\u0003\r\u0006\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0007\u0000"+
		"\u0000\u0000;=\u0003\u000f\u0007\u0000<>\u0003\r\u0006\u0000=<\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@U\u0001\u0000\u0000\u0000AC\u0003\u000f\u0007\u0000"+
		"BD\u0003\r\u0006\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0005.\u0000\u0000HJ\u0003\r\u0006\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0007\u0000\u0000\u0000NP\u0003"+
		"\u000f\u0007\u0000OQ\u0003\r\u0006\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000T(\u0001\u0000\u0000\u0000T4\u0001\u0000\u0000"+
		"\u0000TA\u0001\u0000\u0000\u0000U\u0006\u0001\u0000\u0000\u0000VW\u0005"+
		"\'\u0000\u0000WX\u0003\u0011\b\u0000XY\u0005\'\u0000\u0000Y_\u0001\u0000"+
		"\u0000\u0000Z[\u0005\"\u0000\u0000[\\\u0003\u0013\t\u0000\\]\u0005\"\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000^Z\u0001\u0000"+
		"\u0000\u0000_\b\u0001\u0000\u0000\u0000`a\u0005!\u0000\u0000ad\u0003\u0015"+
		"\n\u0000be\u0003\u0017\u000b\u0000ce\u0005\u0000\u0000\u0001db\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\n\u0001\u0000\u0000\u0000fg\u0007"+
		"\u0001\u0000\u0000g\f\u0001\u0000\u0000\u0000hi\u0007\u0002\u0000\u0000"+
		"i\u000e\u0001\u0000\u0000\u0000jl\u0005-\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000l\u0010\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u0012\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u0014\u0001\u0000\u0000\u0000qs\b\u0003\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vx\u0005\r\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0005\n\u0000\u0000z\u0018\u0001\u0000\u0000\u0000\u0011\u0000"+
		"\u001d\u001f&,28?EKRT^dktw\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}