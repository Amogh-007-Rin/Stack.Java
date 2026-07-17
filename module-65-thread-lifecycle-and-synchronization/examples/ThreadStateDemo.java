public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("State after creation: " + t.getState()); // NEW

        t.start();
        System.out.println("State after start: " + t.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println("State during sleep: " + t.getState()); // TIMED_WAITING

        t.join();
        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}
