import ANTLR.Calculator.CalculatorVisitorImpl;
import Calculator.CalculatorBaseVisitor;
import Calculator.CalculatorLexer;
import Calculator.CalculatorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {

        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString("5+4+2/3+5-7*9"));
        CalculatorParser parser = new CalculatorParser((new CommonTokenStream(lexer)));
//        parser.start();
        parser.setBuildParseTree(true);
        CalculatorParser.StartContext tree = parser.start();
        CalculatorBaseVisitor<String> visitor = new CalculatorVisitorImpl();
        visitor.visit(tree);
        System.out.println("parser has executed");
    }
}