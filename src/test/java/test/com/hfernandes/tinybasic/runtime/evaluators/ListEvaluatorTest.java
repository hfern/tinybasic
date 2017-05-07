package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class ListEvaluatorTest extends TestBase {
    @Test
    public void testListStatement() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("LET X=0\nLIST\n");
        runProgram(program);
        assertProgramOutputted("LET X=0\nLIST\n");
    }
}