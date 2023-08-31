package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import org.launchcode.Menu;
import org.launchcode.MenuItem;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LocalDate date = LocalDate.now();
        MenuItem fishTacos = new MenuItem(6.99, "Fish Tacos", "Main Course", true);
        MenuItem tacoSalad = new MenuItem(8.50, "Taco Salad", "Appetizer", false);
        MenuItem churros = new MenuItem(4.75, "Churros", "Dessert", true);

        Menu newMenu = new Menu();
        newMenu.addItem(fishTacos);
        newMenu.addItem(tacoSalad);
        newMenu.addItem(churros);
        System.out.println(fishTacos);
        System.out.println(tacoSalad);
        System.out.println(churros);
        System.out.println(newMenu.getItems());
    }
}
