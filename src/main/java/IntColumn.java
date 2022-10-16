public class IntColumn implements Column{
    String name;

    public IntColumn(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IntColumn{" +
                "name='" + name + '\'' +
                '}';
    }

    static public boolean isValid(Object input){
        return input instanceof Integer;
    }


}
