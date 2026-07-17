import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(42, 7, 99, 13, 55, 3, 88, 21));
        System.out.println("Before sort: " + numbers);

        Collections.sort(numbers);
        System.out.println("After sort: " + numbers);

        int idx = Collections.binarySearch(numbers, 55);
        System.out.println("Index of 55: " + idx);

        int missing = Collections.binarySearch(numbers, 100);
        System.out.println("Index of 100: " + missing + " (negative = insertion point)");
    }
}
