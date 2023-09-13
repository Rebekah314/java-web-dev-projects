public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat domino = new HouseCat("Domino");
        System.out.println(domino.getWeight());

        Cat lion = new Cat(147);
        System.out.println(lion.noise());
        System.out.println(domino.noise());

    }
}
