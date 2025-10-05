class Student {
    // Static field (shared by all instances of the class)
    static String college = "My University";

    // Instance fields
    int studentId;
    String name;

    Student(int id, String n) {
        studentId = id;
        name = n;
    }

    void display() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", College: " + college);
    }
}

public class StaticField_Illus {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        s1.display();
        s2.display();
    }
}
