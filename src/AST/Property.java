package AST;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Property extends AstNode {
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
                "\nproperty='" + ID + '\'' + "\n value of property=" + valueExpression +
                "}";
    }

    @Override
    public String generatedCode() {
        return ID + ": " + valueExpression.generatedCode();
    }

    public String getInput() {

        String ret = "";
        if (!Objects.equals(ID, "id"))
            ret = "const " + ID + "Input = document.getElementById('" + ID + "Input');\n" + "const " + ID + " = " + ID + "Input.value.trim();\n";
        return ret;
    }

    public String getAsinment() {

        String ret = "";
        if (Objects.equals(ID, "id"))
            ret = "id: this.nextId++,\n";
        else
            ret = ID + ",\n";
        return ret;
    }

    public String val() {
        StringBuilder stringBuilder = new StringBuilder();
        if (ID != null)
            stringBuilder.append(ID).append(": ");
        if (valueExpression != null)
            stringBuilder.append(valueExpression.val());

        return stringBuilder.toString();
    }
}