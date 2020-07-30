package Archive;

import java.util.Scanner;

public class FixedPointCalculator {

   public static double g(double x) {
        return Math.pow(3 * x * x + 3, .25);
    }

    public static double f(double x) {//x^4-3*x^2-3
        return x * x * x * x - 3 * x * x - 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p, p0, Tolerance;
        int i = 1;
        int maxIteration;

        System.out.println("Enter approximate 'p 0': ");
        p0 = scanner.nextDouble();

        System.out.println("Desired Tolerance: ");
        Tolerance = scanner.nextDouble();

        System.out.println("Maximum Iterations: ");
        maxIteration = scanner.nextInt();
        System.out.println("p #");
        while (i <= maxIteration) {
            p = g(p0);

            if (Math.abs(p - p0) < Tolerance) {
                break;
            }

            System.out.printf("p %d: %f\n", i, p);

            i++;
            p0 = p;
            if (i > maxIteration) {
                System.out.printf("Method failed after %d iterations\n", maxIteration);
            }

        }

    }

}