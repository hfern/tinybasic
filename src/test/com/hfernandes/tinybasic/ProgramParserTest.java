package test.com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.ProgramParser;
import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramParserTest extends TestBase {
    @Test
    public void testEchoPasses() throws Exception {
        ProgramParser.getParseTree("fixtures/echo1.basic");
    }

    @Test
    public void testCommentsAccepted() throws Exception {
        ProgramParser.getParseTree("fixtures/has-comment.basic");
    }

    @Test
    public void testSyntaxErrorRejects() throws Exception {

        try {
            ProgramParser.getParseTree("fixtures/parse-error.basic");
            fail("Did not throw parse error exception");
        } catch (AntlrException e) {
        }
    }

    @Test
    public void testAcceptsEmptyInput() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("");
        runProgram(program);
        assertProgramOutputted("");
    }

    @Test
    public void testAcceptsEmptyNewlines() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("\n\n");
        runProgram(program);
        assertProgramOutputted("");
    }

    @Test
    public void testAcceptsNewlinesBetweenStatements() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("\nLET X=10\nPRINT X\n");
        runProgram(program);
        assertProgramOutputted("10\r\n");
    }
}