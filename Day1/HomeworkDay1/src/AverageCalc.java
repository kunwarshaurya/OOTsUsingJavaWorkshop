import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Marks1: ");
        int marks1 = sc.nextInt();
        System.out.print("Marks2: ");
        int marks2 = sc.nextInt();
        System.out.print("Marks3: ");
        int marks3 = sc.nextInt();
        int total = marks1+marks2+marks3;
        float avg = total/3;
        System.out.println("Total marks are:"+total);
        System.out.print("Average is: "+avg);
    }
}
