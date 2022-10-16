import java.util.*;

public class Table {
    String name;
    List<Column> columns;
    List<Row> rows;

    public Table(String name, List<Column> columns) {
        this.name = name;
        this.columns = columns;
        this.rows = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", columns=" + columns +
                ", rows=" + rows +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public Boolean insert(Row row){
        return this.rows.add(row);
    }

    public List<Row> query(String ){
    }

}
