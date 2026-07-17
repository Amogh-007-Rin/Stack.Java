public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic try-catch-finally ===");

        int[] numbers = {10, 20, 30};
        int divisor = 0;

        try {
            int result = numbers[2] / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
