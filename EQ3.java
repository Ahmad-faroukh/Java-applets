import java.util.Scanner;
public class EQ3 {
    public static void main (String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the aquarium population limit");
        int size = key.nextInt();
        for (int i =size; i >=0; i--) {
            System.out.println("There's room for "+i+" more fish");
        }
    }
}