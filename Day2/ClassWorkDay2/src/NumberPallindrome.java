import java.util.Scanner;

public class NumberPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum*10+rem;
            num = num/10;
        }if (sum==n){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("The number is not a Palindrome");
        }
    }
}