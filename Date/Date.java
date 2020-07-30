package Archive.Date;

public class Date {
    private int year;
    private int month;
    private int day;
    static int dayOfMonth [] = {31, 29, 31,30,31,30,31,31,30,31,30,31};

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void displayDate(){
        System.out.printf("%02d / %02d / %0" + "2d",day,month,year);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        if(month<13 && month >0)
            this.month = month;
        if(day>0 && day<=dayOfMonth[month-1])
            this.day = day;
    }

}