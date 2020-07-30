import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double x ;
        double y ; 
        String op;
        double t ; 
        System.out.println("Enter Number 1");
        x = sc.nextDouble();
        System.out.println("Enter Number 2");
        y = sc.nextDouble();
        System.out.println("Choose the opreator (+,-,*,/)");
        op = sc.next();
        switch (op){
            case "/":
                t = x/y;
                System.out.println(t);
            break;
            case "*":
                t = x*y;
                System.out.println(t);
            break;
            case "-":
                t = x-y;
                System.out.println(t);
            break;
            case "+":
                t=x+y;
                System.out.println(t);
            break; 
            default:System.out.println("wrong choise");
        }
    }
}
