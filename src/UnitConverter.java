public class UnitConverter extends QuestionReader {
    private String question;

    @Override
    boolean isQuestion(String line) {
        question = line;
        return question.endsWith("?");
    }

    @Override
    void setSubject() {

    }

    @Override
    void setQuantity() {

    }

    @Override
    void displayAnswer() {
        Runner.QUESTION_ANSWERS.add("Answer 1");
    }
}
