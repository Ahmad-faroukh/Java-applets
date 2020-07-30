import java.util.Scanner;
public class Change {
	public static void main(String str[]){
		int a;
		int x;
		int y;
		int z;
		int b;
		int g;
		int c;
		int e;
		Scanner in = new Scanner(System.in);
		System.out.println("Choose a number");
		a = in.nextInt();
		x = a / 10;
		System.out.println("Ten's :"); System.out.println(x);
		y = a % 10;
		z = y / 5;
		System.out.println("Five's :"); System.out.println(z);
		g = y % 5;
		b = g / 2;
		System.out.println("Two's :"); System.out.println(b);
		c = g % 2;
		e = c / 1;
		System.out.println("One's :"); System.out.println(e);
		
	}


}	