package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD testCD = new CD("test CD", "CD", 0.2, "audio", 350);
        DVD testDVD = new DVD("test DVD", "DVD", 5, "universal", 1200);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println("\nFirst, the CD: ");
        testCD.reportLogistics();
        testCD.spin();
        testCD.writeData();
        testCD.storeData();
        System.out.println(testCD.readData());

        System.out.println("\nFinally, the DVD: ");
        testDVD.reportLogistics();
        testDVD.spin();
        testDVD.writeData();
        testDVD.storeData();
        System.out.println(testDVD.readData());
    }
}