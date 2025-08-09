package AST;

public class Attributes extends AstNode {
    private String text;
    private String htmlName;
    private String binding;
    private String structuralDir;
    private String event;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getStructuralDir() {
        return structuralDir;
    }

    public void setStructuralDir(String structuralDir) {
        this.structuralDir = structuralDir;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nAttributes{");
        if (text != null) {
            sb.append("\ntext='").append(text).append('\'');
        }
        if (htmlName != null) {

            sb.append("\nhtmlAttribute='").append(htmlName).append('\'');
        }

        if (binding != null) {
            sb.append("\nbinding='").append(binding).append('\'');
        }
        if (structuralDir != null) {
            sb.append("\nstructuralDir='").append(structuralDir).append('\'');
        }
        if (event != null) {
            sb.append("\nevent='").append(event).append('\'');
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public String generatedCode() {
        return "";
    }

    public String getStructure(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            String name = text.substring(1, text.length() - 1);
            String name2 = name.replace(String.valueOf('-'), "");

            stringBuilder.append("this.").append(name2).append(" = document.createElement('div');\n");
            stringBuilder.append("this.").append(name2).append(".className = '").append(name).append("';\n");
            stringBuilder.append("this.").append(fatherName).append(".appendChild(this.").append(name2).append(");\n");
        }
        return stringBuilder.toString();
    }

    public String getRender(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            String name = text.substring(1, text.length() - 1);
            String name2 = name.replace(String.valueOf('-'), "");

            stringBuilder.append("this.render").append(name2).append("()\n");
        }
        return stringBuilder.toString();
    }


}