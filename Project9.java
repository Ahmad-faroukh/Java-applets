
import java.util.Scanner;

public class Project9 {
    public static void main(String[] args) {
        int chocBar = 0, couponTrade = 6, coupon = 0;
        System.out.println("Enter the how much money you put in the machine");
        Scanner scan = new Scanner(System.in);
            int money = scan.nextInt();
                coupon += money;
                int extraBar = coupon / couponTrade;
                chocBar = money + extraBar;
                int couponLeft = chocBar % couponTrade;
                System.out.println("For $" + money + ", you can get " + chocBar + " chocolate bar(s),"
                        + "\nwith " + couponLeft + " coupon(s) left.");
    }
}
