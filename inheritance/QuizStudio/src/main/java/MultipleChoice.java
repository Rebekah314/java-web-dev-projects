import java.util.ArrayList;
import java.util.Objects;

public class MultipleChoice extends Question {
    private String answer;
    private String response;
    public MultipleChoice(String text, ArrayList<String> answerChoices, String answer) {
        super(text, answerChoices);
        this.answer = answer;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public double checkAnswer() {
        return Objects.equals(this.response.toLowerCase(), this.answer.toLowerCase()) ? 1: 0;
    }
}
