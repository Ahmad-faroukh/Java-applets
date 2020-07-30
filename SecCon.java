import java.util.Scanner; 
public class SecCon {
    public static void main (String[]args){
        System.out.println("Enter a number of Seconds");
        Scanner in = new Scanner(System.in);
        int inputedSeconds , SecondsLeft , Hours , Minutes , RemaningSeconds ;
        inputedSeconds = in.nextInt();
        Hours = (inputedSeconds/3600);
        RemaningSeconds = (inputedSeconds - (Hours*3600)); 
        Minutes =(RemaningSeconds/60);  
        SecondsLeft = RemaningSeconds - Minutes * 60   ; 
        System.out.println("Inputed Seconds : " + inputedSeconds);
        System.out.println("Output " + Hours + ":" + Minutes + ":" + SecondsLeft );
    }
}