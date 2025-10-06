import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();


        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        System.out.println("HashSet: " + set);


        System.out.println("Contains 'Banana'? " + set.contains("Banana"));


        set.remove("Apple");
        System.out.println("After removing 'Apple': " + set);


        System.out.println("Iterating over the set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
