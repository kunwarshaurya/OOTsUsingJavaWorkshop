import java.util.Scanner;

public class linear_Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr  =  new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+i+"th entry: ");
            arr [i] = sc.nextInt();
        }
        System.out.print("Your array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+ " ");
        }
        System.out.println("");
        System.out.println("Enter the taget value: ");
        int target = sc.nextInt();

        System.out.println("Position: "+linear(arr,target));

    }
    static int linear(int[] arr,int target){
       if (arr.length==0){
           return -1;
       }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element==target){
                return i+1;
            }
        }
        return -1;
    }
}
