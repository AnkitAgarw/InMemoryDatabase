public class StringColumn implements Column {
    String name;

    public StringColumn(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StringColumn{" +
                "name='" + name + '\'' +
                '}';
    }

    static public boolean isValid(Object input){
        return input instanceof String;
    }
}
