public class CurrencyUnit extends StatementReader {
    private String statement;
    private String name;
    private Numeral value;

    public CurrencyUnit(String statement) {
        evaluate(statement);
    }

    private void evaluate(String statement) {
        this.statement = statement;
        if(isUnitStatement()) {
            setValue();
        }
    }

    public String getName() {
        return name;
    }

    public Numeral getValue() {
        return value;
    }

    @Override
    boolean isUnitStatement() {
        return !statement.endsWith("?") && !isCreditStatement();
    }

    @Override
    boolean isCreditStatement() {
        return statement.contains("Credits");
    }

    @Override
    void setValue() {
        String[] nameAndValue = statement.split(" is ");
        name = nameAndValue[0];
        value = new Numeral(nameAndValue[1]);
    }
}