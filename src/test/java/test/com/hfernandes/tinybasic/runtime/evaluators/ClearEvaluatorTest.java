package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class ClearEvaluatorTest extends TestBase {

    @Test
    public void testClearsScreen() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("CLEAR\n");
        runProgram(program);

        StringBuilder expect = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            expect.append("\n");
        }

        assertProgramOutputted(expect.toString());
    }
}