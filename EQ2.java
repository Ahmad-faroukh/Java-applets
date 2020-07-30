import java.util.Scanner;
public class EQ2 {
    public static void main (String []args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a password to vailidate");
        System.out.println("Password must have :");
        System.out.println("At least 1 letter between [a-z] and 1 letter between [A-Z].");
        System.out.println("At least 1 number between [0-9].");
        System.out.println("At least 1 character from [$#@].");
        System.out.println("Minimum length of 6 characters and Maximum of 16.");
        String password = key.nextLine();
        System.out.println("");
        int flag = 0 ;
        if (password.length()<=6){
            System.out.println("Password is too short (must have more than 6 characters )");
        }else if (password.length()>=16){
            System.out.println("Password is too long (must have less than 16 characters )");
        }else{
            flag++;
        }
        boolean charCheck = password.matches(".*[a-z].*");
        boolean charCheckCaps = password.matches(".*[A-Z].*");
        if(charCheck){
            flag++;
        }else {
            System.out.println("Password must have at least 1 letter between [a-z]");
        }
        if (charCheckCaps){
            flag++;
        }else{
            System.out.println("Password must have at least 1 letter between [A-Z]");
        }
        boolean numCheck = password.matches(".*[0-9].*");
        if(numCheck){
            flag++;
        }else{
            System.out.println("Password must have at least 1 number between [0-9]");
        }
        boolean signCheck = password.matches(".*[$,#,@].*");
        if (signCheck){
            flag++;
        }else{
            System.out.println("Password must have at least 1 character from [$#@]");
        }
        if(flag==5){
            System.out.println("Password is valid");
        }
    }
}