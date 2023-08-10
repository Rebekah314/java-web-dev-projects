package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius of circle: ");

        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();
            while (Validation.isNegative(radius)) {
                System.out.println("Error: Please enter a positive radius.");
                System.out.println("Radius of circle: ");
                radius = input.nextDouble();
            }
            System.out.println("Area of circle: " + Circle.getArea(radius));

        } else {
            System.out.println("Error: Please enter a number.");
        }


    }
}
