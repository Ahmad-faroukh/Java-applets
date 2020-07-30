package Archive;
import java.util.Scanner;

public class GCD_Finder {

    public static int FindGCD(int a , int b){
        int GCD = 1 ;
        for (int i = 1 ; i <= a && i<= b ; i++) {
            if(a%i == 0 && b%i == 0){
                GCD = i;
            }
        }
        return GCD ;
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println(FindGCD(number1,number2));
    }
}