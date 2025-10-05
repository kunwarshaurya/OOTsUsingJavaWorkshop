//WAP java program to implement single inheritence
class Animal1{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dogs Barks");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.bark();
        d.eat();
    }
}
