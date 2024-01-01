// Generated from D:/My Files/SE_er/CompilerPrinciple/FinalProject/Task2/src/ANTLR/PL0.g4 by ANTLR 4.13.1
package ANTLR.PL0;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PL0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, BEGIN=2, END=3, CONST=4, VAR=5, WHILE=6, DO=7, IF=8, THEN=9, 
		LETTER=10, DIGIT=11, ADD_OPERATOR=12, MUL_OPERATOR=13, ASSIGN=14, EQ=15, 
		NEQ=16, GT=17, GTE=18, LT=19, LTE=20, LPAREN=21, RPAREN=22, SEMI=23, COMMA=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "BEGIN", "END", "CONST", "VAR", "WHILE", "DO", "IF", "THEN", 
			"LETTER", "DIGIT", "ADD_OPERATOR", "MUL_OPERATOR", "ASSIGN", "EQ", "NEQ", 
			"GT", "GTE", "LT", "LTE", "LPAREN", "RPAREN", "SEMI", "COMMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'CONST'", "'VAR'", "'WHILE'", 
			"'DO'", "'IF'", "'THEN'", null, null, null, null, "':='", "'='", "'<>'", 
			"'>'", "'>='", "'<'", "'<='", "'('", "')'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BEGIN", "END", "CONST", "VAR", "WHILE", "DO", "IF", 
			"THEN", "LETTER", "DIGIT", "ADD_OPERATOR", "MUL_OPERATOR", "ASSIGN", 
			"EQ", "NEQ", "GT", "GTE", "LT", "LTE", "LPAREN", "RPAREN", "SEMI", "COMMA", 
			"WS"
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


	public PL0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PL0.g4"; }

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
		"\u0004\u0000\u0019\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0004"+
		"\u0018\u0084\b\u0018\u000b\u0018\f\u0018\u0085\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u0000"+
		"09\u0002\u0000++--\u0002\u0000**//\u0003\u0000\t\n\r\r  \u0089\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u0003"+
		";\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007E\u0001"+
		"\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000"+
		"\u0000\rU\u0001\u0000\u0000\u0000\u000fX\u0001\u0000\u0000\u0000\u0011"+
		"[\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000\u0015b\u0001"+
		"\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019f\u0001\u0000\u0000"+
		"\u0000\u001bh\u0001\u0000\u0000\u0000\u001dk\u0001\u0000\u0000\u0000\u001f"+
		"m\u0001\u0000\u0000\u0000!p\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000"+
		"\u0000%u\u0001\u0000\u0000\u0000\'w\u0001\u0000\u0000\u0000)z\u0001\u0000"+
		"\u0000\u0000+|\u0001\u0000\u0000\u0000-~\u0001\u0000\u0000\u0000/\u0080"+
		"\u0001\u0000\u0000\u00001\u0083\u0001\u0000\u0000\u000034\u0005P\u0000"+
		"\u000045\u0005R\u0000\u000056\u0005O\u0000\u000067\u0005G\u0000\u0000"+
		"78\u0005R\u0000\u000089\u0005A\u0000\u00009:\u0005M\u0000\u0000:\u0002"+
		"\u0001\u0000\u0000\u0000;<\u0005B\u0000\u0000<=\u0005E\u0000\u0000=>\u0005"+
		"G\u0000\u0000>?\u0005I\u0000\u0000?@\u0005N\u0000\u0000@\u0004\u0001\u0000"+
		"\u0000\u0000AB\u0005E\u0000\u0000BC\u0005N\u0000\u0000CD\u0005D\u0000"+
		"\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005C\u0000\u0000FG\u0005O\u0000"+
		"\u0000GH\u0005N\u0000\u0000HI\u0005S\u0000\u0000IJ\u0005T\u0000\u0000"+
		"J\b\u0001\u0000\u0000\u0000KL\u0005V\u0000\u0000LM\u0005A\u0000\u0000"+
		"MN\u0005R\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005W\u0000\u0000"+
		"PQ\u0005H\u0000\u0000QR\u0005I\u0000\u0000RS\u0005L\u0000\u0000ST\u0005"+
		"E\u0000\u0000T\f\u0001\u0000\u0000\u0000UV\u0005D\u0000\u0000VW\u0005"+
		"O\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005I\u0000\u0000YZ\u0005"+
		"F\u0000\u0000Z\u0010\u0001\u0000\u0000\u0000[\\\u0005T\u0000\u0000\\]"+
		"\u0005H\u0000\u0000]^\u0005E\u0000\u0000^_\u0005N\u0000\u0000_\u0012\u0001"+
		"\u0000\u0000\u0000`a\u0007\u0000\u0000\u0000a\u0014\u0001\u0000\u0000"+
		"\u0000bc\u0007\u0001\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0007"+
		"\u0002\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0007\u0003\u0000"+
		"\u0000g\u001a\u0001\u0000\u0000\u0000hi\u0005:\u0000\u0000ij\u0005=\u0000"+
		"\u0000j\u001c\u0001\u0000\u0000\u0000kl\u0005=\u0000\u0000l\u001e\u0001"+
		"\u0000\u0000\u0000mn\u0005<\u0000\u0000no\u0005>\u0000\u0000o \u0001\u0000"+
		"\u0000\u0000pq\u0005>\u0000\u0000q\"\u0001\u0000\u0000\u0000rs\u0005>"+
		"\u0000\u0000st\u0005=\u0000\u0000t$\u0001\u0000\u0000\u0000uv\u0005<\u0000"+
		"\u0000v&\u0001\u0000\u0000\u0000wx\u0005<\u0000\u0000xy\u0005=\u0000\u0000"+
		"y(\u0001\u0000\u0000\u0000z{\u0005(\u0000\u0000{*\u0001\u0000\u0000\u0000"+
		"|}\u0005)\u0000\u0000},\u0001\u0000\u0000\u0000~\u007f\u0005;\u0000\u0000"+
		"\u007f.\u0001\u0000\u0000\u0000\u0080\u0081\u0005,\u0000\u0000\u00810"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0004\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0018\u0000\u0000\u00882\u0001"+
		"\u0000\u0000\u0000\u0002\u0000\u0085\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}