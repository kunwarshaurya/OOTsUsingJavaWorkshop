import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {20, 12, 10, 15, 2};
        System.out.println("Unsorted Array: " + Arrays.toString(data));
        sort(data);
        System.out.println("Sorted Array : " + Arrays.toString(data));
    }
}
