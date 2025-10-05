// Importing two classes with the same name 'List'
import java.util.*;

public class collison {
    public static void main(String[] args) {
        // The following line will cause a compilation error:
        // "error: reference to List is ambiguous"
        //List list;

        // To resolve this, you must use the fully qualified name
        java.util.List<String> stringList = new ArrayList<>();
        stringList.add("No collision here!");

        java.awt.List awtList = new java.awt.List();
        awtList.add("This one is fine too.");

        System.out.println(stringList.get(0));
        System.out.println(awtList.getItem(0));
    }
}
