//only nested classes can be static ,a top-level class cannot be static.
class OuterClass {
    static int outerStaticField = 10;

    // Static class
    static class StaticNestedClass {
        void display() {
            System.out.println("Value from outer static field: " + outerStaticField);
        }
    }
}

public class StaticClassEx {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
