public class CurrencyUnit extends StatementReader {
    private String statement;
    private String name;
    private Numeral value;

    public CurrencyUnit() {}

    public String getName() {
        return name;
    }

    public Numeral getValue() {
        return value;
    }

    @Override
    boolean isUnitStatement(String line) {
        statement = line;
        return !statement.endsWith("?") && !isCreditStatement(line);
    }
    
    @Override
    void setValue() {
        if(isUnitStatement(statement)) {
            String[] nameAndValue = statement.split(" is ");
            name = nameAndValue[0];
            value = new Numeral(nameAndValue[1]);
            Runner.UNIT_VALUES.put(name, value);
        }
    }
}