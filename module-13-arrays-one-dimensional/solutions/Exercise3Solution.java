public class Exercise3Solution {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 7, 1, 7, 9, 2};

        int count = 0;
        for (int n : numbers) {
            if (n == 7) count++;
        }

        System.out.println("7 appears " + count + " times");
    }
}
