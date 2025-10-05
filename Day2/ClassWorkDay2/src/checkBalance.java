import java.util.Scanner;

public class checkBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int bal = sc.nextInt();
        if (bal>=10000){
            System.out.println("You can withdraw amount");
        }else {
            System.out.println("insufficient balance");
        }
    }
}

