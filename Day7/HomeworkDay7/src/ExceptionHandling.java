public class ExceptionHandling {
    // A method that checks age and throws an exception if invalid
    public static void validateAge(int age) {
        if (age < 18) {
            // Manually throw an ArithmeticException (or a custom one)
            throw new ArithmeticException("Person is not eligible to vote.");
        } else {
            System.out.println("Person is eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(13);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}