import java.util.Scanner;

public class binary_Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th entry: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Your array: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("Enter the taget value: ");
        int target = sc.nextInt();
        int res = binary(arr,target);
        if (res==-1){
            System.out.println("The target doesn't exist.");
        }else
            System.out.println("Target index is: "+res+"th");

    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;//answer
            }
        }
           return-1;
        }
    }


