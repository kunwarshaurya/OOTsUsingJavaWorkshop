import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        map.put("Anamika", 25);
        map.put("Rohit", 30);
        map.put("Kunal", 35);

        System.out.println("HashMap: " + map);


        System.out.println("Rohit's age: " + map.get("Rohit"));


        map.remove("Anamika");
        System.out.println("After removing Anamika " + map);


        System.out.println("Iterating over map entries:");
        for (String name : map.keySet()) {
            System.out.println("Key: " + name + ", Value: " + map.get(name));
        }
    }
}
