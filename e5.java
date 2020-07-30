import java.util.Scanner;
public class e5 {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("how many finger does the normal human have ");
        System.out.println("A.7\nB.9\nC.5");
        String input;
        String again = "";
        do{
            System.out.println("Enter your choise");
            input = keyboard.nextLine().toLowerCase();
            if("c".equals(input)){
                System.out.println("Correct answer");
                break;
            }else if ("toUpper".equals(input)|| "a".equals(input)){
                System.out.println("incorrect\nAgain? press y to continue and n to exit");
                again = keyboard.nextLine().toLowerCase();
                if (again=="n"){
                    break;
                }
            }
        }while("y".equals(again));
    }
}
