import java.util.Scanner;
public class Qustion9{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String rword = "";
        String input = sc.nextLine();
        for(int x =input.length() ; 0<x ; x--){
            rword = rword+input.charAt(x-1);
        }
        System.out.println(rword);
    }
}