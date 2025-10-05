class Extends extends Thread {
    int amount = 0;

    @Override
    public void run() {
        // increment amount by 1
        System.out.println("previous amnt "+amount);
        amount++;
        System.out.println("Amount after increment: " + amount);
    }

    public static void main(String[] args) {
        Extends t1 = new Extends();
        t1. start();  // start thread
        while (t1.isAlive()){
            System.out.println("Wwaiting....");
        }

        System.out.println("Main thread is running...");
    }
}
//class Test1 extends Thread {
//    public static int amount =0;
//    public static void main(String[] args) {
//        Test1 thread = new Test1();
//        thread.start();
//        while(thread.isAlive()) {
//            System.out.println("Waiting.....");
//        }
//        System.out.println("Main:"+amount);
//        amount++;
//        System.out.println("Main:"+amount);
//    }
//    public void run() {
//        amount++;
//    }
//}

//create a class name extends with one variable name as amount also
// increament amt by one initial amt = 0  we need to make this using thread