public class Main {
    public static void main(String[] args) {
        NPC link = new NPC("Link");
        Game zelda = new Game("Zelda", "RPG", "Nintendo", link);
        zelda.addCharacter(link);

        NPC mario = new NPC("Mario");
        System.out.println(link);
        System.out.println(mario);
        System.out.println(link.equals(mario));
        System.out.println(link.equals(link));
    }
}
