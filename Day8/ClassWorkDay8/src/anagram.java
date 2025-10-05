import java.util.Scanner;

public class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");


        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }


        StringBuilder sb = new StringBuilder(str2);


        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = sb.indexOf(String.valueOf(ch));

            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                System.out.println("Not Anagram");
                return;
            }
        }


        if (sb.length() == 0) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}
