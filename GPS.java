package Archive;

import java.util.Scanner;

public class GPS
{
    public static double calculateDistance(double x1, double x2, double y1, double y2)
    {
        return Math.sqrt( Math.pow(y1 - x1, 2) + Math.pow(y2 - x2, 2) );
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number of points: ");
        int numbers = scanner.nextInt();
        System.out.println("Enter the points: ");
        double[][] Grid = new double[numbers][2];
        double n1=0,n2=0,n3=0,n4=0;
        Grid[0][0] = scanner.nextDouble();
        Grid[0][1]= scanner.nextDouble();

        Grid[1][0] = scanner.nextDouble();
        Grid[1][1]= scanner.nextDouble();

        double min = calculateDistance(Grid[0][0],Grid[0][1],Grid[1][0],Grid[1][1]);
        for (int i = 2;i<Grid.length;i++) {
            Grid[i][0] = scanner.nextDouble();
            Grid[i][1] = scanner.nextDouble();
        }


        for (int j=0;j<Grid.length;j++)
        {
            for(int k=j+1; k<Grid.length;k++)
            {
                if (calculateDistance(Grid[j][0],Grid[j][1],Grid[k][0],Grid[k][1]) < min)
                {
                    min = calculateDistance(Grid[j][0],Grid[j][1],Grid[k][0],Grid[k][1]);
                    n1 = Grid[j][0];
                    n2 = Grid[j][1];
                    n3 = Grid[k][0];
                    n4 = Grid[k][1];
                }
            }
        }
        System.out.println("The closest two points are " + "("+n1+" ," + n2+")" +"("+n3+" ," + n4+ ")") ;
    }
}