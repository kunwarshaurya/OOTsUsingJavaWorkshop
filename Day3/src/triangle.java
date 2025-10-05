class shape{
    static class trishape{
        void showsides(){
            System.out.println("Three sides");
        }

    }
}
public class triangle {
    public static void main(String[] args) {
        shape.trishape obj = new shape.trishape();
        obj.showsides();
    }
}
