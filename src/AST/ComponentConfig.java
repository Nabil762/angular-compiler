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
        return "\nComponentConfig{" +
                "\npropertyAssignmentList=" + propertyAssignmentList +
                "\n}";
    }


//    @Override
//    public String toString() {
//        if (propertyAssignmentList.isEmpty()) {
//            return "{}";
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("{\n");
//
//        for (int i = 0; i < propertyAssignmentList.size(); i++) {
//            stringBuilder.append("  ").append(propertyAssignmentList.get(i).toString());
//            if (i < propertyAssignmentList.size() - 1) {
//                stringBuilder.append(",");
//            }
//            stringBuilder.append("\n");
//        }
//
//        stringBuilder.append("}");
//        return stringBuilder.toString();
//    }

}


