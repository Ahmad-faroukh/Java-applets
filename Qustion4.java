import java.util.Scanner;
public class Qustion4{
    public static void main (String[]args){
        int n , answer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of odd int you want to sum");
        n = sc.nextInt();
        for (int i = 0 ; i <n ; i++ ){
            answer=answer+(2*i +1);
        }
        System.out.println(answer);
    }
}