
import java.util.Scanner;

public class LetterFind {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = scan.nextLine().toLowerCase();
        System.out.println("Enter a letter");
        char c = scan.nextLine().charAt(0);
        int count = 0;
        int l = s1.length();
        for (int i = 0; i <= l - 1; i++) {
            if (s1.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("The Letter" + c + " has apperead " + count + " times");
    }
}
