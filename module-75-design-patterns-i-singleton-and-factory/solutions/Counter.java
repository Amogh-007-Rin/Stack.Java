public class Counter {

    private static volatile Counter instance;

    private int count;

    private Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            synchronized (Counter.class) {
                if (instance == null) {
                    instance = new Counter();
                }
            }
        }
        return instance;
    }

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = Counter.getInstance();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Final count: " + counter.getCount());
        System.out.println("Expected: 10000");
    }
}
