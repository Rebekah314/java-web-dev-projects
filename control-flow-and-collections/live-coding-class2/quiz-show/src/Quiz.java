public class Quiz {
    public static void askQuestion(String question) {
        System.out.println(question + " (t/f) ");
    }
    public static boolean checkQuestion(String answerGiven, String correctAnswer) {
        if(answerGiven.equals(correctAnswer)) {
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("Incorrect");
            return false;
        }
    }
}
