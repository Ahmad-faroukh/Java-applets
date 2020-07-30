package Archive.Cars;

public class Car {
    private int speed ;
    double regularPrice;
    private String color ;

    public double getSalePrice(){
        return 0 ;
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
}