public class CurrencyUnit extends StatementReader {
    private String statement;
    private String name;
    private Numeral value;

    public CurrencyUnit(String statement) {
        evaluate(statement);
    }

    private void evaluate(String statement) {
        this.statement = statement;
        if(isStatement()) {
            String[] nameAndValue = new String[2];
            nameAndValue = statement.split(" is ");
            name = nameAndValue[0];
            value = new Numeral(nameAndValue[1]);
        }
    }

    public String getName() {
        return name;
    }

    public Numeral getValue() {
        return value;
    }

    @Override
    boolean isStatement() {
        return !statement.endsWith("?");
    }

    @Override
    void setQuantity() {

    }

    @Override
    void setValue() {

    }
}