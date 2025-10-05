// Java program that prints out the duplicate characters from the string with its count.
public class DuplicateCharCount {
    public static void main(String[] args) {
        String s1 = "Beautiful";
        System.out.println("The String is: " + s1);
        System.out.print("The Duplicate characters in a string:");
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    System.out.print(s1.charAt(j) + " ");
                    break;
                }
            }
        }
    }
}
