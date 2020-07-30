package Archive.Mall;

public abstract class Product implements ProductIF {

    private double regularPrice;
    private String name;
    private int quantity;
    private int id;
    private static int count;

    public Product(double regularPrice, String name, int quantity) {
        this.regularPrice = regularPrice;
        this.name = name;
        this.quantity = quantity;
        count++;
        id=count;
    }

    @Override
    public double getRegularPrice() {
        return regularPrice;
    }

    @Override
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    public abstract double computeSalePrice(double sale);

}