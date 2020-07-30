package Archive.MyShop;

import java.util.Scanner;

public class TheStore {

    public static void main(String[] args) {

        Product smartTv = new TV(800,"SmartTv","Samsung",55);
        Order SmartTv = new Order(smartTv,0);
        Product plasmaTv = new TV(400,"PlasmaTv","Sharp",32);
        Order PlasmaTv = new Order(plasmaTv,0);
        Product xs700 = new MP3Player(150,"XS700","Beats","Red");
        Order XS700 = new Order(xs700,0);
        Product zp350 = new MP3Player(175,"ZP350","Logitech","Blue");
        Order ZP350 = new Order(zp350,0);
        Product sowwhite = new Cartoon(15,"SowWhite","Disney",1989,"SnowWhite");
        Order SowWhite = new Order(sowwhite,0);
        Product spiderman = new Cartoon(13,"Spiderman","Marvel",1967,"SpiderMan");
        Order Spiderman = new Order(spiderman,0);
        Product fairytail = new ChildrenBook(12,"Fairytail","WB",2001,3);
        Order Fairytail = new Order(fairytail,0);
        Product bedtimeStories = new ChildrenBook(10,"BedtimeStories","CreatveINC",2017,9);
        Order BedtimeStories = new Order(bedtimeStories,0);

        ShoppingCart myCart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        System.out.println(" Welcome to our Archive.Store");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=");
        System.out.println("");

        System.out.println("Available Products");
        System.out.println("1.SmartTv(Television)");
        System.out.println("2.PlasmaTv(Television)");
        System.out.println("3.XS700(MP3 players)");
        System.out.println("4.ZP350(MP3 players)");
        System.out.println("5.SowWhite(Cartoon Book)");
        System.out.println("6.Spiderman(Cartoon Book)");
        System.out.println("7.Fairytail(Childern Book)");
        System.out.println("8.BedtimeStories(Childern Book)");
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
                    System.out.println("1.SmartTv(Television)");
                    System.out.println("2.PlasmaTv(Television)");
                    System.out.println("3.XS700(MP3 players)");
                    System.out.println("4.ZP350(MP3 players)");
                    System.out.println("5.SowWhite(Cartoon Book)");
                    System.out.println("6.Spiderman(Cartoon Book)");
                    System.out.println("7.Fairytail(Childern Book)");
                    System.out.println("8.BedtimeStories(Childern Book)");
                    System.out.println("");
                    break;

                case 2 :
                    System.out.println("Enter the product ID");
                    int viewMenu = scanner.nextInt();
                    switch (viewMenu){   //product viewing

                        case 1 :
                            System.out.println(smartTv);
                            break;
                        case 2 :
                            System.out.println(plasmaTv);
                            break;
                        case 3 :
                            System.out.println(xs700);
                            break;
                        case 4 :
                            System.out.println(zp350);
                            break;
                        case 5:
                            System.out.println(sowwhite);
                            break;
                        case 6:
                            System.out.println(spiderman);
                            break;
                        case 7:
                            System.out.println(fairytail);
                            break;
                        case 8:
                            System.out.println(bedtimeStories);
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
                            myCart.addToCart(SmartTv,count);
                            break;
                        case 2 :
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(PlasmaTv,count);
                            break;
                        case 3 :
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(XS700,count);
                            break;
                        case 4 :
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(ZP350,count);
                            break;
                        case 5:
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(SowWhite,count);
                            break;
                        case 6:
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(Spiderman,count);
                            break;
                        case 7:
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(Fairytail,count);
                            break;
                        case 8:
                            System.out.print("Enter Quantity : ");
                            count = scanner.nextInt();
                            myCart.addToCart(BedtimeStories,count);
                            break;
                    }
                    break;

                case 4 :
                    System.out.println("Enter the product ID");
                    int removeMenu = scanner.nextInt();
                    switch (removeMenu) {  // the remove menu
                        case 1:
                            myCart.removeFromCart(SmartTv);
                            break;
                        case 2:
                            myCart.removeFromCart(PlasmaTv);
                            break;
                        case 3:
                            myCart.removeFromCart(XS700);
                            break;
                        case 4:
                            myCart.removeFromCart(ZP350);
                            break;
                        case 5:
                            myCart.removeFromCart(SowWhite);
                            break;
                        case 6:
                            myCart.removeFromCart(Spiderman);
                            break;
                        case 7:
                            myCart.removeFromCart(Fairytail);
                            break;
                        case 8:
                            myCart.removeFromCart(BedtimeStories);
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