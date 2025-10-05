import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        long fact = 1;
        if(num==0 || num==1){
            System.out.println("Factorial: 1");
        }
        else {
            while(num>0){
                fact = fact*num;
                num--;
            }
            System.out.println("Factorial: "+fact);
        }

    }
}
