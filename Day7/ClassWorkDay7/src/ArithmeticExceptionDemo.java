public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 30;
            int b = 0;
            int c = a / b; // This line will throw an ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: Cannot divide by zero.");
        }
        System.out.println("Program continues after the exception.");
    }
}