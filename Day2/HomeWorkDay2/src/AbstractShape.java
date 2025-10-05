// Abstract class Shape
abstract class Shape {
    public abstract void numberOfSides();
}

// Concrete class Trapezoid
class Trapezoid extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A trapezoid has 4 sides.");
    }
}

// Concrete class Triangle
class Triangle extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

// Concrete class Hexagon
class Hexagon extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

// Main class to test
public class AbstractShape {
    public static void main(String[] args) {
        // We cannot create an object of the abstract class Shape directly.
        // Shape s = new Shape(); // This would cause a compile error.

        // Create instances of each subclass
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        // Call the methods
        trapezoid.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}