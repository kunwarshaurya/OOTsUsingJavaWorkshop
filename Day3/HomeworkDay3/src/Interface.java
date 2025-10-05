interface Animal {
    void sound();
    void eat();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat bones");
    }
}
public class Interface {
    public static void main(String[] args) {
        //ref of interface;obj of class
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}
