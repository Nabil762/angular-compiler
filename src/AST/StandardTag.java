package AST;

import com.sun.jmx.snmp.SnmpCounter64;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StandardTag extends Tag {
    String tag_name;
    List<Attributes> attributes = new ArrayList<>();
    List<Element> elements = new ArrayList<>();

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "\nStandardTag{" +
                "\ntag_name='" + tag_name + '\'' +
                "\n, attributes=" + attributes +
                "\n, elements=" + elements +
                '}';
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (Objects.equals(tag_name, "div")) {
            stringBuilder.append(this.getDiv());
        } else if (Objects.equals(tag_name, "form")) {
            stringBuilder.append(getForm());
        }
        return stringBuilder.toString();
    }

    public String getStructure(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (Objects.equals(tag_name, "div") || Objects.equals(tag_name, "form")) {
            for (Attributes attribute : attributes) {
                if (Objects.equals(attribute.getHtmlName(), "class")) {
                    stringBuilder.append(attribute.getStructure(fatherName));
                    fatherName = attribute.getText().substring(1, attribute.getText().length() - 1);
                }
            }
            for (Element element : elements) {
                stringBuilder.append(element.getStructure(fatherName));
            }
        }
        return stringBuilder.toString();
    }

    public String getDiv() {
        StringBuilder stringBuilder = new StringBuilder();
        String classname = "";
        if (elements != null && elements.get(0).getTag() instanceof StandardTag && !Objects.equals(((StandardTag) elements.get(0).getTag()).getTag_name(), "div") && !Objects.equals(((StandardTag) elements.get(0).getTag()).getTag_name(), "form")) {
            for (Attributes attribute : attributes) {
                if (attribute.getHtmlName() != null && attribute.getText() != null) {
                    if (Objects.equals(attribute.getHtmlName(), "class")) {
                        classname = attribute.getText().substring(1, attribute.getText().length() - 1);
                    }

                }
            }
            String name2 = classname.replace(String.valueOf('-'), "");
            stringBuilder.append("render").append(name2).append("() {\nthis.").append(name2).append(".innerHTML = `");
            stringBuilder.append(getHtmlInitial());
            stringBuilder.append("`;\n");
            stringBuilder.append(getHtml());
            stringBuilder.append("\n}");
        } else {
            for (int i = 0; i < elements.size(); i++) {
                if (elements != null && elements.get(i).getTag() instanceof StandardTag && Objects.equals(((StandardTag) elements.get(i).getTag()).getTag_name(), "form")) {
                    stringBuilder.append(((StandardTag) elements.get(i).getTag()).getForm()).append("\n");
                } else if (elements != null && elements.get(i).getTag() instanceof StandardTag && Objects.equals(((StandardTag) elements.get(i).getTag()).getTag_name(), "div")) {
                    stringBuilder.append(((StandardTag) elements.get(i).getTag()).getDiv()).append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String getForm() {
        StringBuilder stringBuilder = new StringBuilder();
        String classname = "";
        if (this.elements != null && this.elements.get(0).getTag() instanceof StandardTag && !Objects.equals(((StandardTag) this.elements.get(0).getTag()).getTag_name(), "div") && !Objects.equals(((StandardTag) this.elements.get(0).getTag()).getTag_name(), "form")) {
            for (Attributes attribute : this.attributes) {
                if (attribute.getHtmlName() != null && attribute.getText() != null) {
                    if (Objects.equals(attribute.getHtmlName(), "id")) {
                        classname = attribute.getText().substring(1, attribute.getText().length() - 1);
                    }
                }
            }

            String name2 = classname.replace(String.valueOf('-'), "");
            stringBuilder.append("render").append(name2).append("() {\nthis.").append(name2).append(".innerHTML = `\n").append("<form ");
            for (Attributes attribute : this.attributes) {
                if (attribute.getHtmlName() != null && attribute.getText() != null) {
                    stringBuilder.append(attribute.getHtmlName()).append("=\"").append(attribute.getText(), 1, attribute.getText().length() - 1).append("\" ");
                }
            }
            stringBuilder.append(">");
            stringBuilder.append(getHtmlInitial());

            stringBuilder.append("</form>");
            stringBuilder.append("\n`;\n");
        }
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i).getTag() != null && elements.get(i).getTag() instanceof StandardTag) {
                if (Objects.equals(((StandardTag) this.elements.get(i).getTag()).getTag_name(), "label")) {
                    for (int j = 0; j < ((StandardTag) this.elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) this.elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            stringBuilder.append("document.getElementById('").append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName()).append("Input').addEventListener('input', this.validateForm.bind(this));\n");
                        }
                    }
                }
            }
        }
        for (Attributes attribute : this.attributes) {

            if (attribute.getEvent() != null && Objects.equals(attribute.getEvent(), "(ngSubmit)")) {
                stringBuilder.append("document.getElementById('form').addEventListener('submit', (e) => {\n//e.preventDefault();\nthis.").append(attribute.getText().substring(1, attribute.getText().length() - 1)).append(";\n});\n");
            }
        }
        stringBuilder.append("}\n");
        stringBuilder.append("validateForm() {\n" + "let isValid = true;");
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i).getTag() != null && this.elements.get(i).getTag() instanceof StandardTag) {
                if (((StandardTag) this.elements.get(i).getTag()).tag_name.contains("label") && checkEl(((StandardTag) this.elements.get(i).getTag()))) {
                    String xxxx = "", yyyy = "";
                    for (int j = 0; j < ((StandardTag) this.elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) this.elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            boolean check = false;
                            for (int k = 0; k < ((StandardTag) this.elements.get(i).getTag()).elements.size(); k++) {
//                                System.out.println(((StandardTag) this.elements.get(i).getTag()).elements.get(k));
                                if (((StandardTag) this.elements.get(i).getTag()).elements.get(k).getTag() instanceof StandardTag) {
                                    for (int l = 0; l < ((StandardTag) ((StandardTag) this.elements.get(i).getTag()).elements.get(k).getTag()).attributes.size(); l++) {
                                        if (Objects.equals(((StandardTag) ((StandardTag) this.elements.get(i).getTag()).elements.get(k).getTag()).attributes.get(l).getHtmlName(), "required")) {
                                            check = true;
                                            break;
                                        }
                                    }
                                }
                                if (check)
                                    break;
                            }
                            if (check)
                                xxxx += ((StandardTag) this.elements.get(i).getTag()).elements.get(j).getHtmlName();
                        }
                    }
                    if (xxxx != "") {
                        stringBuilder.append("\nconst ").append(xxxx).append(" = document.getElementById('").append(xxxx).append("Input').value.trim();");
                        stringBuilder.append("\nconst ").append(xxxx).append("Error = document.getElementById('").append(xxxx).append("Error');\n");
                        stringBuilder.append("if(!").append(xxxx).append("){\n").append(xxxx).append("Error.style.display = 'block';\n").append("isValid = false;\n} else {\n").append(xxxx).append("Error.style.display = 'none';\n}");
                    }
                }
            }
        }
        stringBuilder.append("\nreturn isValid;\n}\n");
        return stringBuilder.toString();
    }

    public String getHtmlInitial() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getTag() != null && elements.get(i).getTag() instanceof StandardTag) {
                if (((StandardTag) elements.get(i).getTag()).tag_name.contains("h") && checkEl(((StandardTag) elements.get(i).getTag()))) {
                    stringBuilder.append("<").append(((StandardTag) elements.get(i).getTag()).tag_name).append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append(" = ").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText());
                        }
                    }
                    stringBuilder.append(">");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName()).append(" ");
                        }
                    }
                    stringBuilder.append("</").append(((StandardTag) elements.get(i).getTag()).tag_name).append(">");
                } else if (((StandardTag) elements.get(i).getTag()).tag_name.contains("label") && checkEl(((StandardTag) elements.get(i).getTag()))) {
                    stringBuilder.append("\n<").append("div").append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append(" = ").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText());
                        }
                    }
                    String xxxx = "";
                    stringBuilder.append(">");
                    stringBuilder.append("\n<label for=\"");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            xxxx += ((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName();
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName());
                        }
                    }
                    stringBuilder.append("Input\">");
                    stringBuilder.append(xxxx);
                    stringBuilder.append("</label>");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getTag() != null) {
                            StandardTag s = (StandardTag) ((StandardTag) elements.get(i).getTag()).elements.get(j).getTag();
                            if (Objects.equals(s.tag_name, "input")) {
                                stringBuilder.append("\n<input ");
                                for (int k = 0; k < s.attributes.size(); k++) {
                                    if (s.attributes.get(k).getHtmlName() != null && s.attributes.get(k).getText() != null) {
                                        stringBuilder.append(" ").append(s.attributes.get(k).getHtmlName()).append("=").append(s.attributes.get(k).getText());

                                    } else if (s.attributes.get(k).getHtmlName() != null) {
                                        stringBuilder.append(" ").append(s.attributes.get(k).getHtmlName()).append(" ");
                                    }
                                }
                                stringBuilder.append(" placeholder=\"Enter ").append(xxxx).append("\"").append(" id=\"").append(xxxx).append("Input\" ").append(">");
                                stringBuilder.append("\n<div class=\"form-error\" id=\"").append(xxxx).append("Error\"></div>");
                            }
                        }
                    }

                    stringBuilder.append("\n</").append("div").append(">");
                } else if (((StandardTag) elements.get(i).getTag()).tag_name.contains("button") && checkEl(((StandardTag) elements.get(i).getTag()))) {
                    stringBuilder.append("\n<").append("button").append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append("=").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText()).append(" ");
                        }
                    }
                    stringBuilder.append(">\n");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName().contains("ADD")) {
                                stringBuilder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" viewBox=\"0 0 16 16\" style=\"margin-left: 8px\">\n" +
                                        "<path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\n" +
                                        "</svg>\n");
                            }
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName());

                        }
                    }
                    stringBuilder.append("\n</button>\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    public String getHtml() {
        boolean check = true;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getTag() != null && elements.get(i).getTag() instanceof StandardTag) {
                if (((StandardTag) elements.get(i).getTag()).tag_name.contains("label") && checkEl(((StandardTag) elements.get(i).getTag()))) {
                    stringBuilder.append("\n<").append("div").append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append(" = ").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText());
                        }
                    }
                    String xxxx = "";
                    stringBuilder.append(">");
                    stringBuilder.append("\n<label for=\"");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            xxxx += ((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName();
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName());
                        }
                    }
                    stringBuilder.append("Input\">");
                    stringBuilder.append(xxxx);
                    stringBuilder.append("</label>");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getTag() != null) {
                            StandardTag s = (StandardTag) ((StandardTag) elements.get(i).getTag()).elements.get(j).getTag();
                            if (Objects.equals(s.tag_name, "input")) {
                                stringBuilder.append("\n<input ");
                                for (int k = 0; k < s.attributes.size(); k++) {
                                    if (s.attributes.get(k).getHtmlName() != null && s.attributes.get(k).getText() != null) {
                                        stringBuilder.append(" ").append(s.attributes.get(k).getHtmlName()).append("=").append(s.attributes.get(k).getText());

                                    } else if (s.attributes.get(k).getHtmlName() != null) {
                                        stringBuilder.append(" ").append(s.attributes.get(k).getHtmlName()).append(" ");
                                    }
                                }
                                stringBuilder.append(" placeholder=\"Enter ").append(xxxx).append("\"").append(" id=\"").append(xxxx).append("Input\" ").append(">");
                                stringBuilder.append("\n<div class=\"form-error\" id=\"").append(xxxx).append("Error\"></div>");
                            }
                        }
                    }

                    stringBuilder.append("\n</").append("div").append(">");
                } else if (((StandardTag) elements.get(i).getTag()).tag_name.contains("button") && checkEl(((StandardTag) elements.get(i).getTag()))) {
                    stringBuilder.append("\n<").append("button").append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append("=").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText()).append(" ");
                        }
                    }
                    stringBuilder.append(">\n");
                    stringBuilder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" viewBox=\"0 0 16 16\" style=\"margin-left: 8px\">\n" +
                            "<path d=\"M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z\"/>\n" +
                            "</svg>\n");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName());
                        }
                    }
                    stringBuilder.append("\n</button>\n");
                } else if (((StandardTag) elements.get(i).getTag()).tag_name.contains("ul")) {
                    check = false;
                    stringBuilder.append(((StandardTag) elements.get(i).getTag()).getUl(this.getClassName()));
                } else if (((StandardTag) elements.get(i).getTag()).tag_name.contains("h") && !checkEl(((StandardTag) elements.get(i).getTag()))) {
                    stringBuilder.append("<").append(((StandardTag) elements.get(i).getTag()).tag_name).append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append(" = ").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText());
                        }
                    }
                    stringBuilder.append(">");

                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getInterpolation() != null) {
                            String interName = ((StandardTag) elements.get(i).getTag()).elements.get(j).getInterpolation().getNAME_HTML();
                            stringBuilder.append("${this.").append(interName.substring(0, interName.indexOf('.'))).append(".id} - ${this.").append(interName).append("}");
                        }
                    }
                    stringBuilder.append("</").append(((StandardTag) elements.get(i).getTag()).tag_name).append(">\n");

                } else if (((StandardTag) elements.get(i).getTag()).tag_name.contains("p")) {

                    stringBuilder.append("<").append(((StandardTag) elements.get(i).getTag()).tag_name).append(" ");
                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).attributes.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append(" = ").append(((StandardTag) elements.get(i).getTag()).attributes.get(j).getText());
                        }
                    }
                    stringBuilder.append(">");

                    for (int j = 0; j < ((StandardTag) elements.get(i).getTag()).elements.size(); j++) {
                        if (((StandardTag) elements.get(i).getTag()).elements.get(j).getInterpolation() != null) {
                            String interName = ((StandardTag) elements.get(i).getTag()).elements.get(j).getInterpolation().getNAME_HTML();
                            stringBuilder.append("${this.").append(interName).append("} ");
                        } else if (((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName() != null) {
                            stringBuilder.append(((StandardTag) elements.get(i).getTag()).elements.get(j).getHtmlName()).append(" ");

                        }
                    }
                    stringBuilder.append("</").append(((StandardTag) elements.get(i).getTag()).tag_name).append(">\n");

                }
            } else if (elements.get(i).getTag() != null && elements.get(i).getTag() instanceof SelfClosingTag) {
                stringBuilder.append("<").append(((SelfClosingTag) elements.get(i).getTag()).tag_name).append(" ");
                for (int j = 0; j < ((SelfClosingTag) elements.get(i).getTag()).attributes.size(); j++) {
                    if (((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getHtmlName() != null && ((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                        stringBuilder.append(((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getHtmlName()).append(" = \"${this.").append(((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getText().substring(3, ((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getText().length() - 3)).append("}\"");
                    } else if (((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getBinding() != null && ((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getText() != null) {
                        stringBuilder.append(((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getBinding().substring(1, ((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getBinding().length() - 1)).append(" = \"${this.").append(((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getText().substring(1, ((SelfClosingTag) elements.get(i).getTag()).attributes.get(j).getText().length() - 1)).append("}\" ");
                    }
                }
                stringBuilder.append(">\n");
            }
        }
        if (check) {
            for (int j = 0; j < attributes.size(); j++) {
                if (attributes.get(j).getStructuralDir() != null && Objects.equals(attributes.get(j).getStructuralDir(), "*ngIf")) {
                    StringBuilder ret = new StringBuilder();
                    ret.append("if (this.").append(attributes.get(j).getText().substring(1, attributes.get(j).getText().indexOf(';'))).append(") {\nthis.").append(getClassName()).append(".innerHTML += `\n");
                    ret.append("<").append(tag_name).append(" ");
                    for (int h = 0; h < attributes.size(); h++) {
                        if (attributes.get(h).getHtmlName() != null) {
                            ret.append(attributes.get(h).getHtmlName()).append(" = ").append(attributes.get(h).getText()).append(" ");
                        }
                    }
                    ret.append(">\n");
                    ret.append(stringBuilder.toString());
                    ret.append("</").append(tag_name).append(">\n");
                    ret.append("`;\n" +
                            "}\n");
                    if (attributes.get(j).getText().contains("else")) {
                        if (attributes.get(j).getText().substring(attributes.get(j).getText().indexOf("else ") + 5, attributes.get(j).getText().length() - 1).equals("empty")) {
                            ret.append("else {\n" +
                                    "this.").append(getClassName()).append(".innerHTML += `\n");
                            ret.append("<div class=\"empty-message\" >\n" +
                                    "<h6 > ").append(attributes.get(j).getText().substring(1, attributes.get(j).getText().indexOf(';'))).append(" to view ").append("</h6 >\n" +
                                    "<h6 ><small > ").append(attributes.get(j).getText().substring(1, attributes.get(j).getText().indexOf(';'))).append(" from the list to see its details here </small ></h6 >\n" +
                                    "</div >\n" +
                                    "`;\n}");
                        }
                    }
                    return ret.toString();
                }
            }
        }
        return stringBuilder.toString();
    }

    public boolean checkEl(StandardTag standardTag) {
        boolean isValid = false;
        for (int j = 0; j < standardTag.elements.size(); j++) {
            if (standardTag.elements.get(j).getHtmlName() != null) {
                return true;
            }
        }
        return isValid;
    }

    public String getRender(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (Objects.equals(tag_name, "div") || Objects.equals(tag_name, "form")) {
            if (this.elements != null && this.elements.get(0).getTag() instanceof StandardTag && !Objects.equals(((StandardTag) elements.get(0).getTag()).getTag_name(), "div") && !Objects.equals(((StandardTag) elements.get(0).getTag()).getTag_name(), "form")) {
                for (Attributes attribute : attributes) {
                    if (Objects.equals(attribute.getHtmlName(), "class")) {
                        stringBuilder.append(attribute.getRender(fatherName));
                        fatherName = attribute.getText().substring(1, attribute.getText().length() - 1);
                    }
                }
            }
            assert elements != null;
            for (Element element : elements) {
                stringBuilder.append(element.getRender(fatherName));
            }
        }

        return stringBuilder.toString();
    }

    public String getUl(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.elements.size(); i++) {
            if (this.elements.get(i).getTag() != null && this.elements.get(i).getTag() instanceof StandardTag) {
                if (((StandardTag) this.elements.get(i).getTag()).tag_name.contains("li")) {
                    stringBuilder.append(((StandardTag) this.elements.get(i).getTag()).getLi(fatherName));
                }
            }
        }
        return stringBuilder.toString();
    }

    public String getClassName() {
        String name2 = "";
        for (Attributes attribute : this.attributes) {
            if (attribute.getHtmlName() != null && Objects.equals(attribute.getHtmlName(), "class")) {
                String name = attribute.getText().substring(1, attribute.getText().length() - 1);
                name2 = name.replace(String.valueOf('-'), "");
                return name2;
            }
        }
        return name2;
    }

    public String getClassNameWithDash() {
        for (Attributes attribute : this.attributes) {
            if (attribute.getHtmlName() != null && Objects.equals(attribute.getHtmlName(), "class")) {
                return attribute.getText().substring(1, attribute.getText().length() - 1);
            }
        }
        return "";
    }

    public String getLi(String fatherName) {
        StringBuilder stringBuilder = new StringBuilder();
        String query = "";
        for (Attributes attribute : this.attributes) {
            if (attribute.getStructuralDir() != null && attribute.getText() != null) {
                if (Objects.equals(attribute.getStructuralDir(), "*ngFor")) {
                    stringBuilder.append("if (this.").append(attribute.getText().substring(attribute.getText().indexOf("of ") + 3, attribute.getText().length() - 1)).append(".length === 0) {\nthis.").append(fatherName).append(".innerHTML += `\n");
                    stringBuilder.append("<h3 class=\"mb-4 empty-message\">No ").append(attribute.getText().substring(attribute.getText().indexOf("of ") + 3, attribute.getText().length() - 1)).append(" available<br>Add ").append(attribute.getText().substring(attribute.getText().indexOf("of ") + 3, attribute.getText().length() - 1)).append(" to see them listed here</h3>`;\n").append("return;\n}\n");
                    stringBuilder.append("this.").append(fatherName).append(".innerHTML += this.").append(attribute.getText().substring(attribute.getText().indexOf("of ") + 3, attribute.getText().length() - 1)).append(".map(").append(attribute.getText().substring(attribute.getText().indexOf("let ") + 4, attribute.getText().indexOf("of"))).append(" => `\n");
                    stringBuilder.append("<div class=\"").append(attribute.getText().substring(attribute.getText().indexOf("let ") + 4, attribute.getText().indexOf("of"))).append("\" data-id=\"${").append(attribute.getText().substring(attribute.getText().indexOf("let ") + 4, attribute.getText().indexOf("of"))).append(".id}\">\n");
                    query = attribute.getText().substring(attribute.getText().indexOf("let ") + 4, attribute.getText().indexOf(" of"));
                    for (Element element : this.elements) {
                        if (element.getTag() != null && element.getTag() instanceof StandardTag) {
                            if (((StandardTag) element.getTag()).tag_name.contains("div")) {
                                stringBuilder.append("<div ");
                                for (int l = 0; l < ((StandardTag) element.getTag()).attributes.size(); l++) {
                                    if (((StandardTag) element.getTag()).attributes.get(l).getHtmlName() != null && Objects.equals(((StandardTag) element.getTag()).attributes.get(l).getHtmlName(), "class")) {
                                        stringBuilder.append(((StandardTag) element.getTag()).attributes.get(l).getHtmlName()).append(" = ").append(((StandardTag) element.getTag()).attributes.get(l).getText());
                                    }
                                }
                                stringBuilder.append(" >\n");
                                for (int l = 0; l < ((StandardTag) element.getTag()).elements.size(); l++) {
                                    if (((StandardTag) element.getTag()).elements.get(l).getTag() != null && ((StandardTag) element.getTag()).elements.get(l).getTag() instanceof StandardTag) {
                                        if (((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).tag_name != null) {
                                            if (((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).tag_name.contains("p")) {
                                                stringBuilder.append("<").append(((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).tag_name).append(" ");
                                                for (int j = 0; j < ((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.size(); j++) {
                                                    if (((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText() != null) {
                                                        stringBuilder.append(((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getHtmlName()).append(" = ").append(((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText());
                                                    }
                                                }
                                                stringBuilder.append(">");
                                                for (int j = 0; j < ((StandardTag) elements.get(l).getTag()).elements.size(); j++) {
                                                    if (((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).elements.get(j).getInterpolation() != null) {
                                                        String interName = ((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).elements.get(j).getInterpolation().getNAME_HTML();
                                                        stringBuilder.append("${").append(interName).append("} ");
                                                    } else if (((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).elements.get(j).getHtmlName() != null) {
                                                        stringBuilder.append(((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).elements.get(j).getHtmlName()).append(" ");

                                                    }
                                                }
                                                stringBuilder.append("</").append(((StandardTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).tag_name).append(">\n");

                                            }

                                        }
                                    } else if (((StandardTag) element.getTag()).elements.get(l).getTag() != null && ((StandardTag) element.getTag()).elements.get(l).getTag() instanceof SelfClosingTag) {
                                        stringBuilder.append("<").append(((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).tag_name).append(" ");
                                        for (int j = 0; j < ((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.size(); j++) {
                                            if (((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getHtmlName() != null && ((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText() != null) {
                                                stringBuilder.append(((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getHtmlName()).append(" = \"${").append(((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText().substring(3, ((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText().length() - 3)).append("}\"");
                                            } else if (((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getBinding() != null && ((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText() != null) {
                                                stringBuilder.append(((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getBinding().substring(1, ((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getBinding().length() - 1)).append(" = \"${").append(((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText().substring(1, ((SelfClosingTag) ((StandardTag) element.getTag()).elements.get(l).getTag()).attributes.get(j).getText().length() - 1)).append("}\" ");
                                            }
                                        }
                                        stringBuilder.append(">\n");
                                    }
                                }
                                stringBuilder.append("</div>\n");
                            } else if (((StandardTag) element.getTag()).tag_name.contains("button")) {
                                stringBuilder.append("<").append("button").append(" ");
                                for (int j = 0; j < ((StandardTag) element.getTag()).attributes.size(); j++) {
                                    if (((StandardTag) element.getTag()).attributes.get(j).getHtmlName() != null && ((StandardTag) element.getTag()).attributes.get(j).getText() != null) {
                                        stringBuilder.append(((StandardTag) element.getTag()).attributes.get(j).getHtmlName()).append("=").append(((StandardTag) element.getTag()).attributes.get(j).getText()).append(" ");
                                    }
                                }
                                for (int j = 0; j < ((StandardTag) element.getTag()).elements.size(); j++) {
                                    if (((StandardTag) element.getTag()).elements.get(j).getHtmlName() != null) {
                                        stringBuilder.append(">\n");
                                        if (Objects.equals(((StandardTag) element.getTag()).elements.get(j).getHtmlName(), "Delete")) {
                                            stringBuilder.append("<svg xmlns = \"http://www.w3.org/2000/svg\" width = \"16\" height = \"16\" fill = \"currentColor\" viewBox = \"0 0 16 16\" > style=\"margin-left: 8px\">\n" +
                                                    "<path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z\"/>\n" +
                                                    "<path fill-rule=\"evenodd\" d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z\"/>\n"
                                                    + "</svg>");
                                        } else {
                                            stringBuilder.append(((StandardTag) element.getTag()).elements.get(j).getHtmlName());
                                        }
                                    }
                                }
                                stringBuilder.append("\n</button>\n");
                            }
                        }
                    }
                    stringBuilder.append("</div>\n");
                    stringBuilder.append("`).join('');\n");
                    stringBuilder.append("this.").append(fatherName).append(".querySelectorAll('.").append(query).append("').forEach(item => {\n");
                    for (Element element : this.elements) {
                        if (element.getTag() != null && element.getTag() instanceof StandardTag) {
                            if (((StandardTag) element.getTag()).tag_name.contains("div")) {
                                for (int l = 0; l < ((StandardTag) element.getTag()).attributes.size(); l++) {
                                    if (((StandardTag) element.getTag()).attributes.get(l).getEvent() != null) {
                                        if (Objects.equals(((StandardTag) element.getTag()).attributes.get(l).getEvent(), "(click)")) {
                                            stringBuilder.append("item.addEventListener('click', () => {\nthis.").append(((StandardTag) element.getTag()).attributes.get(l).getText().substring(1, ((StandardTag) element.getTag()).attributes.get(l).getText().indexOf('('))).append("(this.").append(query).append("s.find(p => p.id === parseInt(item.dataset.id)));\n" + "});\n");
                                        }
                                    }
                                }

                            } else if (((StandardTag) element.getTag()).tag_name.contains("button")) {
                                for (int j = 0; j < ((StandardTag) element.getTag()).attributes.size(); j++) {
                                    if (((StandardTag) element.getTag()).attributes.get(j).getEvent() != null) {
                                        if (Objects.equals(((StandardTag) element.getTag()).attributes.get(j).getEvent(), "(click)")) {
                                            stringBuilder.append("item.querySelector('.").append(((StandardTag) element.getTag()).getClassNameWithDash()).append("').addEventListener('click', (e) => {\nthis.");
                                            stringBuilder.append(((StandardTag) element.getTag()).attributes.get(j).getText().substring(1, ((StandardTag) element.getTag()).attributes.get(j).getText().indexOf('('))).append("(parseInt(item.dataset.id), e);\n});");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    stringBuilder.append("\n});");
                }

            }
        }
        return stringBuilder.toString();
    }

}
