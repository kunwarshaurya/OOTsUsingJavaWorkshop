import java.util.function.Consumer;

public class LambdaAsMethodParameter {
    // method takes  parameter a functional interface
    public static void processString(String str, Consumer<String> processor) {
        processor.accept(str);
    }

    public static void main(String[] args) {
        String greeting = "Hello Lambda!";

        processString(greeting, (s) -> System.out.println("Printing: " + s));

        processString(greeting, (s) -> System.out.println("Length: " + s.length()));
    }
}
