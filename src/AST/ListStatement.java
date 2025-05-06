package AST;

public class ListStatement {
    String array_name;
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
                "\narrayExpression=" + arrayExpression +
                "\n}";
    }
}
