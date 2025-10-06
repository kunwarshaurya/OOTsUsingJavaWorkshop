import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("Initial ArrayList: " + list);


        String secondElement = list.get(1);
        System.out.println("Element at index 1: " + secondElement);


        list.remove(0);
        System.out.println("After removing element at index 0: " + list);
    }
}
