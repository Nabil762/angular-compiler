package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentConfig {
    List<PropertyAssignment> propertyAssignmentList = new ArrayList<PropertyAssignment>();

    public List<PropertyAssignment> getPropertyAssignmentList() {
        return propertyAssignmentList;
    }

    public void setPropertyAssignmentList(List<PropertyAssignment> propertyAssignmentList) {
        this.propertyAssignmentList = propertyAssignmentList;
    }

    @Override
    public String toString() {
        return "\nComponentConfig{" +
                "\npropertyAssignmentList=" + propertyAssignmentList +
                "\n}";
    }
}
