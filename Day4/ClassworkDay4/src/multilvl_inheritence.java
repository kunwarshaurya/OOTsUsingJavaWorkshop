class Vehicle1{
    void start (){
        System.out.println("Vehicle is starting...");
    }
}
class Car1 extends Vehicle1{
    void drive(){
        System.out.println("Car is moving");
    }
}
class eV extends Vehicle1{
    void drive(){
        System.out.println("Car runs on battery.");
    }
}
//ek class electric car ki add kr do
public class multilvl_inheritence {
    public static void main(String[] args) {
//        Car1 mycar = new Car1();
//        mycar.start();
//        mycar.drive();
        eV mycar2 = new eV();
        mycar2.drive();
        mycar2.start();

    }
}
