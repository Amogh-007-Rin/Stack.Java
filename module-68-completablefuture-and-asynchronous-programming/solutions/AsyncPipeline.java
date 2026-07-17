import java.util.concurrent.CompletableFuture;

public class AsyncPipeline {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return 21;
        }).thenApply(n -> n * 2)
          .thenAccept(result -> System.out.println("Result: " + result))
          .join();
    }
}
