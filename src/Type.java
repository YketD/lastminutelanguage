/**
 * Created by yketd on 21-3-2017.
 */
public abstract class Type {
    Types type;


    public Type(Types type) {
        this.type = type;
    }

    public Types getType() {
        return type;
    }
}