public class Exercise1Solution {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 89, 5, 67};

        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) max = n;
        }

        System.out.println("Maximum value: " + max);
    }
}
