import ANTLR.PL0.PL0Lexer;
import ANTLR.PL0.PL0Parser;
import ANTLR.PL0.PL0VisitorImpl;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/source.txt";
        String sourceCode = null;

        try {
            sourceCode = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println(sourceCode);
        } catch (IOException e) {
            System.out.println("源程序文件读取失败");
            return;
        }

        int startAddr = 0;

        try {
            PL0Lexer lexer = new PL0Lexer(CharStreams.fromString(sourceCode));
            PL0Parser parser = new PL0Parser((new CommonTokenStream(lexer)));

            parser.setBuildParseTree(true);
            PL0Parser.StartContext tree = parser.start();

            PL0VisitorImpl visitor = new PL0VisitorImpl(startAddr);
            visitor.visit(tree);
            visitor.printCode();

            System.out.println("parser has executed");
        }catch (Exception e){
            System.out.println("源代码不符合语法规范");
        }
    }
}