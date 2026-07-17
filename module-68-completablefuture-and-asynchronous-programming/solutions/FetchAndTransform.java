import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FetchAndTransform {
    public static void main(String[] args) {
        CompletableFuture<String> greeting = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Alice";
        }).thenApply(name -> "Hello, " + name + "!");

        try {
            System.out.println(greeting.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
