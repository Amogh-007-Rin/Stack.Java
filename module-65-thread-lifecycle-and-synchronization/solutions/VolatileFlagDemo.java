public class VolatileFlagDemo {
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            long count = 0;
            while (running) {
                count++;
            }
            System.out.println("Worker stopped after " + count + " iterations");
        }, "Worker");

        worker.start();

        Thread.sleep(1000);
        running = false; // Without volatile, worker might never see this change
        System.out.println("Main: set running = false");

        worker.join();
        System.out.println("Main: worker has stopped");
    }
}
