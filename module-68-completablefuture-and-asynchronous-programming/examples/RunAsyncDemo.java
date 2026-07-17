import java.util.concurrent.CompletableFuture;

public class RunAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Task running in: " + Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task completed");
        });

        future.thenRun(() -> System.out.println("thenRun: after completion"));

        future.thenAccept(v -> System.out.println("thenAccept: after completion"));

        try {
            future.get();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
