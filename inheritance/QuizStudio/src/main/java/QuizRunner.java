import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner { //comment for updating on GitHub
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Question> quiz = new ArrayList<>();
        MultipleChoice question1 = new MultipleChoice("What animal can fly? ", new ArrayList<>(Arrays.asList("dog", "cat", "bird")), "bird");
        TrueFalse question2 = new TrueFalse("Giraffes can fly.", new ArrayList<>(Arrays.asList("true", "false")), "false");
        CheckBox question3 = new CheckBox("Which animal(s) cannot fly?", new ArrayList<>(Arrays.asList("dog", "cat", "bird")), new ArrayList<>(Arrays.asList("dog", "cat")), new ArrayList<String>(Arrays.asList("bird")));
        quiz.add(question1);
        quiz.add(question2);
        quiz.add(question3);

        double score = 0;

        for (Question question : quiz) {
            System.out.print("Question: ");
            question.displayQuestion();
            question.displayAnswers();
            System.out.println("Answer: ");
            question.setResponse(input.nextLine());
            score += question.checkAnswer();


        }
        System.out.println("You scored " + score + " out of " + quiz.size());
    }
}
