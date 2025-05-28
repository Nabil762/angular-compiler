//package AST;
//
//public class Parameter extends AstNode {
//    String name;
//    String type;
//
//
//    @Override
//    public String toString() {
//        return name + ": " + type;
//    }
//}
package AST;

public class Parameter extends AstNode {
    String identifier;
    SingleType singleType;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public SingleType getSingleType() {
        return singleType;
    }

    public void setSingleType(SingleType singleType) {
        this.singleType = singleType;
    }

    @Override
    public String toString() {
        return "\nParameter{" +
                "\nparameterName='" + identifier + '\'' +
                ", Type=" + singleType +
                "\n}";
    }
}
