package Archive.Store;
import java.util.Scanner;

public class TheStore {

    public static void main(String[] args) {

        Item bread = new Item (0.99,"bread",0.78,40);
        ItemOrder Bread = new ItemOrder(bread,0);
        Item milk = new Item (1.99,"milk",1.55,50);
        ItemOrder Milk = new ItemOrder(milk,0);
        Item cereal = new Item (5.75,"cereal",4.65,35);
        ItemOrder Cereal = new ItemOrder(cereal,0);
        Item juice = new Item(3.49,"juice",2.99,45);
        ItemOrder Juice = new ItemOrder(juice,0);
        Item sugar = new Item(2.89,"sugar",1.99,60);
        ItemOrder Sugar = new ItemOrder(sugar,0);

        ShoppingCart myCart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        System.out.println(" Welcome to our Archive.Store");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("");

        System.out.println("Available Products");
        System.out.println("1.Bread");
        System.out.println("2.Milk");
        System.out.println("3.Cereal");
        System.out.println("4.Juice");
        System.out.println("5.Sugar");
        System.out.println("");

        while (true){

            System.out.println("==================");//main menu
            System.out.println("Enter :-");
            System.out.println("1.To view available products");
            System.out.println("2.To view product details");
            System.out.println("3.To add product to cart");
            System.out.println("4.To remove product from cart");
            System.out.println("5.To view your shopping cart contents");
            System.out.println("6.To get checkout price");
            System.out.println("0.To Exit");
            System.out.println("==================");

            int input = scanner.nextInt();
            switch(input){
                case 1:
                    System.out.println("Available Products");
                    System.out.println("1.Bread");
                    System.out.println("2.Milk");
                    System.out.println("3.Cereal");
                    System.out.println("4.Juice");
                    System.out.println("5.Sugar");
                    System.out.println("");
                    break;

                case 2 :
                    System.out.println("Enter the product ID");
                    int viewMenu = scanner.nextInt();
                    switch (viewMenu){   //product viewing

                        case 1 :
                            System.out.println(bread);
                            break;
                        case 2 :
                            System.out.println(milk);
                            break;
                        case 3 :
                            System.out.println(cereal);
                            break;
                        case 4 :
                            System.out.println(juice);
                            break;
                        case 5:
                            System.out.println(sugar);
                            break;
                    }
                    break;

                case 3 :
                    System.out.println("Enter the product ID");
                    int addMenu = scanner.nextInt();
                    switch (addMenu){  // the add menu
                        case 1 :
                            int count;
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            if(count<=bread.getBulkQuantity()){
                                myCart.addToCart(Bread,count);
                                bread.bulkQuantity-=count;
                            }else{
                                System.out.println("Invalid Quantity");
                            }
                            break;
                        case 2 :
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            if(count<=milk.getBulkQuantity()){
                                myCart.addToCart(Milk,count);
                                milk.bulkQuantity-=count;
                            }else{
                                System.out.println("Invalid Quantity");
                            }
                            break;
                        case 3 :
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            if(count<=cereal.getBulkQuantity()){
                                myCart.addToCart(Cereal,count);
                                cereal.bulkQuantity-=count;
                            }else{
                                System.out.println("Invalid Quantity");
                            }
                            break;
                        case 4 :
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            if(count<=juice.getBulkQuantity()){
                                myCart.addToCart(Juice,count);
                                juice.bulkQuantity-=count;
                            }else{
                                System.out.println("Invalid Quantity");
                            }
                            break;
                        case 5:
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            if(count<=sugar.getBulkQuantity()){
                                myCart.addToCart(Sugar,count);
                                sugar.bulkQuantity-=count;
                            }else{
                                System.out.println("Invalid Quantity");
                            }
                            break;
                    }
                    break;

                case 4 :
                    System.out.println("Enter the product ID");
                    int removeMenu = scanner.nextInt();
                    switch (removeMenu) {  // the remove menu
                        case 1:
                            myCart.removeFromCart(Bread);
                            break;
                        case 2:
                            myCart.removeFromCart(Milk);
                            break;
                        case 3:
                            myCart.removeFromCart(Cereal);
                            break;
                        case 4:
                            myCart.removeFromCart(Juice);
                            break;
                        case 5:
                            myCart.removeFromCart(Sugar);
                            break;
                    }
                    break;

                case 5 :  // to display your cart contents
                    myCart.display();
                    System.out.println("");
                    break;
                case 6 :  // to get the checkout price
                    System.out.println(myCart.getTotalPrice()+"$");
                    break;
                case 0 :  // exit
                    System.exit(0);
                    break;
            }
        }
    }
}