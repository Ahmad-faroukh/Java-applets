import java .util.Scanner;
public class Q3 {
    public static void main(String[]args){
        System.out.println("Enter the Check ammount");
        Scanner sc = new Scanner(System.in);
        int y ;
        int x = sc.nextInt();
        if (x<=10){
            System.out.println("The service charge is : 1$" );
            System.out.println("the check after charge is " + (x-1) );
        }else if (x >10 && x<=100){
            y = (x*10)/100 ;
            System.out.println("The service charge is : " + y + "$");
            System.out.println("the check after charge is "+ (x-y) );
        }else if (x >100 && x <=1000){
            y = 5+ (x*5)/100 ; 
            System.out.println("The service charge is :"+y + "$");
            System.out.println("the check after charge is " + (x-y) );
        }else if ( x >1000){
            y = 40+ (x*1)/100 ;
            System.out.println("The service charge is :"+ y + "$");
            System.out.println("the check after charge is " + (x-y));
        }
    }
}