// Generated from TinyBasic.g4 by ANTLR 4.7
package com.hfernandes.tinybasic.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyBasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, COMMA=2, ADD=3, SUB=4, MUL=5, DIV=6, LPAREN=7, RPAREN=8, PRINT=9, 
		IF=10, THEN=11, GOTO=12, INPUT=13, LET=14, GOSUB=15, RETURN=16, CLEAR=17, 
		LIST=18, RUN=19, END=20, VAR=21, DIGIT=22, CR=23, STRING=24, RELOP=25, 
		WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQUAL", "COMMA", "ADD", "SUB", "MUL", "DIV", "LPAREN", "RPAREN", "PRINT", 
		"IF", "THEN", "GOTO", "INPUT", "LET", "GOSUB", "RETURN", "CLEAR", "LIST", 
		"RUN", "END", "VAR", "DIGIT", "CR", "STRING", "RELOP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'PRINT'", 
		"'IF'", "'THEN'", "'GOTO'", "'INPUT'", "'LET'", "'GOSUB'", "'RETURN'", 
		"'CLEAR'", "'LIST'", "'RUN'", "'END'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUAL", "COMMA", "ADD", "SUB", "MUL", "DIV", "LPAREN", "RPAREN", 
		"PRINT", "IF", "THEN", "GOTO", "INPUT", "LET", "GOSUB", "RETURN", "CLEAR", 
		"LIST", "RUN", "END", "VAR", "DIGIT", "CR", "STRING", "RELOP", "WS"
	};
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


	public TinyBasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyBasic.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26\u0086\n\26\r\26\16\26\u0087\3"+
		"\27\3\27\3\30\6\30\u008d\n\30\r\30\16\30\u008e\3\31\3\31\7\31\u0093\n"+
		"\31\f\31\16\31\u0096\13\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u009e\n"+
		"\32\3\32\3\32\3\32\3\32\5\32\u00a4\n\32\3\32\5\32\u00a7\n\32\3\33\6\33"+
		"\u00aa\n\33\r\33\16\33\u00ab\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\3\2\7\3\2C\\\3\2\62;\5\2\f\f\17\17AA\4"+
		"\2$$``\4\2\13\13\"\"\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3"+
		"\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17"+
		"C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31U\3\2\2\2"+
		"\33Z\3\2\2\2\35`\3\2\2\2\37d\3\2\2\2!j\3\2\2\2#q\3\2\2\2%w\3\2\2\2\'|"+
		"\3\2\2\2)\u0080\3\2\2\2+\u0085\3\2\2\2-\u0089\3\2\2\2/\u008c\3\2\2\2\61"+
		"\u0090\3\2\2\2\63\u00a6\3\2\2\2\65\u00a9\3\2\2\2\678\7?\2\28\4\3\2\2\2"+
		"9:\7.\2\2:\6\3\2\2\2;<\7-\2\2<\b\3\2\2\2=>\7/\2\2>\n\3\2\2\2?@\7,\2\2"+
		"@\f\3\2\2\2AB\7\61\2\2B\16\3\2\2\2CD\7*\2\2D\20\3\2\2\2EF\7+\2\2F\22\3"+
		"\2\2\2GH\7R\2\2HI\7T\2\2IJ\7K\2\2JK\7P\2\2KL\7V\2\2L\24\3\2\2\2MN\7K\2"+
		"\2NO\7H\2\2O\26\3\2\2\2PQ\7V\2\2QR\7J\2\2RS\7G\2\2ST\7P\2\2T\30\3\2\2"+
		"\2UV\7I\2\2VW\7Q\2\2WX\7V\2\2XY\7Q\2\2Y\32\3\2\2\2Z[\7K\2\2[\\\7P\2\2"+
		"\\]\7R\2\2]^\7W\2\2^_\7V\2\2_\34\3\2\2\2`a\7N\2\2ab\7G\2\2bc\7V\2\2c\36"+
		"\3\2\2\2de\7I\2\2ef\7Q\2\2fg\7U\2\2gh\7W\2\2hi\7D\2\2i \3\2\2\2jk\7T\2"+
		"\2kl\7G\2\2lm\7V\2\2mn\7W\2\2no\7T\2\2op\7P\2\2p\"\3\2\2\2qr\7E\2\2rs"+
		"\7N\2\2st\7G\2\2tu\7C\2\2uv\7T\2\2v$\3\2\2\2wx\7N\2\2xy\7K\2\2yz\7U\2"+
		"\2z{\7V\2\2{&\3\2\2\2|}\7T\2\2}~\7W\2\2~\177\7P\2\2\177(\3\2\2\2\u0080"+
		"\u0081\7G\2\2\u0081\u0082\7P\2\2\u0082\u0083\7F\2\2\u0083*\3\2\2\2\u0084"+
		"\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088,\3\2\2\2\u0089\u008a\t\3\2\2\u008a.\3\2"+
		"\2\2\u008b\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\60\3\2\2\2\u0090\u0094\7$\2\2"+
		"\u0091\u0093\t\5\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7$\2\2\u0098\62\3\2\2\2\u0099\u009d\7>\2\2\u009a\u009e\7@\2\2\u009b"+
		"\u009e\5\3\2\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a7\3\2\2\2\u009f\u00a3\7@\2\2\u00a0"+
		"\u00a4\7>\2\2\u00a1\u00a4\5\3\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a7\5\3\2\2\u00a6\u0099\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\64\3\2\2\2\u00a8\u00aa\t\6\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\b\33\2\2\u00ae\66\3\2\2\2\n\2\u0087\u008e\u0094\u009d\u00a3\u00a6"+
		"\u00ab\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}