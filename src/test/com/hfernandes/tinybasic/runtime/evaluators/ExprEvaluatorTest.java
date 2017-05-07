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
}

class ParserErrorTuple {
    public TinyBasicParser parser;
    public ErrorListener errors;

    public ParserErrorTuple(TinyBasicParser parser, ErrorListener errors) {
        this.parser = parser;
        this.errors = errors;
    }
}
