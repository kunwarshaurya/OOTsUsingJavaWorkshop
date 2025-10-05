public class MixStrings {
    public static String mix(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int minLength = Math.min(lenA, lenB);


        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }


        if (lenA > lenB) {
            result.append(a.substring(minLength));
        } else if (lenB > lenA) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println("Mixing \"" + a + "\" and \"" + b + "\" -> \"" + mix(a, b) + "\"");

        String c = "abc";
        String d = "12345";
        System.out.println("Mixing \"" + c + "\" and \"" + d + "\" -> \"" + mix(c, d) + "\"");
    }
}
