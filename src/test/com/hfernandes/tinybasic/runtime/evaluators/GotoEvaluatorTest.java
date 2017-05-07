package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class GotoEvaluatorTest extends TestBase {
    @Test
    public void testGoto() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("GOTO 20\nPRINT 123\n20 PRINT 5\n");
        runProgram(program);
    }
}