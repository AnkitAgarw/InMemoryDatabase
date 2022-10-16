import java.util.List;

public class Query {
    String tableName;

    int limit;
    int offset;
    List<Column> columnList;

    List<Constrains> constrains;

    public Query(String tableName, int limit, int offset, List<Column> columnList, List<Constrains> constrains, List<Column> orderBy) {
        this.tableName = tableName;
        this.limit = limit;
        this.offset = offset;
        this.columnList = columnList;
        this.constrains = constrains;
        this.orderBy = orderBy;
    }

    List<Column> orderBy;

}
