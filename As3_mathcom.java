package Archive;

import java.math.BigInteger;
import java.util.Scanner;

public class As3_mathcom {

    public static BigInteger findFactorial(int n) {
        BigInteger integer = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            integer = integer.multiply(BigInteger.valueOf(i));

        }
        return integer;
    }

    public static Double findProbability(int n,int r) {
        Double cnr = nCr(n,r).doubleValue();
        return 1/cnr;
    }

    public static BigInteger nPr(int n, int r) {
        return findFactorial(n).divide(findFactorial(n - r));
    }

    public static BigInteger nCr(int n, int r) {
        return (findFactorial(n).divide((findFactorial(n - r).multiply(findFactorial(r)))));
    }

    public static boolean test(int n, int r) {
        if (n > 0 && r < n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n, r;
        Scanner in = new Scanner(System.in);
        System.out.println("Chose the operation?\n1.R-permutations.\n2.R-combinations.\n3.Find Probability\n4.Exit.");
        int menu = in.nextInt();
        switch (menu) {
            case 1:
                System.out.println("To calculate nPr Enter 'n' and 'r' value");
                System.out.println("Enter n :");
                n = in.nextInt();
                System.out.println("Enter r :");
                r = in.nextInt();
                if (test(n, r)) {
                    BigInteger nPr = nPr(n, r);
                    System.out.println("P(" + n + ',' + r + ")= " + nPr);
                } else {
                    System.out.println("n must be  positive integer and r positive integer less than n!!");
                }

                break;
            case 2:
                System.out.println("To calculate nCr Enter 'n' and 'r' value");
                System.out.println("Enter n :");
                n = in.nextInt();
                System.out.println("Enter r :");
                r = in.nextInt();
                if (test(n, r)) {
                    BigInteger nCr = nCr(n, r);
                    System.out.println("C(" + n + ',' + r + ")= " + nCr);
                } else {
                    System.out.println("n must be  positive integer and r positive integer less than n!!");
                }

                break;
            case 3:
                System.out.println("To calculate Probability Enter 'n' and 'r' value");
                System.out.println("Enter n :");
                n = in.nextInt();
                System.out.println("Enter r :");
                r = in.nextInt();
                System.out.println(findProbability(n,r));;
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("invalid input!");

        }
    }
}