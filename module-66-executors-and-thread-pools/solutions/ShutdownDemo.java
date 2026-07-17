import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutdownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== shutdown() demo ===");
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            int id = i;
            executor.execute(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("Task " + id + " completed");
                } catch (InterruptedException e) {
                    System.out.println("Task " + id + " interrupted");
                }
            });
        }

        executor.shutdown();
        System.out.println("shutdown() called - tasks continue running");
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Executor terminated: " + executor.isTerminated());

        System.out.println("\n=== shutdownNow() demo ===");
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            int id = i;
            executor2.execute(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("Task " + id + " completed");
                } catch (InterruptedException e) {
                    System.out.println("Task " + id + " interrupted");
                }
            });
        }

        List<Runnable> pending = executor2.shutdownNow();
        System.out.println("shutdownNow() called - " + pending.size() + " tasks never started");
        executor2.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("Executor terminated: " + executor2.isTerminated());
    }
}
