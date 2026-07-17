import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // exceptionally - recover from error
        CompletableFuture<String> risky = CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Something went wrong");
            }
            return "Success";
        });

        CompletableFuture<String> recovered = risky.exceptionally(ex -> {
            System.out.println("Caught: " + ex.getMessage());
            return "Recovered value";
        });

        try {
            System.out.println("exceptionally result: " + recovered.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // handle - handle both success and failure
        CompletableFuture<String> handled = CompletableFuture.supplyAsync(() -> {
            return "OK";
        }).handle((result, ex) -> {
            if (ex != null) {
                return "Fallback: " + ex.getMessage();
            }
            return "Processed: " + result;
        });

        try {
            System.out.println("handle result: " + handled.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // whenComplete - side effect on completion
        CompletableFuture.supplyAsync(() -> {
            return "Data";
        }).whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("whenComplete: succeeded with " + result);
            } else {
                System.out.println("whenComplete: failed with " + ex.getMessage());
            }
        }).join();
    }
}
