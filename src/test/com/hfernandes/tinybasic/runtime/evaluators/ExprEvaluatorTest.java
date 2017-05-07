package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.antlrstrap.ErrorListener;
import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramState;
import com.hfernandes.tinybasic.runtime.evaluators.ExprEvaluator;
import com.hfernandes.tinybasic.runtime.vals.Value;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExprEvaluatorTest {
    // get an expression context from an expression string
    ParserErrorTuple parse(String program) {
        ErrorListener errorListener = new ErrorListener();

        CharStream input = CharStreams.fromString(program, "<sourcename>");
        TinyBasicLexer lexer = new TinyBasicLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TinyBasicParser parser = new TinyBasicParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        return new ParserErrorTuple(parser, errorListener);
    }

    TinyBasicParser.ExpressionContext parseExpr(String exprString) throws AntlrException {
        ParserErrorTuple tuple = parse(exprString);
        TinyBasicParser.ExpressionContext tree = tuple.parser.expression();
        tuple.errors.raiseErrors();
        return tree;
    }

    TinyBasicParser.FactorContext parseFactor(String exprString) throws AntlrException {
        ParserErrorTuple tuple = parse(exprString);
        TinyBasicParser.FactorContext factor = tuple.parser.factor();
        tuple.errors.raiseErrors();
        return factor;
    }

    TinyBasicParser.TermContext parseTerm(String exprString) throws AntlrException {
        ParserErrorTuple tuple = parse(exprString);
        TinyBasicParser.TermContext term = tuple.parser.term();
        tuple.errors.raiseErrors();
        return term;
    }

    @Test
    void test_simple_numbers() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("42"));
        assertEquals(v.val.longValue(), 42);
    }

    @Test
    void test_negative_numbers() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("-3"));
        assertEquals(v.val.longValue(), -3);
    }

    @Test
    void test_adding() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("20 + 5"));
        assertEquals(25, v.val.longValue());
    }

    @Test
    void test_adding_multi() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("20 + 5 + 16"));
        assertEquals(41, v.val.longValue());
    }

    @Test
    void test_subtracting() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("20 - 5"));
        assertEquals(15, v.val.longValue());
    }

    @Test
    void test_subtracting_multi() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("20 - 5 - 4"));
        assertEquals(11, v.val.longValue());
    }

    @Test
    void test_subtracting_groupable() throws Exception {
        Value v = ExprEvaluator.evaluate(new ProgramState(), parseExpr("20 - (5 - 4)"));
        assertEquals(19, v.val.longValue());
    }

    @Test
    void test_simple_factor() throws Exception {
        Value v = ExprEvaluator.evaluateFactor(new ProgramState(), parseFactor("9"));
        assertEquals(v.val.longValue(), 9);
    }

    @Test
    void test_var_factor() throws Exception {
        ProgramState ps = new ProgramState();
        ps.varMap.put("X", new Value(666));
        Value v = ExprEvaluator.evaluateFactor(ps, parseFactor("X"));
        assertEquals(666, v.val.longValue());
    }

    @Test
    void test_factor_parens() throws Exception {
        Value v = ExprEvaluator.evaluateFactor(new ProgramState(), parseFactor("( 10 )"));
        assertEquals(v.val.longValue(), 10);
    }

    @Test
    void test_term_evals_multiplication() throws Exception {
        Value v = ExprEvaluator.evaluateTerm(new ProgramState(), parseTerm("3 * 10"));
        assertEquals(30, v.val.longValue());
    }

    @Test
    void test_term_evals_multiplication_multi() throws Exception {
        Value v = ExprEvaluator.evaluateTerm(new ProgramState(), parseTerm("3 * 10 * 2"));
        assertEquals(60, v.val.longValue());
    }

    @Test
    void test_term_evals_division() throws Exception {
        Value v = ExprEvaluator.evaluateTerm(new ProgramState(), parseTerm("10 / 3"));
        assertEquals(3, v.val.longValue());
    }
}

class ParserErrorTuple {
    public TinyBasicParser parser;
    public ErrorListener errors;

    public ParserErrorTuple(TinyBasicParser parser, ErrorListener errors) {
        this.parser = parser;
        this.errors = errors;
    }
}
