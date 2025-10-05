import java.util.ArrayList;
import java.util.List;

public class LambdaList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");


        System.out.println("Printing list elements:");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
