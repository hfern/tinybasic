package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.generated.TinyBasicParser.ProgramContext;
import com.hfernandes.tinybasic.runtime.exceptions.StopExecutionException;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class EndEvaluatorTest extends TestBase {
    @Test
    public void testStopsExecution() throws Exception {
        ProgramContext program = parseProgramString("PRINT 1\r\nEND\r\nPRINT 2\r\n");

        try {
            runProgram(program);
            fail("Program should have stopped");
        } catch (StopExecutionException e) {
            assertProgramOutputted("1\r\n");
            assertEquals(0, e.statusCode);
        }
    }
}