package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isVegan;
    private boolean isGF;

    public MenuItem(String name, double price, String description, String category, boolean isNew, boolean isVegan, boolean isGF) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.isVegan = isVegan;
        this.isGF = isGF;

    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public String getCategory() {
        return this.category;
    }
    public boolean getNew() {
        return this.isNew;
    }
    public boolean getVegan() {
        return this.isVegan;
    }
    public boolean getGF() {
        return this.isGF;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public void setVegan(boolean aVegan) {
        isVegan = aVegan;
    }
    public void setGF(boolean aGF) {
        isNew = aGF;
    }
}
