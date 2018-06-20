import Model.Function;
import Model.Scope;
import Model.Symbol;
import Model.Types;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.RuleNode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;

public class CodeGenerator extends LastMinuteBaseVisitor {
    private String fileName;
    private PrintWriter printWriter;
    private ParseTreeProperty scopeTree, funcTree;
    private StringBuilder functions;
    private String className;

    private boolean global = true;

    public CodeGenerator(String fileName, ParseTreeProperty scopeTree, ParseTreeProperty funcTree) throws FileNotFoundException, UnsupportedEncodingException {
        this.fileName = fileName;
        this.scopeTree = scopeTree;
        this.funcTree = funcTree;
        this.printWriter = new PrintWriter(fileName, "UTF-8");
        this.functions = new StringBuilder();
        this.className = this.fileName.split("\\.")[0];

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
        printWriter.println("\r\n\taload_0");
        printWriter.println("\r\n\tnew " + this.fileName.split("\\.")[0]);
        printWriter.println("\tdup");
        printWriter.println("\tinvokespecial  " + className + "/<init>()V");
        printWriter.println("\tinvokespecial  " + className + "/run()V");

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
            Function func = (Function) funcTree.get(ctx);
            functions.append("\taload_0\n");
            functions.append("\tinvokevirtual " + className + "/" + title + "()" +  Symbol.getMnenonic(func.getReturnType()) + "\n");

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
            System.err.println("cant print array lol");
        } else if (type == Types.IDENTIFIER) {
/*
            String varName = ctx.extendedparams().varvalue().get(0).identifier().getText();
            Scope scope = (Scope) scopeTree.get(ctx);
            Symbol symbol = scope.lookupVariable(varName);

            loadVar(symbol.getType(), symbol.getId(), printWriter);
            */
        } else {
            print(getVariable(ctx.extendedparams().varvalue(0).identifier().getText()));
        }
    }

    private String getVariable(String identifier) {
        return ("TODO: get the variable (value) in the getVariable() function");
    }

    @Override
    public Object visitCalculation(LastMinuteParser.CalculationContext ctx) {
        if (ctx.calcVal() != null)
        pushcalcval(ctx.calcVal());

        if (ctx.calcMore() != null)
            visitCalcMore(ctx.calcMore().get(0));
        return super.visitCalculation(ctx);
    }

    @Override
    public Object visitCalcMore(LastMinuteParser.CalcMoreContext ctx) {
        if (ctx.PLUS() != null){
            pushcalcval(ctx.calcVal());
            printWriter.println("iadd");
        }
        if (ctx.MINUS() != null){
            pushcalcval(ctx.calcVal());
            printWriter.println("isub");
        }
        if (ctx.TIMES() != null){
            pushcalcval(ctx.calcVal());
            printWriter.println("imult");
        }
        if (ctx.DIVIDE() != null){
            pushcalcval(ctx.calcVal());
            printWriter.println("idiv");
        }
        if (ctx.MODULO() != null){
            pushcalcval(ctx.calcVal());
            printWriter.println("imod");
        }
        return super.visitCalcMore(ctx);
    }

    private void pushcalcval(LastMinuteParser.CalcValContext ctx){
        if (ctx.varvalnum()!=null){
            printWriter.println("bipush " + ctx.varvalnum().INT().getText());
        }   else if (ctx.varvalfloat()!=null){
            printWriter.println("ldc " + ctx.varvalfloat().INT(0).getText() + "." +  ctx.varvalfloat().INT(1).getText());
        }   else if (ctx.identifier()!= null){
            print(getVariable(ctx.identifier().getText()));
        }
    }

    private void calculate(String operator){
        //print out the operator
    }

//    @Override
//    public Object visitCalcVal(LastMinuteParser.CalcValContext ctx) {
//        if (ctx.varvalfloat() != null){
//
//        }if (ctx.varvalnum() != null){
//
//        }if (ctx.identifier() != null){
//
//        }if (ctx.)
//        return super.visitCalcVal(ctx);
//    }

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
        {
            visit(body);
            /*
            if (body.funccall() != null)
                visit(body.funccall());
            else if (body.if_else() != null)
                print("\"Todo: visit if else\"");
            else if (body.vardecl() != null)
                print("\"Todo: visit vardecl\"");
            else if (body.varcalc() != null)
                print("\"todo: visit varcalc\"");
            */
        }

        global = true;


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
            functions.append("\t    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n");
        } else {
            printWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
            printWriter.println("\tldc " + print);
            printWriter.println("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V ");
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
            } catch (NumberFormatException e) { }

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
        else if (symbolType == Types.BOOL)
        {
            try {
                pw.append("\ticonst_" + (rawValue.equals("true") ? 1 : 0) + "\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else // float, string
        {
            try {
                pw.append("\tldc " + rawValue + "\r\n");
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

    @Override
    public Object visitVartrans(LastMinuteParser.VartransContext ctx) {
        //get the variable
        Types type = fromContext(ctx.varvalue());
        if (type == Types.INT){
            pushVar(type, ctx.varvalue().varvalnum().getText(), printWriter);
            printWriter.println("iadd");
            Symbol symbol = new Symbol(ctx.identifier().getText(), type);
            storeVar(type, symbol.getId(), printWriter);
        }   else if (type == Types.FLOAT){
            pushVar(type, ctx.varvalue().varvalfloat().getText(), printWriter);
            Symbol symbol = new Symbol(ctx.identifier().getText(), type);
            printWriter.println("fadd");
            storeVar(type, symbol.getId(), printWriter);
        }   else if (type == Types.STRING){
            Symbol symbol = new Symbol(ctx.identifier().getText(), type);

            printWriter.println("new java/lang/StringBuilder");
            printWriter.println("dup");
            printWriter.println("invokespecial java/lang/StringBuilder/<init>()V");
            loadVar(type, symbol.getId(), printWriter);
            printWriter.println("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            printWriter.println("ldc " + ctx.varvalue().varvalstring().getText());
            printWriter.println("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            printWriter.println("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");
            storeVar(type, symbol.getId(), printWriter);

        }   else if (type == Types.BOOL){
            System.err.println("bool cant be transformed with +:");
        }
        return super.visitVartrans(ctx);
    }

    @Override
    public Object visitForloop(LastMinuteParser.ForloopContext ctx)
    {
        /*
        :   FOR
            OPENPAR
            vardecl condition ENDL varcalc
            CLOSEPAR
            body
         */
        Scope scope = (Scope) scopeTree.get(ctx);

        visit(ctx.vardecl());

        printWriter.println("\t" + scope.getName() + ":");

        visit(ctx.condition());
        printWriter.println(scope.getName() + "_end");

        visit(ctx.body());

        visit(ctx.varcalc());

        printWriter.println("\tgoto " + scope.getName());
        printWriter.println("\t" + scope.getName() + "_end:");

        return null;
    }

    @Override
    public Object visitIf_else(LastMinuteParser.If_elseContext ctx)
    {
        Scope scope = (Scope) scopeTree.get(ctx);

        visit(ctx.conditionalbody().condition());
        printWriter.println(scope.getName() + "_end");
        visit(ctx.conditionalbody().body());

        //printWriter.println("\tgoto " + scope.getName() + "_end");

        if (ctx.if_else() != null && !ctx.if_else().isEmpty())
            visitChildren((RuleNode) ctx.if_else());

        if (ctx.body() != null)
            visit(ctx.body());

        printWriter.println("\t" + scope.getName() + "_end:");

        return null;
    }

    @Override
    public Object visitWhileloop(LastMinuteParser.WhileloopContext ctx)
    {
        Scope scope = (Scope) scopeTree.get(ctx);

        printWriter.println("\t" + scope.getName() + ":");

        visit(ctx.conditionalbody().condition());
        printWriter.println(scope.getName() + "_end");
        visit(ctx.conditionalbody().body());

        printWriter.println("\tgoto " + scope.getName());
        printWriter.println("\t" + scope.getName() + "_end:");

        return null;
    }

    public Types fromContext(LastMinuteParser.VarvalueContext ctx) {
        Types type;
        if (ctx.varvalarray() != null)
            type = (Types.ARRAY);
        else if (ctx.identifier() != null)
            type = (Types.IDENTIFIER);
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

/*
        condition
        :   NOT condition                           #InverseCondition
        |   varvalue EQUALS varvalue                #CompareCondition
        |   varvalue NOTEQUAL varvalue            #NotEqualCondition
        |   condition AND condition                 #AndCondition
        |   condition OR condition                  #OrCondition
        |   varvalbool                              #BoolCondition
        |   varvalue operator varvalue            #OperatorCondition
        ;
 */

    @Override
    public Object visitOperatorCondition(LastMinuteParser.OperatorConditionContext ctx)
    {
        System.out.println("entered visitOperatorCondition");

        pushVar(Types.INT, ctx.varvalue(0).getText(), printWriter);
        pushVar(Types.INT, ctx.varvalue(1).getText(), printWriter);

        if (ctx.operator().getText().equals("<="))
            printWriter.print("\tif_icmpgt ");

        else if (ctx.operator().getText().equals(">="))
            printWriter.print("\tif_icmplt ");

        else if (ctx.operator().getText().equals("<"))
            printWriter.print("\tif_icmpge ");

        else if (ctx.operator().getText().equals(">"))
            printWriter.print("\tif_icmple ");

        return null;
    }

    @Override
    public Object visitBoolCondition(LastMinuteParser.BoolConditionContext ctx)
    {
        System.out.println("entered visitBoolCondition");

        pushVar(Types.INT, ctx.varvalbool().getText().equals("true") ? "1" : "0", printWriter);
        pushVar(Types.INT, "1", printWriter);

        printWriter.print("\tif_icmpne ");

        return null;
    }

    @Override
    public Object visitInverseCondition(LastMinuteParser.InverseConditionContext ctx)
    {
        System.out.println("TODO visitInverseCondition");
        return super.visitInverseCondition(ctx);
    }

    @Override
    public Object visitAndCondition(LastMinuteParser.AndConditionContext ctx)
    {
        System.out.println("TODO visitAndCondition");
        return super.visitAndCondition(ctx);
    }

    @Override
    public Object visitOrCondition(LastMinuteParser.OrConditionContext ctx)
    {
        System.out.println("TODO visitOrCondition");
        return super.visitOrCondition(ctx);
    }

    @Override
    public Object visitCompareCondition(LastMinuteParser.CompareConditionContext ctx)
    {
        System.out.println("TODO visitCompareCondition");

        pushVar(Types.INT, ctx.varvalue(0).getText(), printWriter);
        pushVar(Types.INT, ctx.varvalue(1).getText(), printWriter);

        printWriter.print("\tif_icmpne ");
        return null;
    }

    @Override
    public Object visitNotEqualCondition(LastMinuteParser.NotEqualConditionContext ctx)
    {
        System.out.println("TODO visitNotEqualCondition");

        pushVar(Types.INT, ctx.varvalue(0).getText(), printWriter);
        pushVar(Types.INT, ctx.varvalue(1).getText(), printWriter);

        printWriter.print("\tif_icmpeq ");
        return null;
    }
}

