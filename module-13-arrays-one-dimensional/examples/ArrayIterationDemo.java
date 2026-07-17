public class ArrayIterationDemo {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        System.out.println("Traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  index " + i + ": " + numbers[i]);
        }

        System.out.println("Enhanced for loop:");
        for (int n : numbers) {
            System.out.println("  " + n);
        }

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum: " + sum);

        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
