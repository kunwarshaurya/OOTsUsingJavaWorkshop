interface MyFunctionalInterface {
    String sayHello();
}

public class LambdaNoParams {
    public static void main(String[] args) {
        MyFunctionalInterface msg = () -> "Hello, World!";

        System.out.println(msg.sayHello());
    }
}