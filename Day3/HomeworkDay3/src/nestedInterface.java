interface outerinterface{
    void outermethod();
    interface  interinterface{
        void innermethod();
    }
}
class nestedinterface implements outerinterface.interinterface{
    public void innermethod(){
        System.out.println("inner interface");
    }
}
public class nestedInterface {
    public static void main(String[] args) {
        outerinterface.interinterface obj1 = new nestedinterface();
        obj1.innermethod();
    }
}
