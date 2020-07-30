import java.util.Scanner;
public class Qustion6{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int input = sc.nextInt();
        int x;
        int total = 0;
        for (int i =1 ; i <=input ;i++){
            x = i*i;
            total +=x;
            System.out.print(x+"+");
        }
        System.out.println("\b="+total);
    }
}