public class Main {
    public static void main(String[] args) {
        NPC link = new NPC("Link");
        Game zelda = new Game("Zelda", "RPG", "Nintendo", link);
        zelda.addCharacter(link);
        System.out.println(link.getName());
        System.out.println(zelda.getMainCharacter().getName());
    }
}
