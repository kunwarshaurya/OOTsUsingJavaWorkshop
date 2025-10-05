import java.util.Scanner;
class Shape {
    double area(double side) {
        return side * side;
    }
    double area(double length, double breadth) {
        return length * breadth;
    }
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sides of Square");
        double s = sc.nextDouble();
        System.out.println("Enter Length  of Reactangle");
        double len = sc.nextDouble();
        System.out.println("Enter Breadth of Rectangle");
        double br = sc.nextDouble();
        System.out.println("Enter height of Triangle");
        double h = sc.nextDouble();
        System.out.println("Enter Base of Triangle");
        double bs = sc.nextDouble();
        Shape shape = new Shape();
        System.out.println("Area of Square: " + shape.area(s));
        System.out.println("Area of Rectangle: " + shape.area(len,br));
        System.out.println("Area of Triangle: " + shape.area(bs,h, true));
    }
}
