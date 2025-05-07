import AST.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import rules.angularLexer;
import rules.angularParser;
import visitor.AngularVisitor;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        String source = "tests/AngularTest.txt";
        CharStream st = fromFileName(source);
        angularLexer lexer = new angularLexer(st);
        CommonTokenStream token = new CommonTokenStream(lexer);
        angularParser parser = new angularParser(token);
        ParseTree tree = parser.program();
        Program doc = (Program) new AngularVisitor().visit(tree);
        System.out.println(doc);
    }
}