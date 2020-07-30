import java.util.Scanner;
public class e4 {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter how many students in your classroom");
        int std = keyboard.nextInt();
        int i = 0;
        double mark;
        double total=0;
        while(i<std){
            System.out.println("Enter the Grade");
            mark = keyboard.nextDouble();
            total+=mark;
            i++;
        }
        double avg = total/std;
        System.out.println("the avarage is "+avg);
    }
}
