enum Month
{
January, February, March, April,
May, June, July, August,
September, October, November, December
}
public class Qustion12{
    public static void main(String[]args){
        for(Month m : Month.values()){
        System.out.println(m);
        }
    }
}