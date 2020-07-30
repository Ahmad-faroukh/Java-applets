package Archive.Mall;

public abstract class Electronects extends Product implements ElectronectsIF {

    private String manufacture;

    public Electronects(double regularPrice, String name, int quantity, String manufacture) {
        super(regularPrice, name, quantity);
        this.manufacture = manufacture;
    }

    @Override
    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}