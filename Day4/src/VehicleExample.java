class Vehicle{
    void start (){
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Car is moving");
    }
}
public class VehicleExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.start();
        mycar.drive();
    }
}
