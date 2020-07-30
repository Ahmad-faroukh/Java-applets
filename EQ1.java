import java.util.Scanner;
public class EQ1{
    public static void main (String[]args){
        Scanner key = new Scanner(System.in);
        int input ;
        int max ; 
        int min ;
        int avg ;
        int total = 0;
        System.out.print("Enter a number ");
        input = key.nextInt();
        total+=input;
        min = max = input;
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter a number ");
            input = key.nextInt();
            total +=input;
            if(input >max){
                max = input;
            }
            if (input <min){
                min = input;
            }
        }
        avg = total /10;
        System.out.println("The biggest number is :"+max);
        System.out.println("The smallest number is :"+min);
        System.out.println("The average is :"+avg);
    }
}