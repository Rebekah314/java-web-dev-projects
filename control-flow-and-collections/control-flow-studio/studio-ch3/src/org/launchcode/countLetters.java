package org.launchcode;


public class countLetters {
    public static int count(char compare, String checkString) {
        int times = 0;

        char[] stringArray = checkString.toCharArray();
        for (char letter : stringArray) {
            if(letter == compare) {
                times += 1;
            }
        }
        return times;
    }
}
