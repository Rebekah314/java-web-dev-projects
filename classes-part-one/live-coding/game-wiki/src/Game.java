import java.util.ArrayList;

public class Game {
    private String name;
    private String genre;
    private String platform;
    private NPC mainCharacter;
    private ArrayList<NPC> characters = new ArrayList<>();
    Game(String name, String genre, String platform) {
        this.name = name;
        this.genre = genre;
        this.platform = platform;
    }
    Game(String name, String genre, String platform, NPC mainCharacter) {
        this(name, genre, platform);
        this.mainCharacter = mainCharacter;
    }
    public String getName() {
        return this.name;
    }

    public void addCharacter(NPC character) {
        this.characters.add(character);
    }

    public ArrayList<NPC> getCharacters() {
        return this.characters;
    }

    public NPC getMainCharacter() {
        return mainCharacter;
    }
}
