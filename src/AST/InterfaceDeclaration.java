package AST;


public class InterfaceDeclaration {
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
        return "\nInterfaceDeclaration{" +
                "\ninterfaceName=" + interfaceName +
                "\ninterfaceBody=" + interfaceBody +
                "\n}";
    }
}
