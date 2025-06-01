package AST;

public class ComponentDeclaration extends AstNode {
    ComponentConfig componentConfig;

    public ComponentConfig getComponentConfig() {
        return componentConfig;
    }

    public void setComponentConfig(ComponentConfig componentConfig) {
        this.componentConfig = componentConfig;
    }

    @Override
    public String toString() {
        return "\nComponentDeclaration{" +
                "\ncomponentConfig=" + componentConfig +
                "\n}";
    }
}


