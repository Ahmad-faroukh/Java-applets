package Archive;

public class BaseConvertor {
    public static long convert(int number , int base){
        int q = number ;
        String answer = "" ;
        while (q > 0){
            int temp = q % base;
            q = q/base;
            String temp2 =  Integer.toString(temp);
            answer = temp2.concat(answer);
        }
        long result = Long.parseLong(answer);
        return result ;
    }

    public static void main(String[] args) {
        System.out.println(convert(280,8));
        System.out.println(convert(280,2));
    }
}