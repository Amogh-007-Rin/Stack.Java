import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombineDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // thenCombine
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combined = future1.thenCombine(future2,
            (a, b) -> a + " " + b);

        System.out.println("thenCombine: " + combined.get());

        // allOf
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "A");
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> "B");
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> "C");

        CompletableFuture<Void> allDone = CompletableFuture.allOf(f1, f2, f3);
        allDone.get();
        System.out.println("allOf: All futures completed");

        // anyOf
        CompletableFuture<String> fast = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            return "Fast";
        });
        CompletableFuture<String> slow = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            return "Slow";
        });

        CompletableFuture<Object> first = CompletableFuture.anyOf(fast, slow);
        System.out.println("anyOf: First result = " + first.get());
    }
}
