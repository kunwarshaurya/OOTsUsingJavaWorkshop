public class String_Buffer {
    public static void main(String[] args) {
        // StringBuffer is mutable
        StringBuffer sbf = new StringBuffer("Test");

        System.out.println("Original: " + sbf);

        sbf.append("ing");
        System.out.println("After append: " + sbf);

        sbf.reverse();
        System.out.println("After reverse: " + sbf);
    }
}
