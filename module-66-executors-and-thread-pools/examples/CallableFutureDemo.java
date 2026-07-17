import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Computing in " + name);
            Thread.sleep(500);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        try {
            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}
