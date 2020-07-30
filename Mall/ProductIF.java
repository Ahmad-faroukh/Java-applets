package Archive.Mall;

public interface ProductIF {
    public double computeSalePrice(double sale);

    public double getRegularPrice();

    public void setRegularPrice(double regularPrice);

    public int getQuantity();

    public void setQuantity(int quantity);

    public String getName();

    public void setName(String name);

    public int getId();
}