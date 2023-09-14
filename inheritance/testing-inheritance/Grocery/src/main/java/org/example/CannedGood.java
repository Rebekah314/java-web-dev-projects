package org.example;

public class CannedGood extends GroceryItem {

    private double volume;
    private boolean isDented;

    public CannedGood(String name, double price, double volume, boolean isDented) {
        super(name, price);
        this.volume = volume;
        this.isDented = isDented;
    }

    @Override
    public void scannerNoise() {
        System.out.println("BEE DOOP");
    }
}
