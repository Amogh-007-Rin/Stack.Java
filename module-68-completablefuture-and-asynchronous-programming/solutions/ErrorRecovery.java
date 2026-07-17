import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class ErrorRecovery {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            if (ThreadLocalRandom.current().nextBoolean()) {
                throw new RuntimeException("Service unavailable");
            }
            return "42";
        }).whenComplete((result, ex) -> {
            if (ex != null) {
                System.out.println("Log: operation failed - " + ex.getMessage());
            } else {
                System.out.println("Log: operation succeeded - " + result);
            }
        }).exceptionally(ex -> {
            System.out.println("Recovering from: " + ex.getMessage());
            return "0";
        }).thenAccept(finalResult -> {
            System.out.println("Final result: " + finalResult);
        }).join();
    }
}
