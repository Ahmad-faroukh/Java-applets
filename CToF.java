import java.util.Scanner; 
public class CToF {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit in a whole number");
        int DegreesF = in.nextInt();
        double x = DegreesF / 1.0 ; 
        double DegreesC = 5 *(x - 32) / 9 ; 
        double DegreesCR = Math.round(DegreesC*10)/10.0;
        System.out.println(DegreesF +" degrees Fahrenheit is "+DegreesCR+" degrees Celsius");
    }
}