package symbolTableAngular;

public class Row {
    String type;
    String value;
    int Line, position;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLine() {
        return Line;
    }

    public void setLine(int line) {
        Line = line;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Row{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", Line=" + Line +
                ", position=" + position +
                '}'+'\n';
    }
}
