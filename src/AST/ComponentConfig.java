package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentConfig extends AstNode {
    List<PropertyAssignment> propertyAssignmentList = new ArrayList<PropertyAssignment>();

    public List<PropertyAssignment> getPropertyAssignmentList() {
        return propertyAssignmentList;
    }

    public void setPropertyAssignmentList(List<PropertyAssignment> propertyAssignmentList) {
        this.propertyAssignmentList = propertyAssignmentList;
    }

    @Override
    public String toString() {
        return "ComponentConfig{" +
                "\npropertyAssignmentList=" + propertyAssignmentList +
                "\n}";
    }

    @Override
    public String generatedCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (PropertyAssignment propertyAssignment : propertyAssignmentList) {
            if (propertyAssignment instanceof Template)
                stringBuilder.append(propertyAssignment.generatedCode());
        }
        return stringBuilder.toString();
    }
}


