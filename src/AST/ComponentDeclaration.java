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
        return "\nComponentDeclaration{\n"
                + componentConfig +
                "\n}";
    }

    @Override
    public String generatedCode() {
        return componentConfig.generatedCode();
    }
}


