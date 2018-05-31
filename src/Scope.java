import java.util.HashMap;
import java.util.Map;

/**
 * Created by yketd on 21-3-2017.
 */
public class Scope {
    private Scope parentScope;
    private Map<String, Symbol> symbols;

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
        symbols = new HashMap<>();
    }

    Symbol declareVariable(String varName, Types type){
        System.out.println("variable name: " + varName + " var type: " + type.toString());
        return symbols.put(varName, new Symbol(varName, type));
    }
    Symbol declareMethod(String methodName, Types type){
        return symbols.put(methodName, new Symbol(methodName, type));
    }
    Symbol lookupVariable(String varname){
        if (symbols.containsKey(varname))
            return symbols.get(varname);
        else if (parentScope != null)
            return parentScope.lookupVariable(varname);
        else
            return null;
    }
    Symbol lookupMethod(String methodName){
        if (symbols.containsKey(methodName))
            return symbols.get(methodName);
        else if (parentScope != null)
            return parentScope.lookupMethod(methodName);
        else
            return null;
    }

    Scope openScope(){
        return new Scope(this);
    }
    Scope closeScope(){
        return parentScope;
    }

    public Scope getParentScope()
    {
        return parentScope;
    }
}
