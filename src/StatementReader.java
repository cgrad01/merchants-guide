abstract class StatementReader implements Parsable {
    public void parse(){
        if (isStatement()){
            setQuantity();
            setValue();
        }
    }

    abstract boolean isStatement();
    abstract void setQuantity();
    abstract void setValue();
}
