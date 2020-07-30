import java.util.Scanner;
public class Assignemt5{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        boolean overlap = false;
        System.out.println("Enter String number 1");
        String S1 = scan.nextLine();
        System.out.println("Enter String number 2");
        String S2 = scan.nextLine();
        String s1 = S1.toLowerCase();
        String s2 = S2.toLowerCase();
        int x = s1.length();
        int y = s2.length();
        for (int i = s1.length();i>0; i--){
            if ((s1.charAt(x-1))==(s2.charAt(y-1))){
                overlap = true;
            }else {
                overlap = false;
            }
            y--;
        }
        if(overlap){
            System.out.println("String 1 overlaps String 2");
        }else
            System.out.println("String 1 does not over lap String 2");
    }
}