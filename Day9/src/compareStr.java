import java.util.Scanner;

public class compareStr {
    public static void main(String[] args) {
        String a = "Shaurya";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String b = sc.next();
        System.out.println(a.equals(b));
    }
}
