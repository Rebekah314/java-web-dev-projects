package org.example;

public class WomenPlus implements LaunchCode{
    private String days = "Wednesday";
    private String material = "JS and Java";

    @Override
    public String getCourseDays() {
        return days;
    }

    @Override
    public String getMaterial() {
        return material;
    }
    public boolean doesRetro() {
        return true;
    }
}
