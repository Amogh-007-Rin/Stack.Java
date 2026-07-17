import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombineTwoServices {
    public static void main(String[] args) {
        CompletableFuture<String> userData = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(600); } catch (InterruptedException e) {}
            return "User: Alice (alice@example.com)";
        });

        CompletableFuture<String> userOrders = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(400); } catch (InterruptedException e) {}
            return "Orders: [Widget x2, Gadget x1]";
        });

        CompletableFuture<String> summary = userData.thenCombine(userOrders,
            (data, orders) -> data + "\n" + orders);

        try {
            System.out.println(summary.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
