abstract class StatementReader implements Parsable {
    public void parse(String line){
        if (isUnitStatement(line)) {
            setValue();
        } else if(isCreditStatement(line)){
            setValue();
        }
    }

    abstract boolean isUnitStatement(String line);

    public boolean isCreditStatement(String line){
        return line.contains("Credits");
    }

    abstract void setValue();
}
