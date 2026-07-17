import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task = () -> {
            System.out.println("Heartbeat at " + System.currentTimeMillis()
                + " on " + Thread.currentThread().getName());
        };

        scheduler.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scheduler.shutdown();
        System.out.println("Scheduler shut down");
    }
}
