public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "banana", "cherry"};

        System.out.println("Iterating over int array:");
        for (int n : numbers) {
            System.out.println("  " + n);
        }

        System.out.println("Iterating over String array:");
        for (String fruit : fruits) {
            System.out.println("  " + fruit);
        }

        // Summation with for-each
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
