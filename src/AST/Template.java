package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Template extends PropertyAssignment {
    List<Element> elements = new ArrayList<>();

    public List<Element> getElement() {
        return elements;
    }

    public void setElement(List<Element> element) {
        this.elements = element;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\ntemplate: `");
        for (Element element : elements) {
            stringBuilder.append(element.toString());
        }
        stringBuilder.append("`");
        return stringBuilder.toString();
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getStructure("appContainer"));
        for (Element element : elements) {
            stringBuilder.append(element.generatedCode());
        }
        stringBuilder.append(this.getRender("appContainer"));
        return stringBuilder.toString();
    }

    public String getStructure(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("createAppStructure() {\n").append("this.").append(fatherName).append(" = document.getElementById('app');\n" +
                "const header = document.createElement('div');\n" +
                "header.innerHTML = ``;\n" +
                "this.").append(fatherName).append(".appendChild(header);\n");
        for (Element element : elements) {
            stringBuilder.append(element.getStructure(fatherName));
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public String getRender(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("render() {\n");
        for (Element element : elements) {
            stringBuilder.append(element.getRender(fatherName));
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}



