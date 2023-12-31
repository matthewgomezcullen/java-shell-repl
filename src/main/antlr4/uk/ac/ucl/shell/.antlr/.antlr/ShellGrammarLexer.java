// Generated from c:\Users\Lucas\Programming\Java\shell\java-shell-j3\src\main\antlr4\u005Cuk\ac\u005Cucl\shell\.antlr\ShellGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, PIPEOP=2, NONSPECIAL=3, DOUBLEQUOTED=4, SINGLEQUOTED=5, APPS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PIPEOP", "NONSPECIAL", "DOUBLEQUOTED", "SINGLEQUOTED", "APPS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PIPEOP", "NONSPECIAL", "DOUBLEQUOTED", "SINGLEQUOTED", "APPS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\63\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\6\4\25\n"+
		"\4\r\4\16\4\26\3\5\3\5\7\5\33\n\5\f\5\16\5\36\13\5\3\5\3\5\3\6\3\6\7\6"+
		"$\n\6\f\6\16\6\'\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\62\n\7\2"+
		"\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\5\5\2$$))==\3\2$$\3\2))\2\67\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17"+
		"\3\2\2\2\5\21\3\2\2\2\7\24\3\2\2\2\t\30\3\2\2\2\13!\3\2\2\2\r\61\3\2\2"+
		"\2\17\20\7=\2\2\20\4\3\2\2\2\21\22\7~\2\2\22\6\3\2\2\2\23\25\n\2\2\2\24"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\b\3\2\2\2\30"+
		"\34\7$\2\2\31\33\n\3\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7$\2\2 \n\3\2\2\2!%\7)\2\2"+
		"\"$\n\4\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2"+
		"\2\2()\7)\2\2)\f\3\2\2\2*+\7e\2\2+,\7c\2\2,\62\7v\2\2-.\7n\2\2.\62\7u"+
		"\2\2/\60\7e\2\2\60\62\7f\2\2\61*\3\2\2\2\61-\3\2\2\2\61/\3\2\2\2\62\16"+
		"\3\2\2\2\7\2\26\34%\61\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}