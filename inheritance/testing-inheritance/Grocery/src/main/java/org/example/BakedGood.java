package org.example;

public class BakedGood extends GroceryItem {

    private boolean isFresh;
    private boolean isGlutenFree;


    public BakedGood(String name, double price, boolean isFresh, boolean isGlutenFree) {
        super(name, price);
        this.isFresh = isFresh;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public void scannerNoise() {
        System.out.println("OH YEAH!");
    }
}
