//package AST;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Parameters extends AstNode{
//     List<Parameter> parameters = new ArrayList<>();
//
//    public void addParameter(Parameter parameter) {
//        parameters.add(parameter);
//    }
//
//    public void addAllParameters(List<Parameter> parameters) {
//        this.parameters.addAll(parameters);
//    }
//
//    public List<Parameter> getParameters() {
//        return new ArrayList<>(parameters);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < parameters.size(); i++) {
//            sb.append(parameters.get(i).toString());
//            if (i < parameters.size() - 1) {
//                sb.append(", ");
//            }
//        }
//        return sb.toString();
//    }
//}