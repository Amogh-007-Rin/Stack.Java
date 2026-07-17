import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class TaskCollector {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Integer>> futures = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Callable<Integer> task = () -> {
                int value = random.nextInt(100);
                Thread.sleep(200);
                return value;
            };
            futures.add(executor.submit(task));
        }

        int sum = 0;
        int count = 0;
        for (Future<Integer> f : futures) {
            try {
                sum += f.get();
                count++;
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Error getting result: " + e.getMessage());
            }
        }

        double avg = count > 0 ? (double) sum / count : 0;
        System.out.println("Sum: " + sum + ", Count: " + count + ", Average: " + avg);

        executor.shutdown();
    }
}
