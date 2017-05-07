# Tiny Basic

Created by Hunter Fernandes for Sean Kirkpatrick's Spring 2017 Java Class @ SRJC.

## About this project

The lexing & parsing phases were done using Antlr4. After writing a few
languages, you realize automated tooling can it faster & better than you can.

So this implementation lets Antlr build the AST and then builds the logic on
top of the AST and then evaluates.

1. Lex/Parse by Antlr to get language AST.
2. Create a ProgramState to use in execution.
2. Walk AST to get program metadata (e.g. line jump numbers). Load this into PS.
3. Start evaluation of first statement in the program.

Then, for each statement:

1. Figure out which statement evaluator we are going to dispatch.
    - This is very easy since the first token in a statement is what type it is.
2. Increment PC (in ProgramState).
3. Dispatch to statement evaluator with mutable ProgramState.


## Extensions to the Standard
- Variable names are able to be longer than just one character.
- A trailing comma may optionally be given to `PRINT` to prevent trailing newline from being printed. E.g. `PRINT 3,` -> `3`. Whereas `PRINT 3` -> `3\r\n`.


## Project Direction / Considerations
- There are perf gains to be had from a transformation between Antlr's heavy AST
    to a thinner language-specific AST as an intermediate step.
- It would be nice to support different kinds of variables instead of just integers.
- Some sort of stack system would be nice too.
- Program Labels instead of jumping to numbers.
