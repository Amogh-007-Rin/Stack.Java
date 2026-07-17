import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d", "e"};
        System.out.println("Before: " + Arrays.toString(words));
        reverse(words);
        System.out.println("After: " + Arrays.toString(words));

        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("Before: " + Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("After: " + Arrays.toString(numbers));
    }

    static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
