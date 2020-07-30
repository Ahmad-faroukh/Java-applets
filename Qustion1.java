import java.util.Scanner;
public class Qustion1{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(!input.toLowerCase().equals("done")){
            System.out.println("Please input a String");
            input=scan.nextLine();
            int x = input.length();
            int y = input.length()-x;
            if (input.charAt(x-1)==input.charAt(y)){
                System.out.println("the first char is equal to the last char");
            }else
                System.out.println("the first char is Not equal to the last char");
        }
    }
}