public class Exercise2Solution {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Reversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
