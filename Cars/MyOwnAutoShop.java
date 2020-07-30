package Archive.Cars;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan BmwM3 = new Sedan(220,17000,"White",26);
        System.out.println(BmwM3.getSalePrice());
        Ford MustangGT = new Ford(260,15000,"Black",2016,1200);
        System.out.println(MustangGT.getSalePrice());
        Car car = new Car(180,13000,"Gray");
        System.out.println(car.getSalePrice());
    }
}