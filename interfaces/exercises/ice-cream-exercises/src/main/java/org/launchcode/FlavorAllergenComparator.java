package org.launchcode;

import java.util.Comparator;

public class FlavorAllergenComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        int numAllergens1 = flavor1.getAllergens().size();
        int numAllergens2 = flavor2.getAllergens().size();
        if(numAllergens1 > numAllergens2) {
            return -1;
        } else if (numAllergens1 < numAllergens2) {
            return 1;
        }
        return 0;
    }
}
