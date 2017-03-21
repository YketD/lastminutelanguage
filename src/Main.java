import nl.saxion.maryke.lastmin.LastMinuteLexer;
import nl.saxion.maryke.lastmin.LastMinuteParser;
import org.antlr.v4.runtime.ANTLRFileStream;
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
            lexer = new LastMinuteLexer(new ANTLRFileStream("MyApp.lm"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LastMinuteParser parser = new LastMinuteParser(tokens);
            LastMinuteParser.StatementContext programTree = parser.statement();

            TypeChecker checker = new TypeChecker();
            Types value = checker.visit(programTree);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}