package org.example;

public class Main {
    public static void main(String[] args) {
        BakedGood bread = new BakedGood("bread", 1.99, true, false);
        CannedGood peaches = new CannedGood("Peaches", 0.99, 16.0, false);
        Fruit apple = new Fruit("Apple", 1.99, true, true);

       bread.scannerNoise();
       peaches.scannerNoise();
       apple.scannerNoise();
    }
}
