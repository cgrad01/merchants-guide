abstract class QuestionReader implements Parsable {
    public void parse(String line){
        if (isQuestion(line)){
            setSubject();
            setQuantity();
            setValue();
            displayAnswer();
            resetLocals();
        }
    }

    abstract boolean isQuestion(String line);
    abstract void setSubject();
    abstract void setQuantity();
    abstract void setValue();
    abstract void displayAnswer();
    abstract void resetLocals();
}
