package org.example;

public class Fruit extends GroceryItem {
    private boolean isRipe;
    private boolean isOrganic;

    public Fruit(String name, double price, boolean isRipe, boolean isOrganic) {
        super(name, price);
        this.isRipe = isRipe;
        this.isOrganic = isOrganic;
    }

    @Override
    public void scannerNoise() {
        System.out.println("EWWWWW");
    }
}
