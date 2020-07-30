package Archive.MyShop;

public class MP3Player extends Electronics {

    private String color ;

    public MP3Player(double price, String name, String manufacture, String color) {
        super(price, name, manufacture);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
