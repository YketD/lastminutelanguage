import Model.Function;
import Model.Scope;
import Model.Symbol;
import Model.Types;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CodeGenerator extends LastMinuteBaseVisitor {
    private String fileName;
    private PrintWriter printWriter;
    private ParseTreeProperty scopeTree, funcTree;
    private StringBuilder functions;

    private boolean global = true;

    public CodeGenerator(String fileName, ParseTreeProperty scopeTree, ParseTreeProperty funcTree) throws FileNotFoundException, UnsupportedEncodingException {
        this.fileName = fileName;
        this.scopeTree = scopeTree;
        this.funcTree = funcTree;
        this.printWriter = new PrintWriter(fileName, "UTF-8");
        this.functions = new StringBuilder();

        createClass();
        createMainMethod();
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    private void createClass() throws FileNotFoundException, UnsupportedEncodingException {
        printWriter.println(".class public " + this.fileName.split("\\.")[0]
                + "\r\n.super java/lang/Object" +
                "\r\n\r\n.method public <init>()V" +
                "\r\n\taload_0" +
                "\r\n\tinvokespecial java/lang/Object/<init>()V" +
                "\r\n\treturn" +
                "\r\n.end method\r\n");
    }

    private void createMainMethod() {
        printWriter.println(".method public static main([Ljava/lang/String;)V");
        printWriter.println("\t.limit stack 5");
        printWriter.println("\t.limit locals 1");
        printWriter.println("\r\n\taload 0");
        printWriter.println("\r\n\tnew " + this.fileName.split("\\.")[0]);
        printWriter.println("\tdup");
        printWriter.println("\tinvokespecial  " + this.fileName.split("\\.")[0] + "/<init>()V");
        printWriter.println("\tinvokespecial  " + this.fileName.split("\\.")[0] + "/run()V");

        printWriter.println("\r\n\treturn");
        printWriter.println(".end method\r\n");

//        if (ctx.methodeUITVOERING() != null) {
//            for (int i = 0; i < ctx.methodeUITVOERING().size(); i++) {
//                visit(ctx.methodeUITVOERING(i));
//                printWriter.println("");
//            }
//        }
    }

    public void createRunMethod() {
        printWriter.println("\r\n.method public run()V");
        printWriter.println("\t.limit stack 100");// + (globalScope.getLocalStack() + 1));
        printWriter.println("\t.limit locals 100\r\n"); // + (globalScope.getLocalAmount()) + "\r\n");

        printWriter.print(functions.toString());

        printWriter.println("\r\n\treturn");
        printWriter.println(".end method\r\n");
    }

    @Override
    public Object visitFunccall(LastMinuteParser.FunccallContext ctx) {
        if (ctx.identifier().getText().equals("print")) {
            printcall(ctx);
        } else {
            String title = ctx.identifier().getText();
            functions.append("\taload_0 \n");
            functions.append("\tinvokevirtual test/" + title + "()V \n");

        }
        return super.visitFunccall(ctx);
    }

    private void printcall(LastMinuteParser.FunccallContext ctx) {
        System.out.println("print function called");
        System.out.println(fromContext(ctx.extendedparams().varvalue(0)));
        Types type = fromContext(ctx.extendedparams().varvalue(0));
        String print = "";
        if (type == Types.STRING) {
            print(ctx.extendedparams().varvalue().get(0).varvalstring().getText());
        } else if (type == Types.INT) {
            print("\"" + ctx.extendedparams().varvalue().get(0).varvalnum().getText() + "\"");
        } else if (type == Types.FLOAT) {
            print("\"" + ctx.extendedparams().varvalue().get(0).varvalfloat().getText() + "\"");
        } else if (type == Types.BOOL) {
            print("\"" + ctx.extendedparams().varvalue().get(0).varvalbool().getText() + "\"");
        } else if (type == Types.CHAR) {
            print("\"" + ctx.extendedparams().varvalue().get(0).varvalchar().getText() + "\"");
        } else if (type == Types.ARRAY) {
            System.err.println("cant print array");
        } else {
            print(getVariable(ctx.extendedparams().varvalue(0).identifier().getText()));
        }
    }

    private String getVariable(String identifier) {
        return ("TODO: get the variable (value) in the getVariable() function");
    }

    @Override
    public Object visitFuncdecl(LastMinuteParser.FuncdeclContext ctx) {
        global = false;
        printWriter.print(".method public " + ctx.identifier().getText() + "(");
        System.out.println("entered funcdecl");
        Function func = (Function) funcTree.get(ctx);
        for (Symbol param : func.getParams()) {
            printWriter.print(Symbol.getMnenonic(param.getType()));
            printWriter.print(";");
        }

        printWriter.println(")" + (func.getReturnType() == Types.UNASSIGNED ? "V" :
                Symbol.getMnenonic(func.getReturnType())));

        printWriter.println("\t.limit stack 100\r\n" +
                "\t.limit locals 100");

        for (LastMinuteParser.FuncbodyContext body : ctx.funcbody())
            if (body.funccall() != null)
                visit(body.funccall());
            else if (body.if_else() != null)
                print("\"Todo: visit if else\"");
            else if (body.vardecl() != null)
                print("\"Todo: visit vardecl\"");
            else if (body.varcalc() != null)
                print("\"todo: visit varcalc\"");
        visit(ctx.funcreturn());

        global = true;
        visit(ctx.funcreturn());

        if (func.getReturnType() != Types.UNASSIGNED) {
            if (func.getReturnId() != -1)
                loadVar(func.getReturnType(), func.getReturnId(), printWriter);
            else
                pushVar(func.getReturnType(), ctx.funcreturn().returnVar.getText(), printWriter);
        }
        createReturn(func.getReturnType(), printWriter);

        printWriter.println(".end method\r\n");

        return null;
    }

    private void createReturn(Types symbolType, Appendable pw)
    {
        try
        {
            switch (symbolType)
            {
                case BOOL:
                case INT:
                    pw.append("\tireturn\r\n");
                    break;
                case FLOAT:
                    pw.append("\tfreturn\r\n");
                    break;
                case STRING:
                    pw.append("\tareturn\r\n");
                    break;
                default:
                    pw.append("\treturn\r\n");
                    break;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void print (String print){
        if (global) {
            functions.append("\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            functions.append("\tldc " + print + "\n");
            functions.append("\t    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V \n");
        } else {
            printWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
            printWriter.println("\tldc " + print);
            printWriter.println("\tinvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V ");
        }
    }

    private void storeVar(Types symbolType, int id, Appendable pw) {
        try {
            switch (symbolType) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadVar(Types symbolType, int id, Appendable pw) {
        try {
            switch (symbolType) {
                case BOOL:
                case INT:
                    pw.append("\tiload " + id + "\r\n");
                    break;
                case FLOAT:
                    pw.append("\tfload " + id + "\r\n");
                    break;
                case STRING:
                    pw.append("\taload " + id + "\r\n");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void pushVar(Types symbolType, String rawValue, Appendable pw) {
        if (symbolType == Types.INT) {
            int value = 0;
            try {
                value = Integer.valueOf(rawValue);
            } catch (NumberFormatException e) {
            }

            try {
                if (value >= 0 && value < 128) {
                    pw.append("\tbipush " + value + "\r\n");
                } else if (value >= 128 && value < 32768) {
                    pw.append("\tsipush " + value + "\r\n");
                } else {
                    pw.append("\tldc " + value + "\r\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Object visitFuncbody(LastMinuteParser.FuncbodyContext ctx) {
        return super.visitFuncbody(ctx);
    }

    @Override
    public Object visitSetVariable(LastMinuteParser.SetVariableContext ctx) {
        Scope scope = (Scope) scopeTree.get(ctx);
        Symbol symbol = (Symbol) funcTree.get(ctx);

        Appendable pw = (scope.getName().equals("global") ? functions : printWriter);

        pushVar(symbol.getType(), ctx.varvalue().getText(), pw);
        storeVar(symbol.getType(), symbol.getId(), pw);

        return super.visitSetVariable(ctx);
    }

    public Types fromContext(LastMinuteParser.VarvalueContext ctx) {
        Types type;
        if (ctx.varvalarray() != null)
            type = (Types.ARRAY);
        else if (ctx.varvalbool() != null)
            type = (Types.BOOL);
        else if (ctx.varvalchar() != null)
            type = (Types.CHAR);
        else if (ctx.varvalnum() != null)
            type = (Types.INT);
        else if (ctx.varvalstring() != null)
            type = (Types.STRING);
        else {
            type = null;
        }
        return type;
    }
    //visitStatement

    //visitCalculation

    //visitFuncDecl

    //visitFuncCall


}
