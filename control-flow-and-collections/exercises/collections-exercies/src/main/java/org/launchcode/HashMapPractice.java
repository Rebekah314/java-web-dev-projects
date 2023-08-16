package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;
        Integer newID;

        System.out.println("Enter name of student (or ENTER when finished)");
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if (newStudent != "") {
                System.out.println("ID Number: ");
                newID = input.nextInt();
                students.put(newID, newStudent);
                System.out.println(students);

                String emptyString = input.nextLine();
            }
        } while (newStudent != "");
        input.close();

        System.out.println("Roster: ");
        for (Map.Entry<Integer, String> ID : students.entrySet()) {
            System.out.println(ID.getValue() + "(" + ID.getKey() + ")");
        }
    }
}
