package AST;

public abstract class PropertyAssignment extends AstNode{

}
//    Selector selector  ;
//    Standalone standalone ;
//    ImportDeclaration importDeclaration ;
//    Template  template ;
//    Style style ;
//
//    public Selector getSelector() {
//        return selector;
//    }
//
//    public void setSelector(Selector selector) {
//        this.selector = selector;
//    }
//
//    public Standalone getStandalone() {
//        return standalone;
//    }
//
//    public void setStandalone(Standalone standalone) {
//        this.standalone = standalone;
//    }
//
//    public ImportDeclaration getImportDeclaration() {
//        return importDeclaration;
//    }
//
//    public void setImportDeclaration(ImportDeclaration importDeclaration) {
//        this.importDeclaration = importDeclaration;
//    }
//
//    public Template getTemplate() {
//        return template;
//    }
//
//    public void setTemplate(Template template) {
//        this.template = template;
//    }
//
//    public Style getStyle() {
//        return style;
//    }
//
//    public void setStyle(Style style) {
//        this.style = style;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("\nComponentBodyElement {");
//
//        if (selector != null) {
//            stringBuilder.append("\n  ").append(selector);
//        }
//        if (standalone != null) {
//            stringBuilder.append(",\n ").append(standalone);
//        }
//        if (importDeclaration != null) {
//            stringBuilder.append(",\n ").append(importDeclaration);
//        }
//        if (template != null) {
//            stringBuilder.append(",\n ").append(template);
//        }
//        if (style != null) {
//            stringBuilder.append(",\n  ").append(style);
//        }
//        return stringBuilder.toString();
//    }
