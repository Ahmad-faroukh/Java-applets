import java.util.Scanner;
public class e3{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String input = "";
        int x =0;
        while(!input.toLowerCase().equals("the end")){
            System.out.println("Please input a String");
            input=scan.nextLine().toLowerCase();
            if(input.equals("java")){
                x++;
            }
        }
        System.out.println("Java appeared "+x+" times");
    }
}