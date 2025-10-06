import java.util.HashSet;

public class hashSetDEmo {
    public static HashSet<Integer> createIntegerSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> numberSet = createIntegerSet();
        System.out.println("HashSet with numbers 1-10: " + numberSet);
    }
}
