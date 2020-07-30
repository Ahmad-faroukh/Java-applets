
import java.util.Scanner;

public class EQ4 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean stop;
        String input;
        while (1 > 0) {
            System.out.println("Enter a Paragraph at least 50 characters");
            input = key.nextLine();
            stop = input.contains("THE END");
            if (input.length() < 50) {
                System.out.println("The Paragraph needs to be more than 50 characters");
            }
            if (stop) {
                break;
            }
        }
        System.out.println("Enter the word you want to find");
        String word = key.nextLine();
        int index = input.indexOf(word);
        int wordLength = word.length();
        int count = 0;
        while (index != -1) {
            count++;
            input = input.substring(index + wordLength);
            index = input.indexOf(word);
        }
        System.out.println("The word " +word+" Has appeard "+ count + " Times");

    }
}
