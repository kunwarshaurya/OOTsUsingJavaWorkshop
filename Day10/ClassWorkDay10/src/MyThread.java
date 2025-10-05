public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This code is running in a thread");

    }
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // starts the thread

        System.out.println("Hello this is my first thread class");
        System.out.println("This code is outside of thread");
    }
}
