package AST;

public class PropertyValue {
    ValueExpression valueExpression;
    ArrayLiteral arrayLiteral;
    HtmlElement htmlElement;

    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    public void setValueExpression(ValueExpression valueExpression) {
        this.valueExpression = valueExpression;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        if(valueExpression != null)
            return "\n PropertyValue{" + valueExpression + "\n}";
        else if (htmlElement != null) {
            return "\n PropertyValue{" + htmlElement + "\n}";
        }
        return "\n PropertyValue{" + arrayLiteral + "\n}";
    }
}
