package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Test out your Divide() method!
        System.out.println("3 divided by 2 equals " + Divide(3, 2));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode");
        studentFiles.put("Stefanie", "CoolProgram.txt");

        // Test out your CheckFileExtension() method!
        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue() + ": " + CheckFileExtension(entry.getValue()));
        }

    }

    public static double Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("You can't divide by zero!");
            } catch (ArithmeticException exception) {
                exception.printStackTrace();
            }
        }
        return (double) x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        String extension;
        if (fileName.equals("") || fileName == null) {
            try {
                throw new FileExtException("OOPS! No file submitted");
            } catch (FileExtException exception) {
                exception.printStackTrace();
            }
            return -1;
        } else if (fileName.indexOf(".") != -1) {
            extension = fileName.substring(fileName.lastIndexOf(".") + 1);
            if (extension.equals("java")) {
                return 1;
            }
        }
        return 0;
    }
}