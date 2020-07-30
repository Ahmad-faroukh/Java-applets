package Archive.MyShop;

public class TV extends Electronics {
    private int size ;

    public TV(double price, String name, String manufacture, int size) {
        super(price, name, manufacture);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
