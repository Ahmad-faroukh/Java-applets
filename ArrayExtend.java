
import java.util.Scanner;
public class ArrayExtend {
    
public static int[] ArrayExtend(int[]array1 , int n){
    int [] array2 = new int [n];
    for (int i = 0; i < array1.length; i++) {
        array2[i]=array1[i];
    }
    return array2;
}
    public static void main(String[] args) {
        int [] array1 = {5,7,8,9,4};
        int [] array2 = ArrayExtend(array1,6);
        array2[5]=12;
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}