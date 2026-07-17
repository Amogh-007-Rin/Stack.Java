public class FactorialStackOverflow {

    public static long factorialRecursive(long n) {
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== Recursive (will overflow) ===");
        try {
            factorialRecursive(100000);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: Each recursive call pushes a new stack frame");
            System.out.println("The stack has limited size (configurable via -Xss)");
            System.out.println("Once the stack memory is exhausted, StackOverflowError is thrown");
        }

        System.out.println();
        System.out.println("=== Iterative (no overflow) ===");
        long result = factorialIterative(20);
        System.out.println("20! = " + result);
        System.out.println("Iteration uses a single stack frame, no overflow risk");
    }
}
