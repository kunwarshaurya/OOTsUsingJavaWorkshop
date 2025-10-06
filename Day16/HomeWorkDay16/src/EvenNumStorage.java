import java.util.ArrayList;

public class EvenNumStorage {
    public ArrayList<Integer> storeEvenNumbers(int N) {
        ArrayList<Integer> A1 = new ArrayList<>();
        for (int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        return A1;
    }

    public static void main(String[] args) {
        EvenNumStorage ens = new EvenNumStorage();
        ArrayList<Integer> evenNumbers = ens.storeEvenNumbers(30);
        System.out.println("Even numbers from 2 to 30: " + evenNumbers);
    }
}
