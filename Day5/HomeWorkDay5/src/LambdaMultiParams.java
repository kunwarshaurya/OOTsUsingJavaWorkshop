interface StringConcat {
    String concat(String a, String b);
}

public class LambdaMultiParams{
    public static void main(String[] args) {
        // Lambda expression with multiple parameters
        StringConcat sc = (str1, str2) -> str1 + str2;

        System.out.println("Result: " + sc.concat("Hello ", "World"));
    }
}