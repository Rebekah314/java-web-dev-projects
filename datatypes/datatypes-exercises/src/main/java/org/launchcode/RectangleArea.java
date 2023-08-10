package org.launchcode;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner length = new Scanner(System.in);
        System.out.println("Length of rectangle: ");
        float rectangleLength = length.nextFloat();

        Scanner width = new Scanner(System.in);
        System.out.println("Width of rectangle: ");
        float rectangleWidth = width.nextFloat();

        System.out.println("Area of rectangle: " + (rectangleWidth * rectangleLength));

    }
}

