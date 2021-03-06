package Model;

import java.util.LinkedHashMap;

/**
 * Created by yketd on 21-3-2017.
 */
public class Scope
{
    public static int declCount = 1;

    private String name;
    private LinkedHashMap<String, Symbol> variables;
    private LinkedHashMap<String, Function> functions;
    private LinkedHashMap<Integer, Scope> childScopes;
    private Scope parentScope;

    public Scope(String scopeName, Scope parentScope)
    {
        System.out.println("Creating scope " + scopeName + ":" + parentScope);

        this.name = scopeName;
        this.variables = new LinkedHashMap<>();
        this.functions = new LinkedHashMap<>();
        this.childScopes = new LinkedHashMap<>();
        this.parentScope = parentScope;
    }

    public Scope(String scopeName)
    {
        System.out.println("Creating scope " + scopeName);

        this.name = scopeName;
        this.variables = new LinkedHashMap<>();
        this.functions = new LinkedHashMap<>();
        this.childScopes = new LinkedHashMap<>();
        this.parentScope = null;
    }

    public void removeChild(String name)
    {
        this.childScopes.remove(name);
    }

    public void addChild(Scope scope)
    {
        this.childScopes.put(this.childScopes.size(), scope);
    }

    public LinkedHashMap<Integer, Scope> getChildScopes()
    {
        return childScopes;
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
        return variables.getOrDefault(varName, (parentScope != null ? parentScope.lookupVariable(varName) : null));
    }

    public Function lookupFunction(String methodName)
    {
        return functions.getOrDefault(methodName, (parentScope != null ? parentScope.lookupFunction(methodName) : null));
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
