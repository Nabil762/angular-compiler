package AST;

import java.util.List;
import java.util.ArrayList;

public class ObjectExpressionList extends AstNode {
    List<ObjectExpression> objectExpression = new ArrayList<ObjectExpression>();

    public List<ObjectExpression> getObjectExpression() {
        return objectExpression;
    }

    public void setObjectExpression(List<ObjectExpression> objectExpression) {
        this.objectExpression = objectExpression;
    }

    @Override
    public String toString() {
        return "\nObjectExpressionList{ " +
               objectExpression +
                "}";
    }
    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objectExpression.size(); i++) {
            stringBuilder.append(objectExpression.get(i).generatedCode()).append("\n");
            if (i < objectExpression.size() - 1)
                stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }
}
