package Model;

import java.util.LinkedHashMap;

/**
 * Created by yketd on 21-3-2017.
 */
public class Scope
{
    private Scope parentScope;
    private String name;
    private LinkedHashMap<String, Symbol> symbols;
    private int declCount;

    public Scope(Scope parentScope, String scopeName)
    {
        this.parentScope = parentScope;
        this.name = scopeName;
        this.symbols = new LinkedHashMap<>();
        this.declCount = 0;
    }

    public Symbol declareVariable(String varName, DataType type)
    {
        return symbols.put(varName, new Symbol(varName, type));
    }

    public Symbol declareFunction(String methodName, DataType type)
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

    public Symbol lookupFunction(String methodName)
    {
        if (symbols.containsKey(methodName))
            return symbols.get(methodName);
        else if (parentScope != null)
            return parentScope.lookupFunction(methodName);
        else
            return null;
    }

    public Scope getParentScope()
    {
        return parentScope;
    }
}
