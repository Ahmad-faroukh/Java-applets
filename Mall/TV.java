package Archive.Mall;

public class TV extends Electronects {
    private int size;

    public TV(double regularPrice, String name, int quantity, String manufacture, int size) {
        super(regularPrice, name, quantity, manufacture);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return getId()+". TV : " + getName() + " : " + getRegularPrice()+"$ : "+getQuantity()+" : Made in "+getManufacture()
                + " : "+getSize()+"inch";
    }
}