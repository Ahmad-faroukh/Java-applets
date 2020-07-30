import java.util.Scanner;
public class Project6 {

    public static void main(String[] args) {
        int size;
        System.out.println("Enter Triangle size");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
            if (size <=50 && size >=1){
                for (int i = 0; i < size; i++) {
                for (int f = 0; f < i; f++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            for (int i = size - 1; i > 0; i--) {
                for (int f = 0; f < i - 1; f++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
        }else{
                System.out.println("Size must be less than 50");
            }
    }
}
