
class Counter {
    private int count = 0;

    public synchronized void incrementWithLock() {
        count++;
    }

    public void incrementWithoutLock() {
        count++;
    }

    public void incrementWithSyncBlock() {

        synchronized(this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class SyncThreadWithWithoutLock {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // race condition (without lock)
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.incrementWithoutLock();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.incrementWithoutLock();
        });

        t1.start();
        t2.start();
        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish
        System.out.println("Final count without lock: " + counter.getCount());


        // sync(with lock)
        Counter safeCounter = new Counter();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) safeCounter.incrementWithLock();
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) safeCounter.incrementWithSyncBlock();
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("Final count with synchronization : " + safeCounter.getCount());
    }
}
