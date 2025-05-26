package AST;

public class ComponentDeclaration extends AstNode {
    ComponentConfig componentConfig;

    public ComponentConfig getComponentConfig() {
        return componentConfig;
    }

    public void setComponentConfig(ComponentConfig componentConfig) {
        this.componentConfig = componentConfig;
    }
//
    @Override
    public String toString() {
        return "\nComponentDeclaration{" +
                "\ncomponentConfig=" + componentConfig +
                "\n}";
    }

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("@Component({");
//        if (componentConfig != null) {
//            stringBuilder.append(componentConfig.toString());
//        }
//        stringBuilder.append("})");
//        return stringBuilder.toString();
//    }

}


