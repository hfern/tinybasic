// Generated from TinyBasic.g4 by ANTLR 4.7
package com.hfernandes.tinybasic.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyBasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, VAR=9, 
		DIGIT=10, CR=11, STRING=12, RELOP=13, PRINT=14, IF=15, THEN=16, GOTO=17, 
		INPUT=18, LET=19, GOSUB=20, RETURN=21, CLEAR=22, LIST=23, RUN=24, END=25;
	public static final int
		RULE_line = 0, RULE_statement = 1, RULE_exprlist = 2, RULE_varlist = 3, 
		RULE_expression = 4, RULE_term = 5, RULE_factor = 6, RULE_number = 7;
	public static final String[] ruleNames = {
		"line", "statement", "exprlist", "varlist", "expression", "term", "factor", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "VAR", "DIGIT", 
		"CR", "STRING", "RELOP", "PRINT", "IF", "THEN", "GOTO", "INPUT", "LET", 
		"GOSUB", "RETURN", "CLEAR", "LIST", "RUN", "END"
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

	@Override
	public String getGrammarFileName() { return "TinyBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LineContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CR() { return getToken(TinyBasicParser.CR, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				number();
				setState(17);
				statement();
				setState(18);
				match(CR);
				}
				break;
			case PRINT:
			case IF:
			case GOTO:
			case INPUT:
			case LET:
			case GOSUB:
			case RETURN:
			case CLEAR:
			case LIST:
			case RUN:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				statement();
				setState(21);
				match(CR);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TinyBasicParser.PRINT, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IF() { return getToken(TinyBasicParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(TinyBasicParser.RELOP, 0); }
		public TerminalNode THEN() { return getToken(TinyBasicParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(TinyBasicParser.GOTO, 0); }
		public TerminalNode INPUT() { return getToken(TinyBasicParser.INPUT, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode LET() { return getToken(TinyBasicParser.LET, 0); }
		public TerminalNode VAR() { return getToken(TinyBasicParser.VAR, 0); }
		public TerminalNode GOSUB() { return getToken(TinyBasicParser.GOSUB, 0); }
		public TerminalNode RETURN() { return getToken(TinyBasicParser.RETURN, 0); }
		public TerminalNode CLEAR() { return getToken(TinyBasicParser.CLEAR, 0); }
		public TerminalNode LIST() { return getToken(TinyBasicParser.LIST, 0); }
		public TerminalNode RUN() { return getToken(TinyBasicParser.RUN, 0); }
		public TerminalNode END() { return getToken(TinyBasicParser.END, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(PRINT);
				setState(26);
				exprlist();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(IF);
				setState(28);
				expression();
				setState(29);
				match(RELOP);
				setState(30);
				expression();
				setState(31);
				match(THEN);
				setState(32);
				statement();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(GOTO);
				setState(35);
				expression();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(INPUT);
				setState(37);
				varlist();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(LET);
				setState(39);
				match(VAR);
				setState(40);
				match(T__0);
				setState(41);
				expression();
				}
				break;
			case GOSUB:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				match(GOSUB);
				setState(43);
				expression();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				match(RETURN);
				}
				break;
			case CLEAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				match(CLEAR);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				match(LIST);
				}
				break;
			case RUN:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				match(RUN);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 11);
				{
				setState(48);
				match(END);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(TinyBasicParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TinyBasicParser.STRING, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(51);
				match(STRING);
				}
				break;
			case T__2:
			case T__3:
			case T__6:
			case VAR:
			case DIGIT:
				{
				setState(52);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55);
				match(T__1);
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(56);
					match(STRING);
					}
					break;
				case T__2:
				case T__3:
				case T__6:
				case VAR:
				case DIGIT:
					{
					setState(57);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(TinyBasicParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(TinyBasicParser.VAR, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(VAR);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(66);
				match(T__1);
				setState(67);
				match(VAR);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(73);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(74);
				match(T__3);
				}
				break;
			case T__6:
			case VAR:
			case DIGIT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			term();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				term();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			factor();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				factor();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TinyBasicParser.VAR, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(VAR);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				number();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__6);
				setState(97);
				expression();
				setState(98);
				match(T__7);
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TinyBasicParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TinyBasicParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(DIGIT);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(103);
				match(DIGIT);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3\4\3\4\5\4"+
		"8\n\4\3\4\3\4\3\4\5\4=\n\4\7\4?\n\4\f\4\16\4B\13\4\3\5\3\5\3\5\7\5G\n"+
		"\5\f\5\16\5J\13\5\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\7\6T\n\6\f\6\16\6W"+
		"\13\6\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"g\n\b\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4"+
		"\3\2\5\6\3\2\7\b\2}\2\31\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\bC\3\2\2\2"+
		"\nN\3\2\2\2\fX\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22\23\5\20\t\2\23\24\5"+
		"\4\3\2\24\25\7\r\2\2\25\32\3\2\2\2\26\27\5\4\3\2\27\30\7\r\2\2\30\32\3"+
		"\2\2\2\31\22\3\2\2\2\31\26\3\2\2\2\32\3\3\2\2\2\33\34\7\20\2\2\34\64\5"+
		"\6\4\2\35\36\7\21\2\2\36\37\5\n\6\2\37 \7\17\2\2 !\5\n\6\2!\"\7\22\2\2"+
		"\"#\5\4\3\2#\64\3\2\2\2$%\7\23\2\2%\64\5\n\6\2&\'\7\24\2\2\'\64\5\b\5"+
		"\2()\7\25\2\2)*\7\13\2\2*+\7\3\2\2+\64\5\n\6\2,-\7\26\2\2-\64\5\n\6\2"+
		".\64\7\27\2\2/\64\7\30\2\2\60\64\7\31\2\2\61\64\7\32\2\2\62\64\7\33\2"+
		"\2\63\33\3\2\2\2\63\35\3\2\2\2\63$\3\2\2\2\63&\3\2\2\2\63(\3\2\2\2\63"+
		",\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3"+
		"\2\2\2\64\5\3\2\2\2\658\7\16\2\2\668\5\n\6\2\67\65\3\2\2\2\67\66\3\2\2"+
		"\28@\3\2\2\29<\7\4\2\2:=\7\16\2\2;=\5\n\6\2<:\3\2\2\2<;\3\2\2\2=?\3\2"+
		"\2\2>9\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\7\3\2\2\2B@\3\2\2\2CH\7"+
		"\13\2\2DE\7\4\2\2EG\7\13\2\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I"+
		"\t\3\2\2\2JH\3\2\2\2KO\7\5\2\2LO\7\6\2\2MO\3\2\2\2NK\3\2\2\2NL\3\2\2\2"+
		"NM\3\2\2\2OP\3\2\2\2PU\5\f\7\2QR\t\2\2\2RT\5\f\7\2SQ\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WU\3\2\2\2X]\5\16\b\2YZ\t\3\2\2Z\\\5\16"+
		"\b\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`g\7"+
		"\13\2\2ag\5\20\t\2bc\7\t\2\2cd\5\n\6\2de\7\n\2\2eg\3\2\2\2f`\3\2\2\2f"+
		"a\3\2\2\2fb\3\2\2\2g\17\3\2\2\2hl\7\f\2\2ik\7\f\2\2ji\3\2\2\2kn\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2m\21\3\2\2\2nl\3\2\2\2\r\31\63\67<@HNU]fl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}