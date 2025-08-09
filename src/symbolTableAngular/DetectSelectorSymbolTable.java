package symbolTableAngular;

import java.util.ArrayList;
import java.util.List;


public class DetectSelectorSymbolTable {
    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void setRow(Row row) {
        rows.add(row);
    }

    public void print() {
        for (Row row : rows) {
            if (row != null) {
                System.out.println(row.getType() + "\t\t\t\t " + row.getValue() + "\t\t\t\t " + row.getLine() + "\t\t\t\t " + row.getPosition());
            }
        }
    }
}
