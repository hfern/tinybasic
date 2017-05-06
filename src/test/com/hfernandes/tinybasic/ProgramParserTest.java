package test.com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.ProgramParser;
import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramParserTest extends TestCase {
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
}