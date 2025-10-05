public class MultiCatch{
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException.");
        } catch (Exception e) {

            System.out.println("Caught a general exception.");
        }
    }
}