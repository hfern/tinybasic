package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class InputEvaluatorTest extends TestBase {
    @Test
    public void testInputWorks() throws Exception {
        setInputString("666\n");
        TinyBasicParser.ProgramContext program = parseProgramString("INPUT X\n");
        runProgram(program);
        assertEquals(666, _pstate.getVarVal("X").val.longValue());
    }

    @Test
    public void testInputMulti() throws Exception {
        setInputString("666\n888\n");
        TinyBasicParser.ProgramContext program = parseProgramString("INPUT X, Y\n");
        runProgram(program);
        assertEquals(666, _pstate.getVarVal("X").val.longValue());
        assertEquals(888, _pstate.getVarVal("Y").val.longValue());
    }
}