package Archive.MyShop;

public class Product {

    private double price ;
    private String name ;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double computeSalePrice(double presentOff){
       return this.price = this.price*(presentOff/100) ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double priceFor(int quantity){
        return quantity * price ;
    }

    public String getName(){
        return name ;
    }

    @Override
    public String toString(){
        return"Product : " + name + "\tPrice " + price + "$";
    }
}