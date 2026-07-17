import java.util.concurrent.*;

public class SumCalculator {
    public static void main(String[] args) {
        int n = 100;
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        };

        Future<Integer> future = executor.submit(task);

        try {
            int result = future.get();
            System.out.println("Sum of 1 to " + n + " = " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}
