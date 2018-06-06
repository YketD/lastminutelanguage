package Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yketd on 21-3-2017.
 */
public class Scope
{
    private Scope parentScope;
    private String name;
    private Map<String, Symbol> symbols;

    public Scope(Scope parentScope, String scopeName)
    {
        this.parentScope = parentScope;
        this.name = scopeName;
        symbols = new HashMap<>();
    }

    public Symbol declareVariable(String varName, DataType type)
    {
        return symbols.put(varName, new Symbol(varName, type));
    }

    public Symbol declareMethod(String methodName, DataType type)
    {
        return symbols.put(methodName, new Symbol(methodName, type));
    }

    public Symbol lookupVariable(String varName)
    {
        if (symbols.containsKey(varName))
            return symbols.get(varName);
        else if (parentScope != null)
            return parentScope.lookupVariable(varName);
        else
            return null;
    }

    public Symbol lookupMethod(String methodName)
    {
        if (symbols.containsKey(methodName))
            return symbols.get(methodName);
        else if (parentScope != null)
            return parentScope.lookupMethod(methodName);
        else
            return null;
    }

    public Scope openScope()
    {
        return new Scope(this, "");
    }

    public Scope closeScope()
    {
        return parentScope;
    }

    public Scope getParentScope()
    {
        return parentScope;
    }
}