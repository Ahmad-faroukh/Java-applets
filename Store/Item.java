package Archive.Store;

public class Item {

    private double price ;
    private String name ;
    public int bulkQuantity;
    private double bulkPrice;

    public Item(double price , String name , double bulkPrice , int bulkQuantity){
        this.price = price ;
        this.name = name ;
        this.bulkPrice = bulkPrice ;
        this.bulkQuantity = bulkQuantity ;
    }
    public double priceFor(int quantity){
        return quantity * price ;
    }

    public double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }

    public int getBulkQuantity() {
        return bulkQuantity;
    }

    public double getBulkPrice() {
        return bulkPrice;
    }

    public void addToBulk(int quantity){
        this.bulkQuantity += quantity ;
    }

    @Override
    public String toString(){
        return "Product Name :  " + name + "\nUnit Price : " + price +" $"+"\nBulk Quantity : " + bulkQuantity +"\nBulk Price : " +bulkPrice +"\n";
    }
}