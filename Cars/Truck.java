package Archive.Cars;

public class Truck extends Car{
    private int weight ;

    public double getSalePrice(){
        if(weight > 2000){
            regularPrice -= regularPrice*0.10;
        }else {
            regularPrice -= regularPrice*0.20;
        }
        return regularPrice ;
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
}