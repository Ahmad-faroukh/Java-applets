package HomeWork ;

import java.util.Scanner ;

public class IntCheck {
    
    private int MinAcceptedValue ;
    private int MaxAcceptedValue ;
    
    public IntCheck (int minV , int maxV){
        this.MinAcceptedValue = minV ;
        this.MaxAcceptedValue = maxV;
    }
    public int getValue(){
        int inputedValue;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter a value within the accepted range ");
            inputedValue = scanner.nextInt();
            if(inputedValue > MaxAcceptedValue || inputedValue < MinAcceptedValue){
                System.out.println("invaild input");
            }else{
                break;
            }
        }
        return inputedValue ;
    }
    
    public static void main(String[] args) {
        IntCheck MyInt = new IntCheck (1,100);
        MyInt.getValue();
    }
}