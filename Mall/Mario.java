package Archive.Mall;
import java.util.Scanner;
public class Mario {

    private static void addToCart(ShoppingCart cart, ProductOrder productOrder) {
        int input;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Quantity : ");
            input = scan.nextInt();
            if (input > 0) {
                cart.addToCart(productOrder, input);
                break;
            } else if (input == 0)
                break;
            else
                System.out.println("Wrong input!!");
        }
    }

    private static void removeFromCart(ShoppingCart cart, ProductOrder productOrder) {
        int input;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Quantity : ");
            input = scan.nextInt();
            if (input > 0) {
                cart.removeFromCart(productOrder, input);
                break;
            } else if (input == 0)
                break;
            else
                System.out.println("Wrong input!!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        boolean done = false;

        TV sharpTv = new TV(120, "Sharp TV", 15, "China", 64);
        TV samTv = new TV(160, "Samsung TV", 12, "Korea", 52);
        MP3 ipod = new MP3(25, "ipod", 55, "China", "Black");
        MP3 sonyMP3 = new MP3(19, "Sony MP3", 70, "China", "White");
        Cartoon spiderMan = new Cartoon(2.5, "Spider man", 120, "Marvel Comics"
                , 2014, "Peter Parker");
        Cartoon batman = new Cartoon(2, "Batman", 100, "DC Comics", 2012
                , "Bruce Wayne");
        ChildrenBook bedStories = new ChildrenBook(4, "Bed Stories", 70, "Disney"
                , 2010, 4);
        ChildrenBook fairyTales = new ChildrenBook(3.5, "Fairy Tales", 80, "Disney"
                , 2013, 7);

        ProductOrder sharpTvOrder = new ProductOrder(sharpTv);
        ProductOrder samTvOrder = new ProductOrder(samTv);
        ProductOrder ipodOrder = new ProductOrder(ipod);
        ProductOrder sonyMp3Order = new ProductOrder(sonyMP3);
        ProductOrder spidermanOrder = new ProductOrder(spiderMan);
        ProductOrder batmanOrder = new ProductOrder(batman);
        ProductOrder bedStoriesOrder = new ProductOrder(bedStories);
        ProductOrder fairyTalesOrder = new ProductOrder(fairyTales);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("=*=*=*=*=*=*=*=*=*=*=" + "\n Welcome to our Archive.Store" + "\n=*=*=*=*=*=*=*=*=*=*=\n");

        while (true) {
            System.out.println("1.Archive.Store.\n2.check your cart.\n3.Exit.\n");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    while (!done) {
                        System.out.println("\n" + sharpTv + "\n" + samTv + "\n" + ipod + "\n" + sonyMP3 + "\n" +
                                spiderMan + "\n" + batman + "\n" + bedStories + "\n" + fairyTales + "\n0.Back.\n");
                        input = scan.nextInt();
                        switch (input) {
                            case 1:
                                addToCart(cart, sharpTvOrder);
                                break;
                            case 2:
                                addToCart(cart, samTvOrder);
                                break;
                            case 3:
                                addToCart(cart, ipodOrder);
                                break;
                            case 4:
                                addToCart(cart, sonyMp3Order);
                                break;
                            case 5:
                                addToCart(cart, spidermanOrder);
                                break;
                            case 6:
                                addToCart(cart, batmanOrder);
                                break;
                            case 7:
                                addToCart(cart, bedStoriesOrder);
                                break;
                            case 8:
                                addToCart(cart, fairyTalesOrder);
                                break;
                            case 0:
                                done = true;
                                break;
                            default:
                                System.out.println("\nWrong input!!\n");
                        }
                    }
                    done = false;
                    break;
                case 2:
                    while (!done) {
                        System.out.println("1.Return.\n2.Check the bill.\n3.Check your cart.\n0.Back.\n");
                        input = scan.nextInt();
                        switch (input) {
                            case 1:
                                cart.display();
                                System.out.println("\b0.Back.");
                                while (!done) {
                                    System.out.println("Enter Product ID.\n");
                                    input = scan.nextInt();
                                    switch (input) {
                                        case 1:
                                            removeFromCart(cart, sharpTvOrder);
                                            break;
                                        case 2:
                                            removeFromCart(cart, samTvOrder);
                                            break;
                                        case 3:
                                            removeFromCart(cart, ipodOrder);
                                            break;
                                        case 4:
                                            removeFromCart(cart, sonyMp3Order);
                                            break;
                                        case 5:
                                            removeFromCart(cart, spidermanOrder);
                                            break;
                                        case 6:
                                            removeFromCart(cart, batmanOrder);
                                            break;
                                        case 7:
                                            removeFromCart(cart, bedStoriesOrder);
                                            break;
                                        case 8:
                                            removeFromCart(cart, fairyTalesOrder);
                                            break;
                                        case 0:
                                            done = true;
                                            break;
                                        default:
                                            System.out.println("Wrong input!!");
                                    }
                                }
                                done = false;
                                break;
                            case 2:
                                System.out.println("Total price = " + cart.getTotalPrice() + " $\n");
                                break;
                            case 3:
                                cart.display();
                                break;
                            case 0:
                                done = true;
                                break;
                            default:
                                System.out.println("Wrong input!!");
                        }
                    }
                    done = false;
                    break;
                case 3:
                    System.out.println("\nGood bye.");
                    System.exit(0);
                default:
                    System.out.println("\nWrong input!!");
            }
        }
    }
}