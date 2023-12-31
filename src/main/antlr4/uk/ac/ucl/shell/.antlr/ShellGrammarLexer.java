// Generated from c:\Users\Lucas\Programming\Java\shell\dockerWorkingShell\java-shell-j3\src\main\antlr4\u005Cuk\ac\u005Cucl\shell\ShellGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShellGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, PIPEOP=2, REDIRECTIN=3, REDIRECTOUT=4, WHITESPACE=5, UNQUOTED=6, 
		SINGLEQUOTED=7, BACKQUOTE=8, DOUBLEQUOTED=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "PIPEOP", "REDIRECTIN", "REDIRECTOUT", "WHITESPACE", "BACKQUOTE_fragment", 
			"UNQUOTED", "SINGLEQUOTED", "BACKQUOTE", "DOUBLEQUOTED"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'|'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "PIPEOP", "REDIRECTIN", "REDIRECTOUT", "WHITESPACE", 
			"UNQUOTED", "SINGLEQUOTED", "BACKQUOTE", "DOUBLEQUOTED"
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


	public ShellGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ShellGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13G\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6!\n\6\r\6\16\6\"\3\7\3\7\7"+
		"\7\'\n\7\f\7\16\7*\13\7\3\7\3\7\3\b\6\b/\n\b\r\b\16\b\60\3\t\3\t\7\t\65"+
		"\n\t\f\t\16\t8\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13A\n\13\f\13\16"+
		"\13D\13\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\25"+
		"\13\3\2\7\4\2\13\13\"\"\4\2\f\fbb\n\2\13\f\"\"$$))=>@@bb~~\4\2\f\f))\4"+
		"\2\f\f$$\2K\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5"+
		"\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13 \3\2\2\2\r$\3\2\2\2\17.\3\2\2"+
		"\2\21\62\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27\30\7=\2\2\30\4\3\2\2\2\31"+
		"\32\7~\2\2\32\6\3\2\2\2\33\34\7>\2\2\34\b\3\2\2\2\35\36\7@\2\2\36\n\3"+
		"\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\f\3\2"+
		"\2\2$(\7b\2\2%\'\n\3\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3"+
		"\2\2\2*(\3\2\2\2+,\7b\2\2,\16\3\2\2\2-/\n\4\2\2.-\3\2\2\2/\60\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\20\3\2\2\2\62\66\7)\2\2\63\65\n\5\2\2\64"+
		"\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3"+
		"\2\2\29:\7)\2\2:\22\3\2\2\2;<\5\r\7\2<\24\3\2\2\2=B\7$\2\2>A\5\r\7\2?"+
		"A\n\6\2\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
		"DB\3\2\2\2EF\7$\2\2F\26\3\2\2\2\t\2\"(\60\66@B\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}