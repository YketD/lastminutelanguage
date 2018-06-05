/**
 * Created by yketd on 21-3-2017.
 */
public class DataType extends Type {
    private Types dataType;


    public DataType(Types dataType) {
        this.dataType = dataType;
    }

    public DataType(LastMinuteParser.VarvalueContext ctx){
        Types type;
        if (ctx.varvalarray() != null)
            type = (Types.ARRAY);
        else if (ctx.varvalbool() != null)
            type = (Types.BOOL);
        else if (ctx.varvalchar() != null)
            type = (Types.CHAR);
        else if (ctx.varvalnum() != null)
            type = (Types.INT);
        else if (ctx.varvalstring() != null)
            type = (Types.STRING);
        else{type  = null;}
        this.dataType = type;
    }
    public Types getType(){
        return dataType;
    }


}
