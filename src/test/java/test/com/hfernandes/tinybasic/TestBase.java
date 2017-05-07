package test.com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.antlrstrap.ErrorListener;
import com.hfernandes.tinybasic.generated.TinyBasicLexer;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramEvaluator;
import com.hfernandes.tinybasic.runtime.ProgramState;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBase {
    protected ProgramState _pstate;
    protected ByteArrayOutputStream _os;
    protected InputStream _is;

    public class ParserErrorTuple {
        public TinyBasicParser parser;
        public ErrorListener errors;

        public ParserErrorTuple(TinyBasicParser parser, ErrorListener errors) {
            this.parser = parser;
            this.errors = errors;
        }
    }

    @BeforeEach
    protected void setUp() throws Exception {
        _os = new ByteArrayOutputStream();
        _pstate = new ProgramState();
        _pstate.os = _os;
        setInputString("");
    }

    protected void setInputStream(InputStream is) {
        _is = is;
        _pstate.is = is;
    }

    protected void setInputString(String str) {
        setInputStream(new ByteArrayInputStream(str.getBytes()));
    }

    // get a partially constructed parser from the program
    // once you get this object, you can ask it to create an AST for a given token.
    // Be sure to also raise any errors in the errors element.
    protected ParserErrorTuple getParser(String program) {
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

    protected TinyBasicParser.ProgramContext parseProgramString(String program) throws AntlrException {
        ParserErrorTuple tuple = getParser(program);
        TinyBasicParser.ProgramContext tree = tuple.parser.program();
        tuple.errors.raiseErrors();
        return tree;
    }

    protected void runProgram(TinyBasicParser.ProgramContext program) throws Exception {
        ProgramEvaluator evaluator = new ProgramEvaluator(this._pstate);
        evaluator.setProgram(program);

        for (int stepCount = 0; evaluator.step(); stepCount++) {
            // pass :)
        }
    }

    protected void assertProgramOutputted(String expectedOutput) {
        assertEquals(expectedOutput, _os.toString());
    }
}
