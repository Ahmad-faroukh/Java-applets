package HomeWork;

public class motorBoat {

    private int fuelCap ;
    private int fuel ;
    private int maxSpeed ;
    private int speed ;
    private int motorEfficiency ;
    private int distanceTraveled ;
    private static int timeTraveled ;

    public motorBoat(int fuelCap , int maxSpeed ,int motorEfficiency){
        this.fuelCap = fuelCap;
        this.maxSpeed = maxSpeed ;
        this.motorEfficiency = motorEfficiency ;
    }

    public void speedUp(){
        if (speed < maxSpeed){
            speed +=10 ;
        }
    }

    public void driveFor(int time){ // operates the boat for an amount of time at the current speed
        fuel = fuel - motorEfficiency*(speed*speed)*time ;
        timeTraveled += time ;
    }

    public void reFuel(int ammount){
        fuel+=ammount;
        System.out.println("boat refueled with " + ammount + " fuel");
    }

    public void fuelCheck(){
        System.out.println("fuel ammount is : "+fuel);
    }

    public void distanceTraveled(){
        System.out.println("distanceTraveled : " +speed*timeTraveled + " KM");
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMotorEfficiency() {
        return motorEfficiency;
    }

    public static void main(String[] args) {
        motorBoat f200 = new motorBoat(2000, 200,2);
        f200.reFuel(2000);
        f200.speedUp();
        f200.speedUp();
        System.out.println("Boat Speed :"+f200.getSpeed() + "KM/H");
        f200.fuelCheck();
        f200.driveFor(2);
        f200.fuelCheck();
        f200.distanceTraveled();
        f200.reFuel(450);
        f200.fuelCheck();
    }
}