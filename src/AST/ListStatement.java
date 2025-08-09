package AST;

import java.util.Objects;

public class ListStatement extends ListDeclaration {
    String array_name;
    String name_object;
    ArrayExpression arrayExpression;

    public String getName_object() {
        return name_object;
    }

    public void setName_object(String name_object) {
        this.name_object = name_object;
    }


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
                arrayExpression +
                "\n}";
    }

    @Override
    public String generatedCode() {
        return "this." + array_name + arrayExpression.generatedCode();
    }

    public String loadList() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("const stored = localStorage.getItem('").append(array_name).append("');\n");
        stringBuilder.append("app.");
        stringBuilder.append(array_name).append(" = JSON.parse(localStorage.getItem('").append(array_name).append("')) || [\n");
        for (int j = 0; j < arrayExpression.objectExpressionList.objectExpression.size(); j++) {
            stringBuilder.append("{");
            for (int k = 0; k < (arrayExpression.objectExpressionList.objectExpression.get(j)).propertyList.properties.size(); k++) {
                stringBuilder.append((arrayExpression.objectExpressionList.objectExpression.get(j)).propertyList.properties.get(k).val());
                if (k != (arrayExpression.objectExpressionList.objectExpression.get(j)).propertyList.properties.size() - 1)
                    stringBuilder.append(",");

            }
            if (j != arrayExpression.objectExpressionList.objectExpression.size() - 1)
                stringBuilder.append("},\n");
            else
                stringBuilder.append("}\n");
        }
        stringBuilder.append("];\n").append("localStorage.setItem('").append(array_name).append("', JSON.stringify(app.").append(array_name).append("));\n");
        return stringBuilder.toString();
    }

}
