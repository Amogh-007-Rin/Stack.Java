public class DeadlockDemo {
    private static final Object LOCK_A = new Object();
    private static final Object LOCK_B = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK_A) {
                System.out.println("Thread 1: holding LOCK_A");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (LOCK_B) {
                    System.out.println("Thread 1: holding LOCK_A and LOCK_B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (LOCK_B) {
                System.out.println("Thread 2: holding LOCK_B");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (LOCK_A) {
                    System.out.println("Thread 2: holding LOCK_B and LOCK_A");
                }
            }
        });

        t1.start();
        t2.start();

        System.out.println("Deadlock: threads are blocked. Press Ctrl+C to exit.");
    }
}
