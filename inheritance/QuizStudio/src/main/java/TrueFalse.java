import java.util.ArrayList;
import java.util.Objects;

public class TrueFalse extends Question {
    private String answer;
    private String response;

    public String isAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String isResponse() {
        return response;
    }


    public TrueFalse(String text, ArrayList<String> answerChoices, String answer) {
        super(text, answerChoices);
        this.answer = answer;
    }

    @Override
    public double checkAnswer() {
        return Objects.equals(this.response.toLowerCase(), this.answer.toLowerCase()) ? 1 : 0;
    }

    @Override
    public void setResponse(String response) {
        this.response = response;
    }


}
