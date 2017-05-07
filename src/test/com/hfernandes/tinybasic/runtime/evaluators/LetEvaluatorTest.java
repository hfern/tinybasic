package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class LetEvaluatorTest extends TestBase {
    @Test
    void testSavesVariable() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("LET X=432\r\n");
        runProgram(program);
        assertEquals(432, _pstate.getVarVal("X").val.longValue());
    }

    @Test
    void testSavesNegative() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("LET Y= -8\r\n");
        runProgram(program);
        assertEquals(-8, _pstate.getVarVal("Y").val.longValue());
    }
}