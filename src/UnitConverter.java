import java.util.ArrayList;

public class UnitConverter extends QuestionReader {
    private String question;
    private String quantity = "";
    private Integer value;

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
        String[] words = question.split(" ");
        for (String word : words) {
            if (Runner.UNIT_VALUES.containsKey(word)) {
                quantity += word + " ";
            }
        }
    }

    @Override
    void setValue() {
        String[] units = quantity.split(" ");
        String numeral = "";
        for (String unit : units) {
            numeral += Runner.UNIT_VALUES.get(unit);
            value = new Numeral(numeral).getValue();
        }
    }

    @Override
    void displayAnswer() {
        Runner.QUESTION_ANSWERS.add(quantity + "is " + value);
    }
}
