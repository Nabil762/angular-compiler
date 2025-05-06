package AST;
import java.util.List;
import java.util.ArrayList;

public class Property {
    String ID;
    ValueExpression valueExpression;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(ValueExpression valueExpression) {
        this.valueExpression = valueExpression;
    }

    @Override
    public String toString() {
        return "\nProperty{" +
                "\n property='" + ID + '\'' + "  value of property=" + valueExpression +
                "\n}";
    }
}
