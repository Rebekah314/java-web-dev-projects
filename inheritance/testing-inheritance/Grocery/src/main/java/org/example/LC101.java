package org.example;

public class LC101 implements LaunchCode {
    private String daysOfClass;
    private String classMaterial;

    public LC101(String daysOfClass, String classMaterial) {
        this.daysOfClass = daysOfClass;
        this.classMaterial = classMaterial;
    }

    @Override
    public String getCourseDays() {
        return daysOfClass;
    }

    @Override
    public String getMaterial() {
        return classMaterial;
    }
}
