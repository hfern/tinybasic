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
		PRINT=1, IF=2, THEN=3, GOTO=4, INPUT=5, LET=6, GOSUB=7, RETURN=8, CLEAR=9, 
		LIST=10, RUN=11, END=12, VAR=13, DIGIT=14, CR=15, STRING=16, EQUALS=17, 
		COMMA=18, ADD=19, SUB=20, MUL=21, DIV=22, LPAREN=23, RPAREN=24, RELOP=25, 
		WS=26, COMMENT=27;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_exprlist = 3, 
		RULE_varlist = 4, RULE_expression = 5, RULE_term = 6, RULE_factor = 7, 
		RULE_number = 8;
	public static final String[] ruleNames = {
		"program", "line", "statement", "exprlist", "varlist", "expression", "term", 
		"factor", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PRINT'", "'IF'", "'THEN'", "'GOTO'", "'INPUT'", "'LET'", "'GOSUB'", 
		"'RETURN'", "'CLEAR'", "'LIST'", "'RUN'", "'END'", null, null, null, null, 
		"'='", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRINT", "IF", "THEN", "GOTO", "INPUT", "LET", "GOSUB", "RETURN", 
		"CLEAR", "LIST", "RUN", "END", "VAR", "DIGIT", "CR", "STRING", "EQUALS", 
		"COMMA", "ADD", "SUB", "MUL", "DIV", "LPAREN", "RPAREN", "RELOP", "WS", 
		"COMMENT"
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
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyBasicListener ) ((TinyBasicListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << GOTO) | (1L << INPUT) | (1L << LET) | (1L << GOSUB) | (1L << RETURN) | (1L << CLEAR) | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << DIGIT) | (1L << CR))) != 0)) {
				{
				{
				setState(18);
				line();
				}
				}
				setState(23);
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
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				number();
				setState(25);
				statement();
				setState(26);
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
				setState(28);
				statement();
				setState(29);
				match(CR);
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
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
		public TerminalNode THEN() { return getToken(TinyBasicParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RELOP() { return getToken(TinyBasicParser.RELOP, 0); }
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
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(PRINT);
				setState(35);
				exprlist();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(IF);
				setState(37);
				expression();
				setState(38);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==RELOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				expression();
				setState(40);
				match(THEN);
				setState(41);
				statement();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(GOTO);
				setState(44);
				expression();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(INPUT);
				setState(46);
				varlist();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(LET);
				setState(48);
				match(VAR);
				setState(49);
				match(EQUALS);
				setState(50);
				expression();
				}
				break;
			case GOSUB:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(GOSUB);
				setState(52);
				expression();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				match(RETURN);
				}
				break;
			case CLEAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				match(CLEAR);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				match(LIST);
				}
				break;
			case RUN:
				enterOuterAlt(_localctx, 10);
				{
				setState(56);
				match(RUN);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 11);
				{
				setState(57);
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
		public List<TerminalNode> COMMA() { return getTokens(TinyBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyBasicParser.COMMA, i);
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
		enterRule(_localctx, 6, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(60);
				match(STRING);
				}
				break;
			case VAR:
			case DIGIT:
			case ADD:
			case SUB:
			case LPAREN:
				{
				setState(61);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64);
				match(COMMA);
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(65);
					match(STRING);
					}
					break;
				case VAR:
				case DIGIT:
				case ADD:
				case SUB:
				case LPAREN:
					{
					setState(66);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(73);
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
		public List<TerminalNode> COMMA() { return getTokens(TinyBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TinyBasicParser.COMMA, i);
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
		enterRule(_localctx, 8, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(VAR);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				match(VAR);
				}
				}
				setState(81);
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
		public List<TerminalNode> ADD() { return getTokens(TinyBasicParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(TinyBasicParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(TinyBasicParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(TinyBasicParser.SUB, i);
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
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(82);
				match(ADD);
				}
				break;
			case SUB:
				{
				setState(83);
				match(SUB);
				}
				break;
			case VAR:
			case DIGIT:
			case LPAREN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			term();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				term();
				}
				}
				setState(94);
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
		public List<TerminalNode> MUL() { return getTokens(TinyBasicParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(TinyBasicParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TinyBasicParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TinyBasicParser.DIV, i);
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
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			factor();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				factor();
				}
				}
				setState(102);
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
		public TerminalNode LPAREN() { return getToken(TinyBasicParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TinyBasicParser.RPAREN, 0); }
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
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(VAR);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				number();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(LPAREN);
				setState(106);
				expression();
				setState(107);
				match(RPAREN);
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
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DIGIT);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(112);
				match(DIGIT);
				}
				}
				setState(117);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\5\5A\n\5\3\5\3\5\3\5\5\5F\n\5\7\5"+
		"H\n\5\f\5\16\5K\13\5\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\7\3\7\3\7\5"+
		"\7X\n\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\b\3\b\3\b\7\be\n\b\f\b\16"+
		"\bh\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\7\nt\n\n\f\n\16\nw\13"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\4\2\23\23\33\33\3\2\25\26\3\2\27"+
		"\30\2\u0087\2\27\3\2\2\2\4\"\3\2\2\2\6<\3\2\2\2\b@\3\2\2\2\nL\3\2\2\2"+
		"\fW\3\2\2\2\16a\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24\26\5\4\3\2\25\24\3"+
		"\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3"+
		"\2\2\2\32\33\5\22\n\2\33\34\5\6\4\2\34\35\7\21\2\2\35#\3\2\2\2\36\37\5"+
		"\6\4\2\37 \7\21\2\2 #\3\2\2\2!#\7\21\2\2\"\32\3\2\2\2\"\36\3\2\2\2\"!"+
		"\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%=\5\b\5\2&\'\7\4\2\2\'(\5\f\7\2()\t\2\2"+
		"\2)*\5\f\7\2*+\7\5\2\2+,\5\6\4\2,=\3\2\2\2-.\7\6\2\2.=\5\f\7\2/\60\7\7"+
		"\2\2\60=\5\n\6\2\61\62\7\b\2\2\62\63\7\17\2\2\63\64\7\23\2\2\64=\5\f\7"+
		"\2\65\66\7\t\2\2\66=\5\f\7\2\67=\7\n\2\28=\7\13\2\29=\7\f\2\2:=\7\r\2"+
		"\2;=\7\16\2\2<$\3\2\2\2<&\3\2\2\2<-\3\2\2\2</\3\2\2\2<\61\3\2\2\2<\65"+
		"\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\7\3\2\2"+
		"\2>A\7\22\2\2?A\5\f\7\2@>\3\2\2\2@?\3\2\2\2AI\3\2\2\2BE\7\24\2\2CF\7\22"+
		"\2\2DF\5\f\7\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GB\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2J\t\3\2\2\2KI\3\2\2\2LQ\7\17\2\2MN\7\24\2\2NP\7\17\2\2O"+
		"M\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2SQ\3\2\2\2TX\7\25\2"+
		"\2UX\7\26\2\2VX\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2Y^\5\16"+
		"\b\2Z[\t\3\2\2[]\5\16\b\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r"+
		"\3\2\2\2`^\3\2\2\2af\5\20\t\2bc\t\4\2\2ce\5\20\t\2db\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hf\3\2\2\2ip\7\17\2\2jp\5\22\n\2kl\7\31"+
		"\2\2lm\5\f\7\2mn\7\32\2\2np\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2p\21"+
		"\3\2\2\2qu\7\20\2\2rt\7\20\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"v\23\3\2\2\2wu\3\2\2\2\16\27\"<@EIQW^fou";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}