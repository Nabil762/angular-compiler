package AST;

public class ListStatement extends ListDeclaration{
    String array_name;
    String name_object;

    public String getName_object() {
        return name_object;
    }

    public void setName_object(String name_object) {
        this.name_object = name_object;
    }

    ArrayExpression arrayExpression;

    public String getArray_name() {
        return array_name;
    }

    public void setArray_name(String array_name) {
        this.array_name = array_name;
    }

    public ArrayExpression getArrayExpression() {
        return arrayExpression;
    }

    public void setArrayExpression(ArrayExpression arrayExpression) {
        this.arrayExpression = arrayExpression;
    }

    @Override
    public String toString() {
        return "\nListStatement{" +
                "\narray_name : '" + array_name + '\'' +
                "\nname of object : '" + name_object + '\'' +
                "\narrayExpression=" + arrayExpression +
                "\n}";
    }
}
