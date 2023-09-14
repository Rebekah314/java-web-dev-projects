import java.util.ArrayList;

public abstract class Question {
    private String text;
    private ArrayList<String> answerChoices;

    public Question(String text, ArrayList<String> answerChoices) {
        this.text = text;
        this.answerChoices = answerChoices;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public void displayQuestion() {
        System.out.println(text);
    }
    public void displayAnswers(){
        for (String choice : answerChoices) {
            System.out.println(choice);
        }
    }

    public abstract double checkAnswer();

    public abstract void setResponse(String response);
}
