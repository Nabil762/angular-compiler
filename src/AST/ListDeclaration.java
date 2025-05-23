package AST;

public class ListDeclaration {
    ListStatement listStatement;
    Property_declaration property_declaration;
    ForDeclaration forDeclaration;

    public ListStatement getListStatement() {
        return listStatement;
    }

    public void setListStatement(ListStatement listStatement) {
        this.listStatement = listStatement;
    }

    public Property_declaration getProperty_declaration() {
        return property_declaration;
    }

    public void setProperty_declaration(Property_declaration property_declaration) {
        this.property_declaration = property_declaration;
    }

    public ForDeclaration getForDeclaration() {
        return forDeclaration;
    }

    public void setForDeclaration(ForDeclaration forDeclaration) {
        this.forDeclaration = forDeclaration;
    }

    @Override
    public String toString() {
        if(listStatement != null)
            return "\n List 0f Declararion{ listStatement = " + listStatement + "\n}";
        else if (property_declaration != null) {
            return "\n List of Declararion{  = property_declaration = " + property_declaration + "\n }";
        }
        return "\n List of Declararion{ forDeclaration = " + forDeclaration + "\n }";
    }
}
