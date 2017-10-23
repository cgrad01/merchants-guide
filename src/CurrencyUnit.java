public class CurrencyUnit {
    private String name;
    private String value;

    public CurrencyUnit(String statement) {
        evaluate(statement);
    }

    private void evaluate(String statement) {
        String[] nameAndValue = new String[2];
        nameAndValue = statement.split(" is ");
        name = nameAndValue[0];
        value = nameAndValue[1];
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

}