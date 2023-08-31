import java.util.Objects;

public class NPC {
    //"has a" characteristics
    private static int nextId = 1;
    private int id;     //want this to increment with every NPC created
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
        this.id = nextId;
        nextId ++;
    }

    NPC(String name, double health) {
        this.name = name;
        this.health = health;
        this.id = nextId;
        nextId ++;
    }

    NPC(String name) {
        this.name = name;
        this.health = 100;
        this.id = nextId;
        nextId ++;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        //whatever I want to see of this object, useful for debugging!
        return "Id: " + this.id + " Name: " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        NPC npc = (NPC) o; //cast object o to NPC type, and save as new variable
        return getId() == npc.getId() && Objects.equals(this.getName(), npc.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
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
