public class Assertionexception {
    public static void main(String[] args) {
        int age = 15;//test value
        assert age>=18: "Age is less than 18,not eligible";
        System.out.println("Age is valid: "+age);
    }
}
