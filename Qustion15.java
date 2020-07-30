import java.util.Scanner;
public class Qustion15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter positive values to compute the geometric mean for");
        System.out.println("Enter 0 after you have entered all values");
        int value = keyboard.nextInt(),
                count = 0,
                product = 1;
        while (value > 0) {
            product = product * value;
            count++;
            value = keyboard.nextInt();
        }
        double geometricMean = Math.pow(product, 1.0 / count);
        System.out.println("The geometric mean is: " + geometricMean);
    }
}
