package Archive;
import java.util.Scanner;

public class MultipleChoice {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] key = { "D","B","D","C","C","D","A","E","A","D" };
        String[][] list = new String[8][10];
        System.out.println("Enter the students answers to the questions " );
        for (int i =0;i<list.length;i++) {
            int count =0;
            for (int j=0;j<list[i].length;j++) {
                System.out.print("Student "+i+" Answers :");
                list[i][j] = scanner.next();
                if(list[i][j].equalsIgnoreCase(key[j]))
                    count++;
            }
            System.out.println("Student's " + i + " correct answers are " + count);
        }
    }
}