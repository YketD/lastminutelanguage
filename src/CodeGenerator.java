import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CodeGenerator extends LastMinuteBaseVisitor
{
    private String fileName;
    private PrintWriter printWriter;
    private ParseTreeProperty scopeTree, funcTree;

    public CodeGenerator(String fileName, ParseTreeProperty scopeTree, ParseTreeProperty funcTree) throws FileNotFoundException, UnsupportedEncodingException
    {
        this.fileName = fileName;
        this.scopeTree = scopeTree;
        this.funcTree = funcTree;

        createClass();
    }

    private void createClass() throws FileNotFoundException, UnsupportedEncodingException
    {
        printWriter = new PrintWriter(fileName, "UTF-8");
        printWriter.println(".class public " + this.fileName
                + "\r\n.super java/lang/Object" +
                "\r\n\r\n.method public <init>()V" +
                "\r\n\t.limit stack 5" +
                "\r\n\t.limit locals 1" +
                "\r\n\taload_0" +
                "\r\n\tinvokespecial java/lang/Object/<init>()V" +
                "\r\n\treturn" +
                "\r\n.end method\r\n");
    }

    @Override
    public Object visitParams(LastMinuteParser.ParamsContext ctx)
    {
        return null;
    }

    //visitStatement

    //visitCalculation

    //visitFuncDecl

    //visitFuncCall

    
}
