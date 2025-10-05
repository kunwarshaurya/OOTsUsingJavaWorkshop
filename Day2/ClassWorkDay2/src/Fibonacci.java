import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(count<=n){
            int temp = b;
            b= b+a;
            a= temp;
            count++;
            System.out.print(b+" ");
        }

    }
}
