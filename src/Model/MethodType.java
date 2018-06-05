package Model;

import java.util.List;

/**
 * Created by yketd on 21-3-2017.
 */
public class MethodType extends Type
{
    private Types returntype;
    private List<Types> params;

    public MethodType(Types returntype, List<Types> types)
    {
        this.returntype = returntype;
        this.params = types;

    }

    public MethodType()
    {
        this.returntype = Types.INT;
    }
}
