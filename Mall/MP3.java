package Archive.Mall;

public class MP3 extends Electronects {
    private String color;

    public MP3(double regularPrice, String name, int quantity, String manufacture, String color) {
        super(regularPrice, name, quantity, manufacture);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setManufacture() {

    }

    @Override
    public double computeSalePrice(double sale) {
        return getRegularPrice() - sale * getRegularPrice();
    }

    @Override
    public String toString() {
        return getId()+". MP3 : " + getName() + " : " + getRegularPrice() + "$ : " + getQuantity() + " : Made in " +
                getManufacture() + " : " + getColor();
    }
}