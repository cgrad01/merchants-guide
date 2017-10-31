import java.util.ArrayList;

public class UnitConverter extends QuestionReader {
    private String question;
    private String quantity = "";
    private Integer value;
    private String subject;

    @Override
    boolean isQuestion(String line) {
        question = line;
        return question.endsWith("?");
    }

    @Override
    void setSubject() {
        subject = "";
        for (String resource : Runner.RESOURCE_VALUES.keySet()) {
            if (question.contains(resource)) {
                subject = resource;
            }
        }
    }

    @Override
    void setQuantity() {
        quantity = "";
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
        if (question.contains("Credits")) {
            Runner.QUESTION_ANSWERS.add(quantity.trim() + " " + subject.trim() + " is " + Runner.RESOURCE_VALUES.get(subject) * value);
        } else {
            Runner.QUESTION_ANSWERS.add(quantity.trim() + " is " + value);
        }
    }
}
