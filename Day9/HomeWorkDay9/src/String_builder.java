public class String_builder{
    public static void main(String[] args) {
        // StringBuilder is mutable
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original: " + sb);

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Greetings");
        System.out.println("After replace: " + sb);

        sb.delete(10, 15);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
