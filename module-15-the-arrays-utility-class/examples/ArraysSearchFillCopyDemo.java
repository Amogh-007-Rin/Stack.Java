import java.util.Arrays;

public class ArraysSearchFillCopyDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Arrays.sort(numbers);

        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);

        int notFound = Arrays.binarySearch(numbers, 35);
        System.out.println("Index of 35: " + notFound);

        int[] copy = Arrays.copyOf(numbers, 7);
        System.out.println("Copy (padded): " + Arrays.toString(copy));

        int[] smaller = Arrays.copyOf(numbers, 3);
        System.out.println("Copy (truncated): " + Arrays.toString(smaller));

        int[] filled = new int[5];
        Arrays.fill(filled, 99);
        System.out.println("Filled array: " + Arrays.toString(filled));
    }
}
