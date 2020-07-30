import java.util.Scanner; 
public class ST {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string of text with no punctuation");
        String L = in.nextLine();
        int FirstWord = L.indexOf(" ");
        char FirstChar = L.charAt(FirstWord +1);
        String NewWord = String.valueOf(FirstChar).toUpperCase();
        NewWord += L.substring (FirstWord+2); 
        NewWord = NewWord + " " ; 
        String FW = L.substring (0 , FirstWord);
        System.out.println(NewWord + FW);
    }
}