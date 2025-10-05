public class EqualsVsEqualsOperator {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello"; // Refers to the same object in the String pool
        String s3 = new String("Hello"); //  heap memory me nya object

        System.out.println("Comparing s1 and s2 (from string pool):");
        System.out.println("s1 == s2: " + (s1 == s2)); // true,refer to the same object
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true, content is the same

        System.out.println("\nComparing s1 and s3 (pool vs. heap):");
        System.out.println("s1 == s3: " + (s1 == s3)); // false,refer to different objects
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true,their content is the same

        // '==' compares object references ;memory addresses.
        // '.equals()' compares the actual content of the strings.
    }
}
