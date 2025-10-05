class reptile{
    String has = "Snake , crocodile, turtule";
}
class snake extends reptile{
    String sound = "Hiss";
    void display(){
        System.out.println(sound);
        System.out.println(super.has);
    }
}
public class animal {
    public static void main(String[] args) {
        snake s = new snake();
        s.display();
    }
}
