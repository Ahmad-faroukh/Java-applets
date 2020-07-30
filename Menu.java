
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choise number");
        System.out.println("Main Menu");
        System.out.println("1.Start");
        System.out.println("2.Settings");
        System.out.println("3.Exit");
        int input = sc.nextInt();
        String y;
        switch (input) {
            case 1:
                System.out.println("You Choose Start");
                break;
            case 2:
                System.out.println("You Choose Settings");
                break;
            case 3: {
                System.out.println("are you sure Enter Y for yes and N for no");
                y = sc.next();
                switch (y) {
                    case "Y":
                    case "y":
                        System.exit(0);
                        break;
                    case "N":
                    case "n":
                        System.out.println("You choose no ");
                        break;
                    default:
                        System.out.println("Wrong choise");
                }
            }
            break;
            default:
                System.out.println("You choise worong ");
        }
    }
}
