package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner miles = new Scanner(System.in);
        System.out.println("How many miles did you drive?: ");
        float milesDriven = miles.nextFloat();

        Scanner gallons = new Scanner(System.in);
        System.out.println("How many gallons of gas did you use?: ");
        float gallonsUsed = gallons.nextFloat();

        System.out.println("Your vehicle got " + (milesDriven / gallonsUsed) + " miles per gallon.");
    }
}


