import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class WaitForAll {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        CompletableFuture<Integer>[] futures = new CompletableFuture[5];

        for (int i = 0; i < 5; i++) {
            futures[i] = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(200, 800));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return ThreadLocalRandom.current().nextInt(1, 100);
            });
        }

        CompletableFuture<Void> allDone = CompletableFuture.allOf(futures);

        allDone.thenRun(() -> {
            int sum = 0;
            for (CompletableFuture<Integer> f : futures) {
                sum += f.join();
            }
            double avg = sum / 5.0;
            System.out.println("All tasks completed");
            System.out.println("Sum: " + sum + ", Average: " + avg);
        }).join();
    }
}
