package Archive.MyShop;

public class Electronics extends Product{
    private String manufacture;

    public Electronics(double price, String name, String manufacture) {
        super(price, name);
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
