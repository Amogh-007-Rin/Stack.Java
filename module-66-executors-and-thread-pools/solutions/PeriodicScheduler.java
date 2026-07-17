import java.util.concurrent.*;

public class PeriodicScheduler {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("It's time! - " + System.currentTimeMillis());

        scheduler.scheduleAtFixedRate(task, 1, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scheduler.shutdown();
        System.out.println("Scheduler shut down");
    }
}
