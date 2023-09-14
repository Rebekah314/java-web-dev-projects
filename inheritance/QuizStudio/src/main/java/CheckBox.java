import java.util.ArrayList;

public class CheckBox extends Question{
    ArrayList<String> correctAnswers;
    ArrayList<String> responses;

    public CheckBox(String text, ArrayList<String> answerChoices, ArrayList<String> correctAnswers) {
        super(text, answerChoices);
        this.correctAnswers = correctAnswers;
    }

    public String convertToString(ArrayList<String> arrayList) {
        return String.join(",", arrayList);
    }

    @Override
    public double checkAnswer() {
        double isCorrect = 0;
        for (String response : this.responses) {
            if (this.correctAnswers.contains(response)) {
                isCorrect++;
            }
        }
        isCorrect = isCorrect / responses.size();

        return isCorrect;
    }

    @Override
    public void setResponse(String s) {
        this.responses = responses;
    }
}
