package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //this is not casting! this is saving a WomenPlus object in a variable of type LaunchCode interface
        LaunchCode course = new WomenPlus();

        LaunchCode course2 = new LC101("Monday and Thursday", "The same stuff");
        List<LaunchCode> classes = new ArrayList<>();
        classes.add(course);
        classes.add(course2);
        for (LaunchCode item : classes) {
            System.out.println(item.getCourseDays());
        }
        System.out.println(((WomenPlus) course).doesRetro());
    }
}
