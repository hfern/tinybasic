package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class GosubEvaluatorTest extends TestBase {
    @Test
    public void testGosubWorks() throws Exception {
        String programText = "" +
                "GOTO 30\n" +
                "20 PRINT 7\n" +
                "RETURN\n" +
                "30 PRINT \"start \"\n" +
                "GOSUB 20\n" +
                "GOSUB 20\n" +
                "GOSUB 20\n";
        TinyBasicParser.ProgramContext program = parseProgramString(programText);
        runProgram(program);
        assertProgramOutputted("start \r\n7\r\n7\r\n7\r\n");
    }
}