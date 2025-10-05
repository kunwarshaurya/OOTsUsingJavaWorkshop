import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        for (String i : myList) {
            System.out.println(i);
        }
    }
}