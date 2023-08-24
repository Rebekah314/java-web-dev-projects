public class NPC {
    //"has a" characteristics
    private String name;
    private String favoriteFood;
    private int age;
    private double strength;
    private double health;

    NPC(String name, String favoriteFood, int age, double strength, double health) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this. strength = strength;
        this.health = health;
    }

    NPC(String name, double health) {
        this.name = name;
        this.health = health;
    }

    NPC(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }
    public String getFavoriteFood() {
        return this.favoriteFood;
    }
    public int getAge() {
        return this.age;
    }
    public double getStrength() {
        return this.strength;
    }
    public double getHealth() {
        return this.health;
    }

}
