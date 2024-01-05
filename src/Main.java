import ANTLR.PL0.PL0Lexer;
import ANTLR.PL0.PL0Parser;
import ANTLR.PL0.PL0VisitorImpl;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {

//        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString("5+4+2/3+5-7*9"));
//        CalculatorParser parser = new CalculatorParser((new CommonTokenStream(lexer)));
//        parser.start();
//        parser.setBuildParseTree(true);
//        CalculatorParser.StartContext tree = parser.start();
//        CalculatorBaseVisitor<String> visitor = new CalculatorVisitorImpl();
//        visitor.visit(tree);
//        System.out.println("parser has executed");

//        String input = """
//                PROGRAM test
//                CONST a = 1;
//                VAR b, c;
//
//                BEGIN
//                  b := b + a;
//                END
//                """;

        String input = """
                PROGRAM add
                VAR x,y;
                BEGIN
                    x:=1;
                    y:=2;
                    WHILE x<5 DO x:=x+1;
                    IF y>0 THEN y:=y-1;
                    y:=y+x
                END
                """;

        PL0Lexer lexer = new PL0Lexer(CharStreams.fromString(input));
        PL0Parser parser = new PL0Parser((new CommonTokenStream(lexer)));
//        parser.start();
        parser.setBuildParseTree(true);
        PL0Parser.StartContext tree = parser.start();
//        PL0BaseVisitor<String> visitor = new PL0VisitorImpl();
        PL0VisitorImpl visitor = new PL0VisitorImpl();
        visitor.visit(tree);
        visitor.printCode();

        System.out.println("parser has executed");
    }
}