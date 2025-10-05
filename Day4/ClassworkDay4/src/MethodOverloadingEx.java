class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloading
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingEx{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3 is: " + calc.add(2, 3));
        System.out.println("Sum of 2, 3, and 4 is: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5 is: " + calc.add(2.5, 3.5));
    }
}