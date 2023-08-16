package org.launchcode;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int findSum(ArrayList<Double> numbers) {
        int sumTotal = 0;
        for (double num : numbers) {
            sumTotal += num;
        }
        return sumTotal;
    }

    public static void findWord(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of letters: ");
        int length = input.nextInt();
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Double> fibonacci = new ArrayList<>();
        fibonacci.add(1.0);
        fibonacci.add(1.0);
        fibonacci.add(2.0);
        fibonacci.add(3.0);
        fibonacci.add(5.0);
        fibonacci.add(8.0);
        fibonacci.add(13.0);
        fibonacci.add(21.0);
        fibonacci.add(34.0);
        fibonacci.add(55.0);
        fibonacci.add(89.0);
        System.out.println(fibonacci);
        System.out.println(findSum(fibonacci));

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Bekah");
        wordList.add("Erik");
        wordList.add("Clinton");
        wordList.add("Calvin");
        wordList.add("Kathy");
        wordList.add("Mick");
        System.out.println(wordList);
        findWord(wordList);

        String drSeuss = "I would not, could not, in a box. I would not, could not with a " +
                "fox. I will not eat them in a house. I will not eat them with a mouse.";
        drSeuss = drSeuss.replace(",", "").replace(".", "");
        String[] drSeussArray = drSeuss.split(" ");
        ArrayList<String> drSeussList = new ArrayList<String>(Arrays.asList(drSeussArray));
        findWord(drSeussList);
    }
}
