import java.util.Arrays;

public class ArraysToStringSortDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 4, 2};

        System.out.println("Before sort: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sort:  " + Arrays.toString(numbers));

        String[] fruits = {"banana", "apple", "cherry", "date"};
        Arrays.sort(fruits);
        System.out.println("Sorted fruits: " + Arrays.toString(fruits));
    }
}
