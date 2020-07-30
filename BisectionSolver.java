package Archive;

import java.util.Scanner;

public class BisectionSolver {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double middle;
    double precision;

    //to change the function change its value from the F method down below
    System.out.println("The function is :X^2 -3");
    System.out.print("Enter a Start of an interval : ");
    a = input.nextDouble();
    
    System.out.print("Enter the end of an interval : ");
    b = input.nextDouble();
    
    System.out.print("Enter precision of method: ");  
    precision = input.nextDouble();
    
    if(f(a) * f(b) > 0.0D) { 
      System.out.println("Function has the same signs at the ends of interval");
      return;
    }
    int counter = 0 ;
    while(Math.abs(a - b) > precision) {
      counter++;
      middle = (a + b) / 2.0D;
      System.out.println("X("+counter+"):" + middle);
      if(f(a) * f(middle) < 0.0D) {
        b = middle;
      } else {
        a = middle;
      }
    }
  }
  
  static double f(double x) {
    return x * x - 3;
  }
}