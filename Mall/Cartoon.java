package Archive.Mall;

public class Cartoon extends Book {
    private String characterName;

    public Cartoon(double regularPrice, String name, int quantity, String publisher, int yearPublished,
                   String characterName) {
        super(regularPrice, name, quantity, publisher, yearPublished);
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void setYearpublished() {

    }

    @Override
    public double computeSalePrice(double sale) {
        return getRegularPrice() - sale * getRegularPrice();
    }

    @Override
    public String toString() {
        return getId()+". Children book : " + getName() + " : " + getRegularPrice() + "$ : " + getQuantity() + " : Publisher "
                + getPublisher() + " : " + " Year  " + getYearPublished() + " : Character name " + getCharacterName();

    }
}