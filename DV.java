import java.util.Scanner; 
public class DV {//DV = date validator
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int LeapYear = 0;
        int errors = 0 ;
        System.out.println("Enter the date in the format mm/dd/yyyy ");
        String input = in.nextLine();
        if(input.length()== 10){
        String Months = input.substring(0,2);
        int months = Integer.parseInt(Months);
        String Days = input.substring(3,5);
        int days = Integer.parseInt(Days);
        String Year = input.substring(6,10);
        int year = Integer.parseInt(Year);
        if (year >=1 ) {
        }else{ System.out.println("invalid year");
        errors++;
        }
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            LeapYear = 1;}
        if (months >=1 && months <=12){
        }else{ System.out.println("invalid month");
        errors++;
        }
        if ((days >31) || (months == 4 ||  months == 6 || months == 9 ||  months == 11 ) && (days >= 31) || (days < 1) ){
            System.out.println("Invalid day");
            errors++;
        }
        if ((LeapYear == 0) && (months == 2 ) && (!(days > 1 && days <=28)) ){
            System.out.println("invalid day");
            errors++;
        }
        if ((LeapYear == 1) &&(months == 2 ) && (!(days > 1 && days <=29))){
        System.out.println("invalid day");
        errors++;
        }
        if (errors == 0)
            System.out.println("Inputed date is valid");
        }else System.out.println("Archive.Date must be 10 charchetrs");
    }
}