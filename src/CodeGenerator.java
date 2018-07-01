import Model.Function;
import Model.Scope;
import Model.Symbol;
import Model.Types;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CodeGenerator extends LastMinuteBaseVisitor {
    private String fileName;
    private PrintWriter printWriter;
    private ParseTreeProperty scopeTree, funcTree;
    private StringBuilder functions;
    private String className;
    private boolean floatcalc = false;
    private ArrayList<String> values = new ArrayList<>();
    private ArrayList<Character> expressions = new ArrayList<>();
    private int subcount = 0, addcount = 0;
    private char bufferedexpression = '0';

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
        printWriter.append(".class public " + this.fileName.split("\\.")[0]
                + "\r\n.super java/lang/Object" +
                "\r\n\r\n.method public <init>()V" +
                "\r\n\taload_0" +
                "\r\n\tinvokespecial java/lang/Object/<init>()V" +
                "\r\n\treturn" +
                "\r\n.end method\r\n");
    }

    private void createMainMethod() {
        printWriter.append(".method public static main([Ljava/lang/String;)V           \n ");
        printWriter.append("\t.limit stack 5                                           \n ");
        printWriter.append("\t.limit locals 1                                          \n ");
        printWriter.append("\r\n\taload_0                                              \n ");
        printWriter.append("\r\n\tnew " + this.fileName.split("\\.")[0] + "\n");
        printWriter.append("\tdup                                                      \n ");
        printWriter.append("\tinvokespecial  " + className + "/<init>()V               \n ");
        printWriter.append("\tinvokespecial  " + className + "/run()V                  \n ");

        printWriter.append("\r\n\treturn                                               \n ");
        printWriter.append(".end method\r\n");

    }

    public void createRunMethod() {
        printWriter.append("\r\n.method public run()V\n");
        printWriter.append("\t.limit stack 100\n");// + (globalScope.getLocalStack() + 1));
        printWriter.append("\t.limit locals 100\r\n"); // + (globalScope.getLocalAmount()) + "\r\n");

        printWriter.print(functions.toString());
        printWriter.append("\r\n\treturn\n");
        printWriter.append(".end method\r\n");
    }

    @Override
    public Object visitFunccall(LastMinuteParser.FunccallContext ctx) {
        if (ctx.identifier().getText().equals("print")) {
            printcall(ctx);
        }
        else if (ctx.identifier().getText().equals("rand")) {
            randcall(ctx);
        } else {
            String title = ctx.identifier().getText();
            Function func = (Function) funcTree.get(ctx);
            functions.append("\taload_0\n");
            Scope scope = (Scope) scopeTree.get(ctx);
            ArrayList<String> mnemonics = new ArrayList<>();
            for (LastMinuteParser.VarvalueContext vvctx :ctx.extendedparams().varvalue()) {
                mnemonics.add(Symbol.getMnenonic(Types.UNASSIGNED));
                if (vvctx.identifier() != null) {
                    Symbol symbol = scope.lookupVariable(ctx.identifier().getText());
                            loadVar(symbol.getType(), symbol.getId(), functions);
                }else{
                    pushVar(fromContext(vvctx), vvctx.getText(), functions);
                }
            }
            functions.append("\tinvokevirtual " + className + "/" + title + "(");
            for (int i =0 ; i < mnemonics.size(); i++){
                if (i == mnemonics.size()-1) {
                    functions.append( mnemonics.get(i)+ ";");
                }   else {
                    functions.append(mnemonics.get(i) + ";");
                }
            }
            functions.append(")" + Symbol.getMnenonic(func.getReturnType()) + "\n");

        }
        return super.visitFunccall(ctx);
    }

    private void randcall(LastMinuteParser.FunccallContext ctx) {
        System.out.println("rand function called");

        Appendable pw = (global ? functions : printWriter);
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1000);
        pushVar(Types.INT, String.valueOf(randomNum), pw);


        //Symbol returnSymbol = new Symbol("randReturn", Types.FLOAT);
        //returnSymbol.incCount();

        /*
        try
        {
            pw.append("\tinvokestatic java/util/concurrent/ThreadLocalRandom/current()Ljava/util/concurrent/ThreadLocalRandom;\n");
            pw.append("\ticonst_0\n");
            pw.append("\tsipush 1000\n");
            pw.append("\tinvokevirtual java/util/concurrent/ThreadLocalRandom/nextInt(II)I\n");
            pw.append("\tistore_" + returnSymbol.getId() + "\n");
            pw.append("\tiload_" + returnSymbol.getId() + "\n");
            pw.append("\ti2f\n");
            pw.append("\tfload_" + returnSymbol.getId() + "\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/

    }

    private void printcall(LastMinuteParser.FunccallContext ctx) {
        System.out.println("print function called");
        System.out.println(fromContext(ctx.extendedparams().varvalue(0)));
        Types type = fromContext(ctx.extendedparams().varvalue(0));

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
            System.err.append("cant print array");
        } else if (type == Types.IDENTIFIER) {
            String varName = ctx.extendedparams().varvalue().get(0).identifier().getText();
            Scope scope = (Scope) scopeTree.get(ctx);
            Symbol symbol = scope.lookupVariable(varName);
            System.out.println(symbol.getId() + symbol.getType().toString());
            print(symbol, printWriter);
        } else {
//            print(getVariable(ctx.extendedparams().varvalue(0).identifier().getText()));
        }
    }

    public Symbol getVariable(Scope scope, String identifier) {
        return scope.lookupVariable(identifier);
    }

    @Override
    public Object visitCalculation(LastMinuteParser.CalculationContext ctx) {
        addvalue(ctx.calcVal());
        if (ctx.calcMore() != null) {
            visit(ctx.calcMore(0));
        }
        //        if (ctx.calcVal() != null)
//        pushcalcval(ctx.calcVal());
//
//        if (ctx.calcMore() != null)
//            visitCalcMore(ctx.calcMore().get(0));
        return null;
    }


    private void addvalue(LastMinuteParser.CalcValContext ctx) {
        if (ctx.varvalnum() != null) {
            values.add(ctx.varvalnum().INT().getText() + ".0");
        } else if (ctx.varvalfloat() != null) {
            String doublestring =
                    ctx.varvalfloat().INT(0).getText() +
                            "." +
                            ctx.varvalfloat().INT(1).getText();
            values.add(doublestring);
        } else if (ctx.identifier() != null) {
            values.add(ctx.identifier().getText());
        }
    }

    @Override
    public Object visitCalcMore(LastMinuteParser.CalcMoreContext ctx) {
        if (ctx.PLUS() != null) {
            expressions.add('+');
        } else if (ctx.MINUS() != null) {
            expressions.add('-');
        } else if (ctx.TIMES() != null) {
            expressions.add('*');
        } else if (ctx.DIVIDE() != null) {
            expressions.add('/');
        } else if (ctx.MODULO() != null){
            expressions.add('%');
        }
        if (ctx.calculation() != null) {
            visit(ctx.calculation());
        } else {
            addvalue(ctx.calcVal());
            Scope scope = (Scope) scopeTree.get(ctx);
            docalc(scope);
        }
        return null;

    }

    private void docalc(Scope scope) {

        int expressionslength = expressions.size();
        boolean loadfirst = true;
        for (int i = 0; i < expressionslength; i++) {
            if (loadfirst) {
                if (!NumberUtils.isNumber(values.get(i)))
                    loadVar(
                            scope.lookupVariable(values.get(i)).getType(),
                            scope.lookupVariable(values.get(i)).getId(),
                            printWriter);
                else
                    pushVar(
                            Types.FLOAT,
                            values.get(i),
                            printWriter);
                values.remove(i);
                i--;
                expressionslength = expressions.size();
                loadfirst = false;

            } else {
                if ((expressions.get(i) == '*' || expressions.get(i) == '/' || expressions.get(i) == '%')) {
                    if (!NumberUtils.isNumber(values.get(i)))
                        loadVar(
                                scope.lookupVariable(values.get(i)).getType(),
                                scope.lookupVariable(values.get(i)).getId(),
                                printWriter);
                    else
                        pushVar(
                                Types.FLOAT,
                                values.get(i),
                                printWriter);
                    values.remove(i);
                    if (expressions.get(i) == '*')
                        printWriter.append("\tfmul\n");
                    else if (expressions.get(i) == '/')
                        printWriter.append("\tfdiv\n");
                    else {
                        printWriter.append("\tfrem\n");
                    }
                    expressions.remove(i);
                    i--;
                    expressionslength = expressions.size();

                } else {
                    if(bufferedexpression == '0'){
                        bufferedexpression = expressions.get(i);
                    }else if (bufferedexpression == '+'){
                        printWriter.append("\tfadd\n");
                        bufferedexpression = expressions.get(i);
                    }else if (bufferedexpression == '-'){
                        printWriter.append("\tfadd\n");
                        bufferedexpression = expressions.get(i);
                    }
                    if (!NumberUtils.isNumber(values.get(i)))
                        loadVar(
                                scope.lookupVariable(values.get(i)).getType(),
                                scope.lookupVariable(values.get(i)).getId(),
                                printWriter);
                    else
                        pushVar(
                                Types.FLOAT,
                                values.get(i),
                                printWriter);
                    values.remove(i);

                    expressions.remove(i);
                    i--;
                    expressionslength = expressions.size();
                }
            }
        }
        if (bufferedexpression == '+'){
            printWriter.append("\tfadd\n");
        }else if (bufferedexpression == '-') {
            printWriter.append("\tfadd\n");
        }
    }

    private void pushcalcval(LastMinuteParser.CalcValContext ctx) {
        if (ctx.varvalnum() != null) {
            printWriter.append("bipush " + ctx.varvalnum().INT().getText() + "\n");
        } else if (ctx.varvalfloat() != null) {
            printWriter.append("ldc " + ctx.varvalfloat().INT(0).getText() + "." + ctx.varvalfloat().INT(1).getText() + "\n");
        } else if (ctx.identifier() != null) {
//            print(getVariable(ctx.identifier().getText()));
        }
    }

    private void calculate(String operator) {
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
//        }if (ctx)
//        return super.visitCalcVal(ctx);
//    }

    @Override
    public Object visitFuncdecl(LastMinuteParser.FuncdeclContext ctx) {
        global = false;
        printWriter.append(".method public " + ctx.identifier().getText() + "(");
        System.out.println("entered funcdecl");
        Function func = (Function) funcTree.get(ctx);
        for (Symbol param : func.getParams()) {
            printWriter.append(Symbol.getMnenonic(param.getType()));
            printWriter.append(";");
        }

        printWriter.append(")" + (func.getReturnType() == Types.UNASSIGNED ? "V" :
                Symbol.getMnenonic(func.getReturnType())) + "\n");

        printWriter.append("\t.limit stack 100\r\n" +
                "\t.limit locals 100\n");

        for (LastMinuteParser.FuncbodyContext body : ctx.funcbody()) {
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

        if (func.getReturnType() != Types.FUNCTION) {
            if (func.getReturnId() != -1)
                loadVar(func.getReturnType(), func.getReturnId(), printWriter);
            else
                pushVar(func.getReturnType(), ctx.funcreturn().returnVar.getText(), printWriter);
        }
        createReturn(func.getReturnType(), printWriter);

        printWriter.append(".end method\r\n");

        return null;
    }

    private void createReturn(Types symbolType, Appendable pw) {
        try {
            switch (symbolType) {
                case BOOL:
                    pw.append("\tireturn\r\n");
                    break;
                case FLOAT:
                case INT: // changed  all types to float
                    pw.append("\tfreturn\r\n");
                    break;
                case STRING:
                    pw.append("\tareturn\r\n");
                    break;
                default:
                    pw.append("\treturn\r\n");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(String print) {
        if (global) {
            functions.append("\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            functions.append("\tldc " + print + "\n");
            functions.append("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n");
        } else {
            printWriter.append("\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            printWriter.append("\tldc " + print + "\n");
            printWriter.append("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n");
        }
    }

    public void print(Symbol symbol, PrintWriter pw) {

        Appendable writer = (global ? functions : printWriter);

        try
        {
            writer.append("\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n");
            loadVar(symbol.getType(), symbol.getId(), writer);
            writer.append("\tinvokevirtual java/io/PrintStream/println(" + symbol.getMnenonic(symbol.getType()) + ")V\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
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
                    pw.append("\tfstore " + id + "\r\n");
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
        loadVar(symbolType, id, pw, false);
    }

    private void loadVar(Types symbolType, int id, Appendable pw, boolean compare) {

        try {
            switch (symbolType) {
                case BOOL:
                case INT:
                case FLOAT:
                    if (global) {
                        functions.append("\tfload " + id + "\r\n");
                        if (compare) {
                            functions.append("\tf2i\r\n");
                        }
                    }   else{
                        pw.append("\tfload " + id + "\r\n");
                        if (compare) {
                            pw.append("\tf2i\r\n");
                    }
                    }
                    break;
                case STRING:
                    if (global) {
                        functions.append("\taload " + id + "\r\n");
                    }   else {
                        pw.append("\taload " + id + "\r\n");
                        break;
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void pushVar(Types symbolType, String rawValue, Appendable pw) {
        pushVar(symbolType, rawValue, pw, false);
    }

    private void pushVar(Types symbolType, String rawValue, Appendable pw, boolean compare) {
        if (symbolType == Types.INT) {
            int value = 0;
            try {
                value = Integer.valueOf(rawValue);
            } catch (NumberFormatException e) {
            }

            try {
                if (compare) {
                    pw.append("\tldc " + value + ".0\r\n");
                    pw.append("\tf2i\r\n");
                } else {
                    pw.append("\tldc " + value + ".0\r\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (symbolType == Types.BOOL) {
            try {
                pw.append("\ticonst_" + (rawValue.equals("true") ? 1 : 0) + "\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else // float, string
        {
            try {
                if (compare)
                    pw.append("\tldc " + rawValue + "\r\n");
                else
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
        Symbol find = null;

        if (ctx.varvalue().calculation() != null) {

            find = scope.lookupVariable(ctx.identifier().getText());
            if (find == null) {

                find = new Symbol(ctx.identifier().getText(), Types.FLOAT);
                find.incCount();
            }

            visitCalculation(ctx.varvalue().calculation());
            storeVar(find.getType(), find.getId(), printWriter);
        } else {
            Symbol symbol = (Symbol) funcTree.get(ctx);

            Appendable pw = (scope.getName().equals("global") ? functions : printWriter);
            if (symbol.getType() == Types.FLOAT || symbol.getType() == Types.INT)
            {
                if (!(ctx.varvalue().getText().contains(".")))
                {
                    pushVar(Types.INT, ctx.varvalue().getText(), pw);
                }else{
                    pushVar(symbol.getType(), ctx.varvalue().getText(), pw);
                }
            }
            else if (symbol.getType() == Types.FUNCTION) {
                Function func = scope.lookupFunction(ctx.varvalue().funccall().identifier().getText());

                System.out.println(func);

                visitFunccall(ctx.varvalue().funccall());

                symbol.setType(func.getReturnType());
            } else {
                pushVar(symbol.getType(), ctx.varvalue().getText(), pw);
            }
            storeVar(symbol.getType(), symbol.getId(), pw);
        }
        return null;
    }

    @Override
    public Object visitVartrans(LastMinuteParser.VartransContext ctx) {
        //get the variable
        Types type = fromContext(ctx.varvalue());
        Scope scope = (Scope) scopeTree.get(ctx);
        if (type == Types.INT) {
            pushVar(type, ctx.varvalue().varvalnum().getText(), printWriter);

            Symbol symbol = scope.lookupVariable(ctx.identifier().getText());
            if (symbol == null) symbol = new Symbol(ctx.identifier().getText(), type);


            loadVar(symbol.getType(), symbol.getId(), printWriter);

            printWriter.append("\tfadd");
            storeVar(type, symbol.getId(), printWriter);
        } else if (type == Types.FLOAT) {
            pushVar(type, ctx.varvalue().varvalfloat().getText(), printWriter);

            Symbol symbol = scope.lookupVariable(ctx.identifier().getText());
            if (symbol == null) symbol = new Symbol(ctx.identifier().getText(), type);

            loadVar(symbol.getType(), symbol.getId(), printWriter);

            printWriter.append("\tfadd");
            storeVar(type, symbol.getId(), printWriter);
        } else if (type == Types.STRING) {
            Symbol symbol = new Symbol(ctx.identifier().getText(), type);

            printWriter.append("\tnew java/lang/StringBuilder\n");
            printWriter.append("\tdup\n");
            printWriter.append("\tinvokespecial java/lang/StringBuilder/<init>()V\n");
            loadVar(type, symbol.getId(), printWriter);
            printWriter.append("\tinvokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n");
            printWriter.append("\tldc " + ctx.varvalue().varvalstring().getText());
            printWriter.append("\tinvokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\n");
            printWriter.append("\tinvokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;\n");
            storeVar(type, symbol.getId(), printWriter);

        } else if (type == Types.BOOL) {
            System.err.append("bool cant be transformed with +:\n");
        }
        return super.visitVartrans(ctx);
    }

    @Override
    public Object visitForloop(LastMinuteParser.ForloopContext ctx) {
        /*
        :   FOR
            OPENPAR
            vardecl condition ENDL varcalc
            CLOSEPAR
            body
         */
        Scope scope = (Scope) scopeTree.get(ctx);

        visit(ctx.vardecl());

        printWriter.append("\t" + scope.getName() + ":\n");

        visit(ctx.condition());
        printWriter.append(scope.getName() + "_end\n");

        visit(ctx.body());

        visit(ctx.varcalc());

        printWriter.append("\tgoto " + scope.getName() + "\n");
        printWriter.append("\t" + scope.getName() + "_end:\n");

        return null;
    }

    @Override
    public Object visitIf_else(LastMinuteParser.If_elseContext ctx) {
        Scope scope = (Scope) scopeTree.get(ctx);
        String quitScope = scope.getName() + "_end";

        /*
        print \t name if scope:
        visit if condition
        print endif_end or next elseif
        visit if body
        print \t goto endif_end

        print \t endif_end:
        */

        // min 1 for the last else
        boolean hasElse = (ctx.lastif != null);

        System.out.println("IF " + ctx.conditionalbody().size() + " SCOPES " +
                scope.getChildScopes().size() + " HAS ELSE " + hasElse);

        for (int i = 0; i < ctx.conditionalbody().size(); i++) {
            printWriter.append("\t" + scope.getChildScopes().get(i).getName() + ":\n");

            visit(ctx.conditionalbody(i).condition());

            if (i == (ctx.conditionalbody().size() - 1)) {
                if (hasElse)
                    printWriter.append(scope.getChildScopes().get(i + 1).getName() + "\n");
                else
                    printWriter.append(quitScope + "\n");
            } else {
                printWriter.append(scope.getChildScopes().get(i + 1).getName() +"\n");
            }

            visit(ctx.conditionalbody(i).body());

            printWriter.append("\tgoto " + quitScope +"\n");
        }

        if (hasElse) {
            printWriter.append("\t" + scope.getChildScopes().get(scope.getChildScopes().size() - 1).getName() + ":\n");
            visit(ctx.lastif);
        }

        printWriter.append("\t" + quitScope + ":\n");
        return null;
    }

    @Override
    public Object visitWhileloop(LastMinuteParser.WhileloopContext ctx) {
        Scope scope = (Scope) scopeTree.get(ctx);

        printWriter.append("\t" + scope.getName() + ":\n");

        visit(ctx.conditionalbody().condition());
        printWriter.append(scope.getName() + "_end\n");
        visit(ctx.conditionalbody().body());

        printWriter.append("\tgoto " + scope.getName() + "\n");
        printWriter.append("\t" + scope.getName() + "_end:\n");

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
        else if (ctx.varvalfloat() != null)
            type = (Types.FLOAT);
        else if (ctx.funccall() != null)
            type = (Types.FUNCTION);
        else {
            type = null;
        }
        return type;
    }

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
    public Object visitOperatorCondition(LastMinuteParser.OperatorConditionContext ctx) {
        System.out.println("entered visitOperatorCondition");


        Scope scope = (Scope) scopeTree.get(ctx);
        Types leftType = fromContext(ctx.varvalue(0));
        if (leftType == Types.IDENTIFIER) {
            Symbol left = scope.lookupVariable(ctx.varvalue(0).getText());
            if (left != null) {
                loadVar(left.getType(), left.getId(), printWriter, true);
            } else {
                pushVar(Types.INT, "0", printWriter);
            }
        } else {
            pushVar(Types.INT, ctx.varvalue(0).getText(), printWriter, true);
        }

        Types rightType = fromContext(ctx.varvalue(1));
        if (rightType == Types.IDENTIFIER) {
            Symbol right = scope.lookupVariable(ctx.varvalue(1).getText());
            if (right != null) {
                if (right.getType() == Types.INT) {
                    loadVar(right.getType(), right.getId(), printWriter, true);
                } else {
                    loadVar(right.getType(), right.getId(), printWriter, true);

                }
            } else {
                pushVar(Types.INT, "0", printWriter);
            }
        } else {
            pushVar(Types.INT, ctx.varvalue(1).getText(), printWriter, true);
        }

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
    public Object visitBoolCondition(LastMinuteParser.BoolConditionContext ctx) {
        System.out.println("entered visitBoolCondition");

        pushVar(Types.INT, ctx.varvalbool().getText().equals("true") ? "1" : "0", printWriter);
        pushVar(Types.INT, "1", printWriter);

        printWriter.print("\tif_icmpne ");

        return null;
    }

    @Override
    public Object visitInverseCondition(LastMinuteParser.InverseConditionContext ctx) {
        System.out.println("TODO visitInverseCondition");
        return super.visitInverseCondition(ctx);
    }

    @Override
    public Object visitAndCondition(LastMinuteParser.AndConditionContext ctx) {
        System.out.println("TODO visitAndCondition");
        return super.visitAndCondition(ctx);
    }

    @Override
    public Object visitOrCondition(LastMinuteParser.OrConditionContext ctx) {
        System.out.println("TODO visitOrCondition");
        return super.visitOrCondition(ctx);
    }

    @Override
    public Object visitCompareCondition(LastMinuteParser.CompareConditionContext ctx) {
        System.out.println("TODO visitCompareCondition");

        pushVar(Types.INT, ctx.varvalue(0).getText(), printWriter);
        pushVar(Types.INT, ctx.varvalue(1).getText(), printWriter);

        printWriter.print("\tif_icmpne ");
        return null;
    }

    @Override
    public Object visitNotEqualCondition(LastMinuteParser.NotEqualConditionContext ctx) {
        System.out.println("TODO visitNotEqualCondition");

        pushVar(Types.INT, ctx.varvalue(0).getText(), printWriter);
        pushVar(Types.INT, ctx.varvalue(1).getText(), printWriter);

        printWriter.print("\tif_icmpeq ");
        return null;
    }

    @Override
    public Object visitIncrementVariable(LastMinuteParser.IncrementVariableContext ctx) {
        Scope scope = (Scope) scopeTree.get(ctx);

        Symbol symbol = scope.lookupVariable(ctx.identifier().getText());

        loadVar(symbol.getType(), symbol.getId(), printWriter);

        pushVar(Types.INT, "1", printWriter);

        if (ctx.INCVAR() != null) {
            if (symbol.getType() == Types.INT)
                printWriter.append("fadd\n");
            else if (symbol.getType() == Types.FLOAT)
                printWriter.append("fadd\n");
        } else if (ctx.DECVAR() != null) {
            if (symbol.getType() == Types.INT)
                printWriter.append("isub\n");
            else if (symbol.getType() == Types.FLOAT)
                printWriter.append("fsub\n");
        }

        storeVar(symbol.getType(), symbol.getId(), printWriter);

        return null;
    }
}

