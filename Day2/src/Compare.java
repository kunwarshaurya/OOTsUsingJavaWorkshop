import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a =sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
//        if (b>a && b>c){
//            System.out.println(b+" is greatest");
//        } else if (a>b && a>c) {
//            System.out.println(a+" is greatest");
//
//        }else System.out.println(c+ " is greatest");
        int max =a;
        if (b>max){
            max=b;
        } if (c>max) {
            max=c;
        }
        System.out.println(max);
    }
}
