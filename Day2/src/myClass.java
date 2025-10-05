//java prgm to illustrate the static field in the class
class static_field {
    static String college = "NIET is an Autonomus Institute";
    int id;
    String name;

    static_field(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
 public class myClass{
     public static void main(String[] args) {
         static_field c1 = new static_field(1,"Shaurya");
         static_field c2 = new static_field(2,"Kunal");
         c1.display();
         c2.display();
         static_field.college = "Accurate College";
         c1.display();
         c2.display();
     }

 }
