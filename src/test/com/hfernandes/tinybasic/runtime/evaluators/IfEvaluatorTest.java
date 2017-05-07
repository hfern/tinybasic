package test.com.hfernandes.tinybasic.runtime.evaluators;

import com.hfernandes.tinybasic.generated.TinyBasicParser;
import org.junit.jupiter.api.Test;
import test.com.hfernandes.tinybasic.TestBase;

import static org.junit.jupiter.api.Assertions.*;

class IfEvaluatorTest extends TestBase {

    @Test
    public void testGreaterThan() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 1 > 0 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("999\r\n");
    }

    @Test
    public void testGreaterThanFalse() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 1 < 0 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("");
    }

    @Test
    public void testLessThan() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 0 < 1 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("999\r\n");
    }

    @Test
    public void testGreaterThanEquals() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 1 >= 1 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("999\r\n");
    }

    @Test
    public void testLessThanEquals() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 0 <= 0 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("999\r\n");
    }

    @Test
    public void testEquals() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 32 = 32 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("999\r\n");
    }

    @Test
    public void testNotEqualsFalse() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 32 <> 32 THEN PRINT 999\n");
        runProgram(program);
        assertProgramOutputted("");
    }

    @Test
    public void testIfCanDoOtherThings() throws Exception {
        TinyBasicParser.ProgramContext program = parseProgramString("IF 32 = 32 THEN LET X = 100\n");
        runProgram(program);
        assertEquals(100, _pstate.getVarVal("X").val.longValue());
    }

    @Test
    public void ifGosubTest() throws Exception {
        String programSource = "" +
                "10 GOTO 35\n" +
                "20 PRINT \"h\"\n" +
                "25 LET X = X+1\n" +
                "30 RETURN\n" +
                "35 LET X=0\n" +
                "40 IF X < 5 THEN GOSUB 20\n";
        TinyBasicParser.ProgramContext program = parseProgramString(programSource);
        runProgram(program);
        assertProgramOutputted("h\r\nh\r\nh\r\nh\r\nh\r\n");
    }
}
