package test.com.hfernandes.tinybasic.runtime.evaluator;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class PrintEvaluatorTest extends TestBase {
    @Test
    void testPrintsNumbers() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("PRINT 321\r\n");
        runProgram(program);
        assertProgramOutputted("321\r\n");
    }

    @Test
    void testPrintsStrings() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("PRINT \"Hey, Hunter :)\"\r\n");
        runProgram(program);
        assertProgramOutputted("Hey, Hunter :)\r\n");
    }

    @Test
    void testPrintsCombined() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("PRINT \"Num: \", 123\r\n");
        runProgram(program);
        assertProgramOutputted("Num: 123\r\n");
    }
}