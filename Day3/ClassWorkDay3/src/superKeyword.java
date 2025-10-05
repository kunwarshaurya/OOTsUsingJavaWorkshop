//wap to illustrate super keyword
class parent{
    String name = "I am Parent Class";

}
class child extends parent{
    String name = "I am child class";
    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class superKeyword {
    public static void main(String[] args) {
        child c1  = new child();
        c1.display();
    }
}
