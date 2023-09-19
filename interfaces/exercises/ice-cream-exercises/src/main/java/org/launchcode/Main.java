package org.launchcode;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(new FlavorComparator());


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nFlavors:");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": $" + flavor.getCost());
        }
        System.out.println("\nCones:");
        for(Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }

        //Bonus Missions
        System.out.println("\nConcerned about allergens?");
        flavors.sort(new FlavorAllergenComparator());
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": " + String.join(", ", flavor.getAllergens()));
        }
        System.out.println("\nToppings:");
        toppings.sort(new ToppingComparator());
        for(Topping topping : toppings) {
            System.out.println(topping.getName());;
        }



    }
}