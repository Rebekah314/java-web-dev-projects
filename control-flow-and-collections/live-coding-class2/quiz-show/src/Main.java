import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> questions = new HashMap<>();
        questions.put("This Women+ cohort likes summer.", "f");
        questions.put("Today is Friday.", "f");
        questions.put("Dogs are cool.", "t");
        questions.put("Cats are better.", "f");
        int score = 0;
        for (Map.Entry<String, String> question : questions.entrySet()) {
            Quiz.askQuestion(question.getKey());
            String answer = input.nextLine();
            boolean correct = Quiz.checkQuestion(answer, question.getValue());
            if(correct) {
                score ++;
            }
        }
        System.out.println("You scored " + score + " out of " + questions.size());



    }
}
