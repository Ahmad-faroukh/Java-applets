package Archive.MyShop;

public class Order {

    Product product;
    int quantity ;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrcie(){
        return product.priceFor(quantity);
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return  product + "\tquantity : " + quantity ;
    }
}