package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yketd on 21-3-2017.
 */
public class Function
{
    private Types returnType;
    private int returnId;
    private List<Symbol> params;
    private String name;

    public Function(String name)
    {
        this.name = name;
        this.returnType = Types.UNASSIGNED;
        this.returnId = -1;
        this.params = new ArrayList<>();
    }

    public boolean addParam(Symbol param)
    {
        return params.add(param);
    }

    public boolean hasParam(String param)
    {
        return params.contains(param);
    }

    public List<Symbol> getParams()
    {
        return params;
    }

    public String getName()
    {
        return name;
    }

    public Types getReturnType()
    {
        return returnType;
    }

    public int getReturnId()
    {
        return returnId;
    }

    public void setReturnType(Types returnType, int returnId)
    {
        this.returnType = returnType;
        this.returnId = returnId;
    }
}
