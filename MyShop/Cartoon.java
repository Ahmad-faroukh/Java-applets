package Archive.MyShop;

public class Cartoon extends Book {
    private String characterName ;

    public Cartoon(double price, String name, String publisher, int yearPublished, String characterName) {
        super(price, name, publisher, yearPublished);
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
