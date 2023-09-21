package org.example;

public interface LaunchCode {
    //5 course types: women+A, women+B, liftoff, discovery, LC101
        //different target audiences
        //different meeting nights/days
    //think about actions
    String getCourseDays();
    String getMaterial();

    public static String getLCAddress() {
        return "on Delmar";
    }
}
