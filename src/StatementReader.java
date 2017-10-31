abstract class StatementReader implements Parsable {
    public void parse(String line){
        if (isUnitStatement()){
            isCreditStatement();
            setValue();
        }
    }

    abstract boolean isUnitStatement();
    abstract boolean isCreditStatement();
    abstract void setValue();
}
