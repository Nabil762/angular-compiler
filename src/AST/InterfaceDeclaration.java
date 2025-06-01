package AST;


public class InterfaceDeclaration extends AstNode {
    String interfaceName;
    InterfaceBody interfaceBody;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public InterfaceBody getInterfaceBody() {
        return interfaceBody;
    }

    public void setInterfaceBody(InterfaceBody interfaceBody) {
        this.interfaceBody = interfaceBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("interface ").append(interfaceName).append(" {");
        if (interfaceBody != null) {
            stringBuilder.append(interfaceBody.toString());
        }
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}

