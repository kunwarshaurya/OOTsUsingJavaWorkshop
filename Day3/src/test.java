class outer{ //parent class
    static class inner{ // static class
        void show(){ // module
            System.out.println("Hello this is static class");
        }
    }
}
public class test {
    public static void main(String[] args) {
        outer.inner obj = new outer.inner(); //making obj of static class
        obj.show(); // calling show module
    }
}
