public class FinallyBlockEx{
    public static void main(String[] args) {
        try {
            System.out.println("Inside the try block.");
            int result = 10 / 0; // exception
            System.out.println("This line will not be executed.");
        } catch (NullPointerException e) {
            //not execute for  ArithmeticException
            System.out.println("Caught NullPointerException.");
        } finally {
            //  always execute
            System.out.println("Inside the finally block. This always runs!");
        }
        System.out.println("Program continues...");
    }
}
