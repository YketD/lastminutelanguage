package Model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by yketd on 21-3-2017.
 */
public class Scope
{
    private String name;
    private LinkedHashMap<String, Symbol> variables;
    private LinkedHashMap<String, Function> functions;
    private int declCount;
    private LinkedHashMap<String, Scope> childScopes;
    private Scope parentScope;

    public Scope(String scopeName, Scope parentScope)
    {
        this.name = scopeName;
        this.variables = new LinkedHashMap<>();
        this.functions = new LinkedHashMap<>();
        this.childScopes = new LinkedHashMap<>();
        this.parentScope = parentScope;
    }

    public Scope(String scopeName)
    {
        this.name = scopeName;
        this.variables = new LinkedHashMap<>();
        this.functions = new LinkedHashMap<>();
        this.childScopes = new LinkedHashMap<>();
        this.parentScope = null;
    }

    public void addChild(Scope scope)
    {
        this.childScopes.put(scope.getName(), scope);
    }

    public Scope getParentScope()
    {
        return parentScope;
    }

    public Symbol declareVariable(Symbol var)
    {
        return variables.put(var.getName(), var);
    }

    public Function declareFunction(Function method)
    {
        return functions.put(method.getName(), method);
    }

    public Symbol lookupVariable(String varName)
    {
        return variables.getOrDefault(varName, null);
    }

    public Function lookupFunction(String methodName)
    {
        return functions.getOrDefault(methodName, null);
    }

    public String getName(){
        return name;
    }
}
