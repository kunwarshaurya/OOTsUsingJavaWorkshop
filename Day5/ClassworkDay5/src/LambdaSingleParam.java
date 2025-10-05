interface FuncInterface{
    void abstractfun(int x);
    default void normal(){
        System.out.println("Hello");
    }
}
public class LambdaSingleParam {
    public static void main(String[] args) {
        FuncInterface fboj = (int x) -> System.out.println(2 * x);
        fboj.abstractfun(5);
        fboj.normal();
    }
}

