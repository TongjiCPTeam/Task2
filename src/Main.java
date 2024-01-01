import ANTLR.PL0.PL0Lexer;
import ANTLR.PL0.PL0Parser;
import ANTLR.PL0.PL0BaseVisitor;
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

        PL0Lexer lexer = new PL0Lexer(CharStreams.fromString("PROGRAM test CONST a = 1; VAR b,c; BEGIN b:=b+a; END"));
        PL0Parser parser = new PL0Parser((new CommonTokenStream(lexer)));
//        parser.start();
        parser.setBuildParseTree(true);
        PL0Parser.StartContext tree = parser.start();
        PL0BaseVisitor<String> visitor = new PL0VisitorImpl();
        visitor.visit(tree);

        System.out.println("parser has executed");
    }
}