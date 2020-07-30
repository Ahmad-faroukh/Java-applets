package Archive;

public class DataStructureAS1 {


    //O(n)
    //time complexity --> 3n+4
    public static int arraySum(int array[]) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }


    //O(n!)
    //time complexity --> 2n*(2n+1)+1 +1 = 4n2+2n+22
    public static void arrayFact(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= array[i]; j++) {
                factorial = factorial * j;
            }
            System.out.println(factorial);
        }
    }


    //O(n2)
    //time complexity -->(n*((n*1)+1)+1)+1 = n2+n+2
    public static void SquarePrint(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int array[] = {5, 1, 2, 3};
        System.out.println(arraySum(array));
        SquarePrint(4);

        arrayFact(array);
    }
}