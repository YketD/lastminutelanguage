package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yketd on 21-3-2017.
 */
public class Function
{
    private Types returnType;
    private List<Symbol> params;
    private String name;

    public Function(String name, Types returnType)
    {
        this.name = name;
        this.returnType = returnType;
        this.params = new ArrayList<>();
    }

    public boolean addParam(Symbol param)
    {
        return params.add(param);
    }
}
