import java.util.Scanner;

public class Assertion_illus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int value = scanner.nextInt();


        assert (value >= 0 && value <= 10) : "The number is not within the valid range!";

        System.out.println("You entered: " + value);
        scanner.close();
    }
}
