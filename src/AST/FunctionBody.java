package AST;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends AstNode {
    String identifier1;
    String identifier2;
    String identifier3;
    String identifier4;
    String identifier5;
    String identifier6;
    String identifier7;
    String eq;
    ValueExpression valueExpression;
    ObjectExpression objectExpression;
    List<FunctionBody> functionBody1 = new ArrayList<>();
    List<FunctionBody> functionBody2 = new ArrayList<>();

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(String identifier1) {
        this.identifier1 = identifier1;
    }

    public String getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(String identifier2) {
        this.identifier2 = identifier2;
    }

    public String getIdentifier3() {
        return identifier3;
    }

    public void setIdentifier3(String identifier3) {
        this.identifier3 = identifier3;
    }

    public String getIdentifier4() {
        return identifier4;
    }

    public void setIdentifier4(String identifier4) {
        this.identifier4 = identifier4;
    }

    public String getIdentifier5() {
        return identifier5;
    }

    public void setIdentifier5(String identifier5) {
        this.identifier5 = identifier5;
    }

    public String getIdentifier6() {
        return identifier6;
    }

    public void setIdentifier6(String identifier6) {
        this.identifier6 = identifier6;
    }

    public String getIdentifier7() {
        return identifier7;
    }

    public void setIdentifier7(String identifier7) {
        this.identifier7 = identifier7;
    }

    public ObjectExpression getObjectExpression() {
        return objectExpression;
    }

    public void setObjectExpression(ObjectExpression objectExpression) {
        this.objectExpression = objectExpression;
    }


    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(ValueExpression valueExpression) {
        this.valueExpression = valueExpression;
    }

    public List<FunctionBody> getFunctionBody1() {
        return functionBody1;
    }

    public void setFunctionBody1(List<FunctionBody> functionBody1) {
        this.functionBody1 = functionBody1;
    }

    public List<FunctionBody> getFunctionBody2() {
        return functionBody2;
    }

    public void setFunctionBody2(List<FunctionBody> functionBody2) {
        this.functionBody2 = functionBody2;
    }

    @Override
    public String toString() {
        return "FunctionBody{" +
                "identifier1='" + identifier1 + '\'' +
                ", identifier2='" + identifier2 + '\'' +
                ", identifier3='" + identifier3 + '\'' +
                ", identifier4='" + identifier4 + '\'' +
                ", identifier5='" + identifier5 + '\'' +
                ", identifier6='" + identifier6 + '\'' +
                ", identifier7='" + identifier7 + '\'' +
                ", valueExpression=" + valueExpression +
                ", objectExpression=" + objectExpression +
                ", functionBody1=" + functionBody1 +
                ", functionBode2=" + functionBody2 +
                '}';
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!functionBody1.isEmpty()) {
            stringBuilder.append("if (").append(identifier1).append(") {\n");
            for (FunctionBody functionBody : functionBody1) {
                stringBuilder.append(functionBody.generatedCode());
            }
            stringBuilder.append("}\n");
            if (!functionBody2.isEmpty()) {
                stringBuilder.append("else {\n");
                for (FunctionBody functionBody : functionBody2) {
                    stringBuilder.append(functionBody.generatedCode());
                }
                stringBuilder.append("}\n");
            }
        } else if (identifier1 != null) {
            if (objectExpression != null) {
                stringBuilder.append(objectExpression.getInput());
                stringBuilder.append("const new").append(identifier1).append(" = {\n");
                stringBuilder.append(objectExpression.getAsinment());
                stringBuilder.append("};\n");
//                stringBuilder.append("this.").append(identifier1).append(".push(new").append(identifier1).append(");\n");
//                stringBuilder.append("localStorage.setItem('").append(identifier1).append("', JSON.stringify(this.").append(identifier1).append("));\n");
//                stringBuilder.append("if (confirm('success added ").append(identifier1).append("\\nDo you want to show List ").append(identifier1).append("?')) {\nsetTimeout(() => {\nwindow.location.href = '").append("ignore.html';\n}, 0);\n" + "}");
            } else if (identifier7 != null) {
//                stringBuilder.append("if (confirm('Are you sure to do it ?')) {\n");
                stringBuilder.append(identifier1).append(" = this.").append(identifier2).append(".").append(identifier3).append("(").append(identifier4).append(" => ").append(identifier5).append(".").append(identifier6).append(" ").append(eq).append("= ").append(identifier7).append(");\n");
//                stringBuilder.append("localStorage.setItem('").append(identifier1).append("', JSON.stringify(this.").append(identifier1).append("));\n");
                StringBuilder sb = new StringBuilder(identifier4);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
//                String xxx = sb.toString();
//                stringBuilder.append("if (this.selected").append(xxx).append(" && this.selected").append(xxx).append(".id === ").append(identifier7).append(") {\n").append("this.selected").append(xxx).append(" = null;\n}\n");
//                stringBuilder.append("}\n");

            } else if (identifier2 != null) {
                stringBuilder.append("this.").append(identifier1).append(" = ").append(identifier2).append(";\n");
            }
        } else if (valueExpression != null) {
            stringBuilder.append(valueExpression.generatedCode()).append("\n");
        }
        return stringBuilder.toString();
    }
}
