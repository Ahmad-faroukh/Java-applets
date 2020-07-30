
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the media size");
        double blocks = scanner.nextInt();
        while (1 > 0) {
            System.out.println("----------------------");
            System.out.println("Enter the file size you want to enter in bytes");
            int fileUc = scanner.nextInt();
            double fileC = fileUc * 80 / 100;
            double blocksused = fileC / 512;
            long blocksUsed = Math.round(blocksused);
            if (blocksUsed > blocks) {
                System.out.println("----------------------");
                System.out.println("File size is too large to be stored");
                System.out.println("Do you want to add other files Y/N");
                System.out.println("----------------------");
                String choise = scanner.next().toUpperCase();
                if ("Y".equals(choise)) {
                    blocksUsed = 0;
                } else {
                    break;
                }
            }
            blocks = blocks - blocksUsed;
            System.out.println("----------------------");
            System.out.println("Your file used " + blocksUsed + " and you have " + blocks + " left");
            if (blocks <= 0) {
                System.out.println("You have no spcae left to store files");
                break;
            }
        }
    }
        ////////////////////////////////////////////
        ///                                      ///
        ///                                      ///
        ///            MADE BY AHMAD             ///
        ///                                      ///
        ///                                      ///
        ////////////////////////////////////////////
}
