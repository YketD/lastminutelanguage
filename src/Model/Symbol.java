package Model;

/**
 * Created by yketd on 21-3-2017.
 */
public class Symbol
{
    private String name;
    private Types type;
    private int id;

    public Symbol(String name, Types type)
    {
        this.name = name;
        this.type = type;
        this.id = Scope.declCount++;
    }

    public int getId()
    {
        return id;
    }

    public void setType(Types type) { this.type = type; }

    public Types getType() {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public String getMnenonic()
    {
        switch (this.type) {
            case FLOAT:
                return "F";
            case INT:
                return "I";
            case BOOL:
                return "Z";
            case FUNCTION:
                return "V";
            case STRING:
                return "Ljava/lang/String;";
            default:
                return "Ljava/lang/Object";
        }
    }
}
