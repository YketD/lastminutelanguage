package Model;

public class FuncScope extends Scope
{
    private Function function;

    public FuncScope(Scope parentScope, String scopeName, Function function)
    {
        super(parentScope, scopeName);
        this.function = function;

        for (String s : function.getParams())
        {
            //addVariable(s);
            //assignPosition(s);
        }
    }

    public Function getFunction()
    {
        return function;
    }
}
