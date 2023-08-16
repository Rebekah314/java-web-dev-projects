package org.launchcode;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        String alice = aliceQuote.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String searchString = input.nextLine().toLowerCase();

        boolean stringsMatch = alice.contains(searchString);
        int location = alice.indexOf(searchString);
        System.out.println(stringsMatch + ", the search term starts at location " + location
         + " and has length " + searchString.length());

        System.out.println("Removing the search term, the quote is now: ");
        String newQuote = alice.replaceFirst(searchString, "***");
        System.out.println(newQuote);


    }
}
