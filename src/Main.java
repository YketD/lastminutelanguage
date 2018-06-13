import Model.Types;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by marce on 09-Feb-17.
 */
public class Main
{
    public static void main(String[] args)
    {
        LastMinuteLexer lexer = null;

        try
        {
            lexer = new LastMinuteLexer(CharStreams.fromFileName("MyApp.lm"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LastMinuteParser parser = new LastMinuteParser(tokens);
            LastMinuteParser.StatementContext programTree = parser.statement();

            TypeChecker checker = new TypeChecker();
            Types value = checker.visit(programTree);

            System.out.println("====================================");

            // Code generation
            CodeGenerator codeGenerator = new CodeGenerator("test.lm", checker.getScopeTree(), checker.getFuncTree());
            codeGenerator.visit(programTree);
            codeGenerator.getPrintWriter().flush();
            codeGenerator.getPrintWriter().close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
