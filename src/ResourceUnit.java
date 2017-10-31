public class ResourceUnit extends StatementReader {
    private String statement;
    private String name;
    private Integer value;
    private Integer amount;
    @Override
    boolean isUnitStatement(String line) {
        statement = line;
        return !statement.endsWith("?") && !isCreditStatement(line);
    }

    @Override
    void setValue() {
        if(isCreditStatement(statement)) {
            String[] resourceAndValue = statement.split(" is ");
            String[] resourceAmount = resourceAndValue[0].split(" ");
            String numeral = "";
            name = resourceAmount[resourceAmount.length-1];
            for (String unit : resourceAmount) {
                if (Runner.UNIT_VALUES.containsKey(unit)) {
                    numeral += Runner.UNIT_VALUES.get(unit);
                    amount = new Numeral(numeral).getValue();
                }
            }
            value = Integer.parseInt(resourceAndValue[1].split(" ")[0])/amount;
            Runner.RESOURCE_VALUES.put(name, value);
        }
    }

    private String join(String[] array){
        String result = "";
        for (String s : array) {
            result += s + " ";
        }
        return result;
    }
}
