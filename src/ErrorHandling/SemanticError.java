//package ErrorHandling;
//
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Objects;
//
//public class SemanticError {
//    SymbolTable symbolTable;
//    Error error = new Error();
//    public SymbolTable getSymbolTable() {
//        return symbolTable;
//    }
//    public void setSymbolTable(SymbolTable symbolTable) {
//        this.symbolTable = symbolTable;
//    }
//    public boolean check() {
//        boolean hasError = true;
//        if(!IncorrectAttribute(this.symbolTable)){
//            error.getErrors().add("Exception Incorrect_Attribute");
//            hasError = false;
//        }
//        if(!MissingClosingTags(this.symbolTable))
//        {
//            error.getErrors().add("Exception Missing_Closing_Tags");
//            hasError = false;
//        }
//        if(!RepeatedDeclare(this.symbolTable)){
//            error.getErrors().add("Exception Repeated_Declare");
//            hasError = false;
//        }
//        if(!MissingKeyPropInList(this.symbolTable)){
//            error.getErrors().add("missing key prop for list items");
//            hasError = false;
//        }
//        error.print();
//        /*else if(!checkPassingIncorrectProps(this.symbolTable)){
//            System.out.println("Exception Passing Incorrect Props");
//            return false;
//        } else*/
//            return hasError;
//    }
//    boolean MissingClosingTags(SymbolTable symbolTable){
//        boolean is_error = true;
//        int CountOfOpenTag = 0;
//        int CountOfCloseTag = 0;
//        for(int i = 0;i < symbolTable.getRows().size();i++){
//            if(symbolTable.getRows().get(i) != null){
//                    if(symbolTable.getRows().get(i).getValue().equals("<") )
//                        CountOfOpenTag++;
//                    if(symbolTable.getRows().get(i).getValue().equals(">") )
//                        CountOfCloseTag++;
//            }
//        }
//        if(CountOfOpenTag != CountOfCloseTag){
//            is_error = false;
//        }
//        return is_error;
//    }
//    boolean IncorrectAttribute(SymbolTable symbolTable) {
//        boolean is_error = true;
//        List<String> srcValues = new ArrayList<>();
//        List<String> altValues = new ArrayList<>();
//        List<String> classNameValues = new ArrayList<>();
//        for (int i = 0; i < symbolTable.getRows().size(); i++) {
//            if (symbolTable.getRows().get(i) != null) {
//                if (symbolTable.getRows().get(i).getType().contains("variable source"))
//                    srcValues.add(symbolTable.getRows().get(i).getValue());
//                if (symbolTable.getRows().get(i).getType().contains("variable alt"))
//                    altValues.add(symbolTable.getRows().get(i).getValue());
//                if (symbolTable.getRows().get(i).getType().contains("className attribute"))
//                    classNameValues.add(symbolTable.getRows().get(i).getValue());
//            }
//        }
//
//        for (String src : srcValues) {
//            if (isValidAttributeName(src)) {
//                is_error = false;
//                System.err.println("Invalid attribute src: " + src);
//            }
//        }
//
//        for (String alt : altValues) {
//            if (isValidAttributeName(alt)) {
//                is_error = false;
//                System.err.println("Invalid attribute alt: " + alt);
//            }
//        }
//
//        for (String className : classNameValues) {
//            if (isValidAttributeName(className)) {
//                is_error = false;
//                System.err.println("using incorrect attribute instead of className");
//            }
//        }
//        return is_error;
//    }
//
//    boolean isValidAttributeName(String attributeName) {
//        List<String> validAttributeNames = Arrays.asList("src", "alt", "className");
//        return !validAttributeNames.contains(attributeName);
//    }
//    boolean RepeatedDeclare(SymbolTable symbolTable) {
//        boolean is_error = true;
//        for (int i = 0; i < symbolTable.getRows().size(); i++) {
//            if (symbolTable.getRows().get(i) != null) {
//                for (int j = 0; j < i; j++) {
//                    if (symbolTable.getRows().get(j) != null &&
//                            Objects.equals(symbolTable.getRows().get(j).getValue(), symbolTable.getRows().get(i).getValue())
//                    && Objects.equals(symbolTable.getRows().get(i).getScope().getName(), "local scope")) {
//                        is_error = false;
//                    }
//                }
//            }
//        }
//        return is_error;
//    }
//    Boolean MissingKeyPropInList(SymbolTable symbolTable){
//        boolean is_error = false;
//        for(int i = 0;i < symbolTable.getRows().size(); i++){
//            if(symbolTable.getRows().get(i) != null){
//                if(symbolTable.getRows().get(i).getValue().equals("key")){
//                    is_error = true;
//                }
//            }
//        }
//        return is_error;
//    }
//
//}
//
