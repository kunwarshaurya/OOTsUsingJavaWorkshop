public class StringHandling {
    public static void main(String[] args) {
        String input = "Hello World, This Is JAVA";
        StringBuilder capitals = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitals.append(c);
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("Capital letters: " + capitals.toString());
    }
}
