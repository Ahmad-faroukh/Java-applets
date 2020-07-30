
package HomeWork;

public class product {
    
    private int numberSold ;// the number of units sold of one product 
    private double itemCost ;// total price of a unit
    private int bulkQuantity ;
    private double bulkDiscount ; 
    private static double totalSalesM ;// the amount of the sales (money) on the unit 
    private static int totalSalesQ ;// the amount of all products sold
    private static double totalDiscount ;//the discount on all items (if the sotre has a sale)
    
    public product (double unitPrice , double bulkDiscount , int bulkQn ){
        this.itemCost = unitPrice ;
        this.bulkDiscount = bulkDiscount ;
        this.bulkQuantity = bulkQn ;
    }
    
    public void registerSale(int quantity){
        double finalPrice = itemCost ;
        numberSold += quantity ;
        totalSalesQ+= quantity ;
        if (quantity > bulkQuantity){
            finalPrice = itemCost - itemCost*(totalDiscount/100) ;
        }
        totalSalesM += quantity*finalPrice;
    }
    
    public void displaySales(){
        System.out.println("This item have sold " + numberSold + " units");
        System.out.println("The total sales of all products is " +totalSalesQ + " units");
        System.out.println("Total sales are " +totalSalesM + "$" );
        System.out.println("The Archive.Store have a " + totalDiscount +"%" +" Discount right now");
    }

    public static void setTotalDiscount(double totalDiscount) {
        product.totalDiscount = totalDiscount;
    }
    
    public static void main(String[] args) {
        product milk = new product (4.99 , 35 ,100 );
        product water = new product (1.99 , 50 ,30 );
        product rice = new product (6.99 , 25 ,75 );
        milk.registerSale(3);
        milk.displaySales();
        System.out.println("===============================");
        water.registerSale(40);
        water.displaySales();
        System.out.println("================================");
        setTotalDiscount(50);
        rice.registerSale(12);
        rice.displaySales();
        System.out.println("================================");
    }
}
