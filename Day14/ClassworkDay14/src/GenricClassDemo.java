
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenricClassDemo {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Integer value: " + integerBox.getItem());


        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String value: " + stringBox.getItem());
    }
}
