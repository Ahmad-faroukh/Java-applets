package Archive.Cars;

public class Sedan extends Car {
    int length ;

    public double getSalePrice(){
        if(length > 20){
            regularPrice -= regularPrice*0.05;
        }else {
            regularPrice -= regularPrice*0.10;
        }
        return regularPrice ;
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
}
