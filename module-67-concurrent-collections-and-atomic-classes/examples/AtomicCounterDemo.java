import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterDemo {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementAndGet();
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Atomic counter: " + counter.get() + " (expected: 20000)");

        // compareAndSet example
        int current = counter.get();
        boolean swapped = counter.compareAndSet(current, 0);
        System.out.println("Reset to zero: " + swapped + ", value: " + counter.get());
    }
}
