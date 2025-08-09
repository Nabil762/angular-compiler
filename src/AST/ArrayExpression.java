package AST;

public class ArrayExpression extends AstNode {
    ObjectExpressionList objectExpressionList;

    public ObjectExpressionList getObjectExpressionList() {
        return objectExpressionList;
    }

    public void setObjectExpressionList(ObjectExpressionList objectExpressionList) {
        this.objectExpressionList = objectExpressionList;
    }

    @Override
    public String toString() {
        return "\nArrayExpression{ " +
                objectExpressionList +
                "}";
    }

    @Override
    public String generatedCode() {
        return "= [\n" + objectExpressionList.generatedCode() + "];";
    }
}
