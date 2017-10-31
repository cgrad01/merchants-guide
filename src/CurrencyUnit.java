public class CurrencyUnit {
    private String name;
    private Numeral value;

    public CurrencyUnit(String statement) {
        evaluate(statement);
    }

    private void evaluate(String statement) {
        String[] nameAndValue = new String[2];
        nameAndValue = statement.split(" is ");
        name = nameAndValue[0];
        value = new Numeral(nameAndValue[1]);
    }

    public String getName() {
        return name;
    }

    public Numeral getValue() {
        return value;
    }

}