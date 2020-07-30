import java.util.Scanner; 
public class BMI {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Height centimeters  ");
        double Hieght = in.nextDouble();
        System.out.println("Enter The Weight in kilograms ");
        double weight  = in.nextDouble();
        Hieght = Hieght / 100;
        double BMI = weight / (Hieght*Hieght) ;
        double BMIR = Math.round(BMI*10)/10.0;
        System.out.println("Body Mass Index = " + BMIR);
    }
}