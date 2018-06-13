import Model.Function;
import Model.Scope;
import Model.Symbol;
import Model.Types;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CodeGenerator extends LastMinuteBaseVisitor
{
    private String fileName;
    private PrintWriter printWriter;
    private ParseTreeProperty scopeTree, funcTree;
    private StringBuilder functions;

    public CodeGenerator(String fileName, ParseTreeProperty scopeTree, ParseTreeProperty funcTree) throws FileNotFoundException, UnsupportedEncodingException
    {
        this.fileName = fileName;
        this.scopeTree = scopeTree;
        this.funcTree = funcTree;
        this.printWriter = new PrintWriter(fileName, "UTF-8");
        this.functions = new StringBuilder();

        createClass();
        createMainMethod();
    }

    public PrintWriter getPrintWriter()
    {
        return printWriter;
    }

    private void createClass() throws FileNotFoundException, UnsupportedEncodingException
    {
        printWriter.println(".class public " + this.fileName.split("\\.")[0]
                + "\r\n.super java/lang/Object" +
                "\r\n\r\n.method public <init>()V" +
                "\r\n\taload_0" +
                "\r\n\tinvokespecial java/lang/Object/<init>()V" +
                "\r\n\treturn" +
                "\r\n.end method\r\n");
    }

    private void createMainMethod()
    {
        printWriter.println(".method public static main([Ljava/lang/String;)V");
        printWriter.println("\t.limit stack 5");
        printWriter.println("\t.limit locals 1");
        printWriter.println("\r\n\taload 0");
        printWriter.println("\r\n\tnew " + this.fileName.split("\\.")[0]);
        printWriter.println("\tdup");
        printWriter.println("\tinvokespecial  " + this.fileName.split("\\.")[0] + "/<init>()V");
        printWriter.println("\tinvokespecial  " + this.fileName.split("\\.")[0] + "/run()V");



        printWriter.println("\r\n\treturn");
        printWriter.println(".end method");

//        if (ctx.methodeUITVOERING() != null) {
//            for (int i = 0; i < ctx.methodeUITVOERING().size(); i++) {
//                visit(ctx.methodeUITVOERING(i));
//                printWriter.println("");
//            }
//        }
    }

    public void createRunMethod()
    {
        printWriter.println("\r\n.method public run()V");
        printWriter.println("\t.limit stack 2");// + (globalScope.getLocalStack() + 1));
        printWriter.println("\t.limit locals 2\r\n"); // + (globalScope.getLocalAmount()) + "\r\n");

        printWriter.print(functions.toString());

        printWriter.println("\r\n\treturn");
        printWriter.println(".end method\r\n");
    }

    @Override
    public Object visitFunccall(LastMinuteParser.FunccallContext ctx) {
        if (ctx.identifier().getText().equals("print")){
            System.out.println("print function called");
            System.out.println(ctx.extendedparams().varvalue().get(0).varvalstring().STRING());
            functions.append("\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            functions.append("\tldc " + ctx.extendedparams().varvalue().get(0).varvalstring().getText()+ "\n");
           functions.append("\t    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V \n");
        }
        return super.visitFunccall(ctx);
    }

    @Override
    public Object visitFuncdecl(LastMinuteParser.FuncdeclContext ctx)
    {

        printWriter.print(".method public " + ctx.identifier().getText() + "(");
        System.out.println("entered funcdecl");
        Function method = (Function) funcTree.get(ctx);
        for(Symbol param : method.getParams())
        {
            printWriter.print(param.getMnenonic());
        }

        printWriter.println(";)V");

        printWriter.println("\t.limit stack 100\r\n" +
                "\t.limit locals 100");

        for(LastMinuteParser.FuncbodyContext body : ctx.funcbody())
            visit(body);

        visit(ctx.funcreturn());

        printWriter.println("return\r\n.end method");

        return null;
    }

    private void storeVar(Types symbolType, int id, Appendable pw)
    {
        try
        {
            switch (symbolType)
            {
                case BOOL:
                    pw.append("\tistore " + id + "\r\n");
                    break;
                case FLOAT:
                    pw.append("\tfstore " + id + "\r\n");
                    break;
                case INT:
                    pw.append("\tistore " + id + "\r\n");
                    break;
                case STRING:
                    pw.append("\tastore " + id + "\r\n");
                    break;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void loadVar(Types symbolType, int id, Appendable pw)
    {
        try
        {
            switch (symbolType)
            {
                case BOOL:
                    pw.append("\tiload " + id + "\r\n");
                    break;
                case FLOAT:
                    pw.append("\tfload " + id + "\r\n");
                    break;
                case INT:
                    pw.append("\tiload " + id + "\r\n");
                    break;
                case STRING:
                    pw.append("\taload " + id + "\r\n");
                    break;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void pushVar(Symbol symbol, String rawValue, Appendable pw)
    {
        if (symbol.getType() == Types.INT)
        {
            int value = 0;
            try { value = Integer.valueOf(rawValue); }
            catch (NumberFormatException e) {}

            try
            {
                if (value >= 0 && value < 128) {
                    pw.append("\tbipush " + value + "\r\n");
                } else if (value >= 128 && value < 32768) {
                    pw.append("\tsipush " + value + "\r\n");
                } else {
                    pw.append("\tldc " + value + "\r\n");
                }

            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Object visitFuncbody(LastMinuteParser.FuncbodyContext ctx)
    {
        return super.visitFuncbody(ctx);
    }

    @Override
    public Object visitSetVariable(LastMinuteParser.SetVariableContext ctx)
    {
        Scope scope = (Scope) scopeTree.get(ctx);
        Symbol symbol = (Symbol) funcTree.get(ctx);

        Appendable pw = (scope.getName().equals("global") ? functions : printWriter);

        pushVar(symbol, ctx.varvalue().getText(), pw);
        storeVar(symbol.getType(), symbol.getId(), pw);

        return super.visitSetVariable(ctx);
    }

    //visitStatement

    //visitCalculation

    //visitFuncDecl

    //visitFuncCall


}
