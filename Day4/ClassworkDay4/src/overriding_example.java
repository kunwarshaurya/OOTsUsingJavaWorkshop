class Vehicle2{
    void run(){
        System.out.println("Vehicle is running");
    }
}
//inheritance
class car2 extends Vehicle2{
    //overriding
    void run(){
        System.out.println("Car is moving...");
    }
}
public class overriding_example {
    public static void main(String[] args) {
        car2 c = new car2();
        c.run();
        }
    }

