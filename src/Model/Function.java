package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yketd on 21-3-2017.
 */
public class Function
{
    private Types returnType;
    private List<String> params;
    private String name;

    public Function(String name, Types returnType)
    {
        this.name = name;
        this.returnType = returnType;
        this.params = new ArrayList<>();
    }

    public boolean addParam(String param)
    {
        return params.add(param);
    }

    public boolean hasParam(String param)
    {
        return params.contains(param);
    }

    public List<String> getParams()
    {
        return params;
    }
}
