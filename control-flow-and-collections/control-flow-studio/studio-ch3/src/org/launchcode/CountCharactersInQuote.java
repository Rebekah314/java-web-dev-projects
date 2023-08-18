package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountCharactersInQuote {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. So if " +
                "you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";
        char[] quoteLetters = quote.toLowerCase().toCharArray();

        //Main Assignment
        HashMap<Character, Integer> letterCounts = new HashMap<>();
        for (char quoteLetter : quote.toCharArray()) {
            letterCounts.put(quoteLetter, countLetters.count(quoteLetter, quote));
        }
        System.out.println(letterCounts);

        //Bonus Mission #2
        HashMap<Character, Integer> lowerCaseLetterCounts = new HashMap<>();
        for (char quoteLetter : quoteLetters) {
            lowerCaseLetterCounts.put(quoteLetter, countLetters.count(quoteLetter, quote.toLowerCase()));
        }
        System.out.println(lowerCaseLetterCounts);

        //Bonus Mission #3
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        ArrayList<String> alphabetArrayList = new ArrayList<>(Arrays.asList(alphabet.split("")));
        HashMap<Character, Integer> justLetterCounts = new HashMap<>();
        for (String quoteLetter : quote.split("")) {
            if (alphabetArrayList.contains(quoteLetter)) {
                justLetterCounts.put(quoteLetter.charAt(0), countLetters.count(quoteLetter.charAt(0), quote.toLowerCase()));
            }
        }
        System.out.println(justLetterCounts);

        //Bonus Mission #1: User Enter a String for counting. (like main assignment)
        HashMap<Character, Integer> userInputCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a phrase for character counting: ");
        String response = input.nextLine();
        for(Character letter : response.toCharArray()) {
            userInputCount.put(letter, countLetters.count(letter, response));
        }
        System.out.println(userInputCount);

    }
}
