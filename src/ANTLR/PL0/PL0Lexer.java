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
			null, null, "'BEGIN'", "'END'", "'CONST'", "'VAR'", "'WHILE'", "'DO'", 
			"'IF'", "'THEN'", null, null, null, null, "':='", "'='", "'<>'", "'>'", 
			"'>='", "'<'", "'<='", "'('", "')'", "';'", "','"
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
		"\u0004\u0000\u0019\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u0000"+
		"8\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0004\u0018\u008c\b\u0018\u000b\u0018\f\u0018\u008d\u0001\u0018\u0001"+
		"\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0005\u0002\u0000"+
		"AZaz\u0001\u000009\u0002\u0000++--\u0002\u0000**//\u0003\u0000\t\n\r\r"+
		"  \u0092\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00016"+
		"\u0001\u0000\u0000\u0000\u0003C\u0001\u0000\u0000\u0000\u0005I\u0001\u0000"+
		"\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000"+
		"\u000bW\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000f`\u0001"+
		"\u0000\u0000\u0000\u0011c\u0001\u0000\u0000\u0000\u0013h\u0001\u0000\u0000"+
		"\u0000\u0015j\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019"+
		"n\u0001\u0000\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001ds\u0001"+
		"\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!x\u0001\u0000\u0000"+
		"\u0000#z\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000\u0000\'\u007f\u0001"+
		"\u0000\u0000\u0000)\u0082\u0001\u0000\u0000\u0000+\u0084\u0001\u0000\u0000"+
		"\u0000-\u0086\u0001\u0000\u0000\u0000/\u0088\u0001\u0000\u0000\u00001"+
		"\u008b\u0001\u0000\u0000\u000035\u00031\u0018\u000043\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005"+
		"P\u0000\u0000:;\u0005R\u0000\u0000;<\u0005O\u0000\u0000<=\u0005G\u0000"+
		"\u0000=>\u0005R\u0000\u0000>?\u0005A\u0000\u0000?@\u0005M\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u00031\u0018\u0000B\u0002\u0001\u0000\u0000"+
		"\u0000CD\u0005B\u0000\u0000DE\u0005E\u0000\u0000EF\u0005G\u0000\u0000"+
		"FG\u0005I\u0000\u0000GH\u0005N\u0000\u0000H\u0004\u0001\u0000\u0000\u0000"+
		"IJ\u0005E\u0000\u0000JK\u0005N\u0000\u0000KL\u0005D\u0000\u0000L\u0006"+
		"\u0001\u0000\u0000\u0000MN\u0005C\u0000\u0000NO\u0005O\u0000\u0000OP\u0005"+
		"N\u0000\u0000PQ\u0005S\u0000\u0000QR\u0005T\u0000\u0000R\b\u0001\u0000"+
		"\u0000\u0000ST\u0005V\u0000\u0000TU\u0005A\u0000\u0000UV\u0005R\u0000"+
		"\u0000V\n\u0001\u0000\u0000\u0000WX\u0005W\u0000\u0000XY\u0005H\u0000"+
		"\u0000YZ\u0005I\u0000\u0000Z[\u0005L\u0000\u0000[\\\u0005E\u0000\u0000"+
		"\\\f\u0001\u0000\u0000\u0000]^\u0005D\u0000\u0000^_\u0005O\u0000\u0000"+
		"_\u000e\u0001\u0000\u0000\u0000`a\u0005I\u0000\u0000ab\u0005F\u0000\u0000"+
		"b\u0010\u0001\u0000\u0000\u0000cd\u0005T\u0000\u0000de\u0005H\u0000\u0000"+
		"ef\u0005E\u0000\u0000fg\u0005N\u0000\u0000g\u0012\u0001\u0000\u0000\u0000"+
		"hi\u0007\u0000\u0000\u0000i\u0014\u0001\u0000\u0000\u0000jk\u0007\u0001"+
		"\u0000\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0007\u0002\u0000\u0000"+
		"m\u0018\u0001\u0000\u0000\u0000no\u0007\u0003\u0000\u0000o\u001a\u0001"+
		"\u0000\u0000\u0000pq\u0005:\u0000\u0000qr\u0005=\u0000\u0000r\u001c\u0001"+
		"\u0000\u0000\u0000st\u0005=\u0000\u0000t\u001e\u0001\u0000\u0000\u0000"+
		"uv\u0005<\u0000\u0000vw\u0005>\u0000\u0000w \u0001\u0000\u0000\u0000x"+
		"y\u0005>\u0000\u0000y\"\u0001\u0000\u0000\u0000z{\u0005>\u0000\u0000{"+
		"|\u0005=\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0005<\u0000\u0000~&"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005<\u0000\u0000\u0080\u0081\u0005"+
		"=\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\u0082\u0083\u0005(\u0000"+
		"\u0000\u0083*\u0001\u0000\u0000\u0000\u0084\u0085\u0005)\u0000\u0000\u0085"+
		",\u0001\u0000\u0000\u0000\u0086\u0087\u0005;\u0000\u0000\u0087.\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005,\u0000\u0000\u00890\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0007\u0004\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0006\u0018\u0000\u0000\u00902\u0001\u0000\u0000\u0000"+
		"\u0003\u00006\u008d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}