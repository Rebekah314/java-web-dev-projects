import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.*;

public class CheckBox extends Question{
    ArrayList<String> correctAnswers;
    ArrayList<String> incorrectAnswers;
    String responses;

    public CheckBox(String text, ArrayList<String> answerChoices, ArrayList<String> correctAnswers, ArrayList<String> incorrectAnswers) {
        super(text, answerChoices);
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
    }


    public String convertToString(ArrayList<String> arrayList) {
        return String.join(",", arrayList);
    }

    @Override
    public double checkAnswer() {
        double isCorrect = 0;
        for (String answer : this.correctAnswers) {
            if (responses.contains(answer)) {
                isCorrect++;
            }
        }
        for (String answer : incorrectAnswers) {
            if (!responses.contains(answer)) {
                isCorrect++;
            }
        }
        return (double) round(isCorrect / getAnswerChoices().size() * 100) / 100;
    }

    @Override
    public void setResponse(String responses) {
        this.responses = responses;
    }
}
