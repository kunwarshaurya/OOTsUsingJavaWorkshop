import java.util.Scanner;

public class Name_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter name: ");
        String a = sc.nextLine();
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        System.out.println("Name: "+a);
        System.out.println("Number: "+n);
    }
}
