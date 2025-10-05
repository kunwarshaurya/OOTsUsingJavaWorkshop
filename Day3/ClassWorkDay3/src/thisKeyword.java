
// WAP TO IMPLEMENT THIS KEYWORD
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name; // "this" refers to current object
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Student S1 = new Student("Xavier", 22);
        S1.display();
    }
}