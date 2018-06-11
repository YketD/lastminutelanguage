package Model;

/**
 * Created by yketd on 21-3-2017.
 */
public class Symbol
{
    private String name;
    private Types type;

    public Symbol(String name, Types type)
    {
        this.name = name;
        this.type = type;
    }

    public void setType(Types type) { this.type = type; }

    public Types getType() {
        return type;
    }

    public String getName()
    {
        return name;
    }
}
