import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            executor.execute(() -> {
                String name = Thread.currentThread().getName();
                System.out.println("Task " + taskId + " on " + name);
            });
        }

        executor.shutdown();
    }
}
