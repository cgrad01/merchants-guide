abstract class QuestionReader implements Parsable {
    public void parse(){
        if (isQuestion()){
            setSubject();
            setQuantity();
            displayAnswer();
        }
    }

    abstract boolean isQuestion();
    abstract void setSubject();
    abstract void setQuantity();
    abstract void displayAnswer();
}
