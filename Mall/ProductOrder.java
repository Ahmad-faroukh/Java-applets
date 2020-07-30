package Archive.Mall;

public class ProductOrder {
    private Product product;
    private int quantity;

    public ProductOrder(Product product) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
        product.setQuantity(-quantity);
    }

    public void removeQuantity(int quantity) {
        this.quantity -= quantity;
        product.setQuantity(quantity);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOrderPrice() {
        return quantity * product.getRegularPrice();
    }

    @Override
    public String toString() {
        return product.getId()+ " : " + product.getName() + " : Quantity " + quantity+" .";
    }
}