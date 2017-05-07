package com.hfernandes.tinybasic;

import com.hfernandes.tinybasic.antlrstrap.AntlrException;
import com.hfernandes.tinybasic.generated.TinyBasicParser;
import com.hfernandes.tinybasic.runtime.ProgramEvaluator;
import com.hfernandes.tinybasic.runtime.ProgramState;
import com.hfernandes.tinybasic.runtime.exceptions.StopExecutionException;
import com.hfernandes.tinybasic.runtime.exceptions.TinyBasicException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        ProgramOptions options = ProgramOptions.fromArgs(args);

        if (options.showHelp) {
            System.out.println(ProgramOptions.usage());
            return;
        }

        if (options.fileName == null) {
            System.out.println("Please specify file to run. See --help");
            return;
        }

        run(options);
    }

    public static void run(ProgramOptions options) {
        ParseTree tree;

        try {
            tree = ProgramParser.getParseTree(options.fileName, options.showGui);

            if (options.showGui) {
                return;
            }
        } catch (IOException e) {
            System.out.println("That file doesn't exist!");
            return;
        } catch (AntlrException e) {
            System.out.println(e.getParseErrorMessage());
            return;
        }

        ProgramEvaluator evaluator = new ProgramEvaluator(new ProgramState());
        evaluator.setProgram((TinyBasicParser.ProgramContext) tree);

        try {
            for (int stepCount = 0; evaluator.step(); stepCount++) {
                // pass :)
            }
        } catch (StopExecutionException e) {
            System.out.println("(The program explicitly exited with status " + e.statusCode + ")");
        } catch (TinyBasicException e) {
            System.out.println("An error occurred during execution: " + e);
            e.printStackTrace();
            return;
        }
    }
}
