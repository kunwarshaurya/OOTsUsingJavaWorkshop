public class nCopiesOfFirstTwoChar {
    public static String nFirstTwo(String str) {
        int n = str.length();
        String firstTwo;

        if (n < 2) {
            firstTwo = str;
        } else {
            firstTwo = str.substring(0, 2);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwo);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "Wipped";
        System.out.println("Input: \"" + input1 + "\" -> Output: \"" + nFirstTwo(input1) + "\"");

        String input2 = "Hi";
        System.out.println("Input: \"" + input2 + "\" -> Output: \"" + nFirstTwo(input2) + "\"");

        String input3 = "X";
        System.out.println("Input: \"" + input3 + "\" -> Output: \"" + nFirstTwo(input3) + "\"");
    }
}
