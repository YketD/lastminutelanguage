package Model;

/**
 * Created by yketd on 21-3-2017.
 */
public class Symbol
{
    private String name;
    private DataType type;

    public Symbol(String name, DataType type)
    {
        this.name = name;
        this.type = type;
    }

    public Types getType() {
        return type.getType();
    }
}
