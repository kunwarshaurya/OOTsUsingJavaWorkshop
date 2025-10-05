public class CountOfTwoNumbers {

    public boolean compareCountOf(int[] arr, int arg1, int arg2) {
        // Assumption: arr is never null
        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {
            if (num == arg1) {
                count1++;
            }
            if (num == arg2) {
                count2++;
            }
        }

        return count1 > count2;
    }

    public static void main(String[] args) {
        CountOfTwoNumbers counter = new CountOfTwoNumbers();
        int[] sampleArray = {1, 2, 3, 1, 1, 4, 5, 2, 1}; // arg1 (1) appears 4 times, arg2 (2) appears 2 times
        int num1 = 1;
        int num2 = 2;

        boolean result = counter.compareCountOf(sampleArray, num1, num2);
        System.out.println("Is the count of " + num1 + " greater than the count of " + num2 + "? " + result);
    }
}
//write a class CountOfTwoNumbers with a public method compareCounterOf that takes three parameters one is arr of type int[] and other two are agrs 1 nad agrs2 are of type int and returns true if count of arg1 is greater tyhan args2 in aarr.The return type of compareCountOf should be boolean.
//assumption: arr is never null , args1 and args2  may be same
