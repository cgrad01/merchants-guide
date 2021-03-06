abstract class QuestionReader implements Parsable {
    public void parse(String line){
        if (isQuestion(line)) {
            setSubject();
            setQuantity();
            setValue();
            displayAnswer();
        }
    }

    abstract boolean isQuestion(String line);
    abstract void setSubject();
    abstract void setQuantity();
    abstract void setValue();
    abstract void displayAnswer();
}
