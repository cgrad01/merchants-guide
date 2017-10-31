abstract class StatementReader implements Parsable {
    public void parse(String line){
        if (isUnitStatement(line)){
            isCreditStatement(line);
            setValue();
        }
    }

    abstract boolean isUnitStatement(String line);
    abstract boolean isCreditStatement(String line);
    abstract void setValue();
}
