package Model;

public class FuncScope extends Scope
{
    private Function function;

    public FuncScope(String scopeName, Function function, Scope parentScope)
    {
        super(scopeName, parentScope);
        this.function = function;
        this.declareAllVariables();
    }

    public FuncScope(String scopeName, Function function)
    {
        super(scopeName);
        this.function = function;
        this.declareAllVariables();
    }

    private void declareAllVariables()
    {
        for (Symbol s : function.getParams())
        {
            declareVariable(s);
            //assignPosition(s);
        }
    }

    public Function getFunction()
    {
        return function;
    }

    @Override
    public String toString()
    {
        return super.getName();
    }
}
