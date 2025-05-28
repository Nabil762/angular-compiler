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
                "\nobjectExpression=" + objectExpression +
                "\n}";
    }
}
