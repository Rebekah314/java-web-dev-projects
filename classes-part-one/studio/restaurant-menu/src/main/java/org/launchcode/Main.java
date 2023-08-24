package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<MenuItem> currentMenu = new ArrayList<>();
        Date currentDate = new Date();
        MenuItem tacoSalad = new MenuItem("Taco Salad Fajita", 14.50, "Taco shell with fajita veggies and chicken", "Main Course", true, false, false);
        MenuItem burrito = new MenuItem("Burrito San Jose", 14.25, "Tortilla with rice, beans, and chicken", "Main Course", false, false, false);

        currentMenu.add(tacoSalad);
        currentMenu.add(burrito);
        Menu SanJose = new Menu(currentDate, currentMenu);

        System.out.println(SanJose.getItems().get(0).getName());
        System.out.println(SanJose.getItems().get(1).getName());

    }
}
