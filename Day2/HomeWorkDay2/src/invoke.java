public class invoke { // calling a function is known as invoking
    public static void main(String[] args) {
        greeting();
        morning();
        int a = 1;
        int b =2;
        add(a,b);
    }
    public static void greeting(){
        System.out.println("Welcome");
    }
    public static void morning(){
        System.out.println("Good Morning Pineapple!");
    }
    public static void add(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
}
