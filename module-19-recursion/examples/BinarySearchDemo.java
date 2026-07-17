import java.util.Arrays;

public class BinarySearchDemo {

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return mid;
        if (target < arr[mid]) return binarySearch(arr, target, low, mid - 1);
        return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        Arrays.sort(numbers);

        int target = 23;
        int index = binarySearch(numbers, target, 0, numbers.length - 1);

        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found");
        }

        int missing = 99;
        int notFound = binarySearch(numbers, missing, 0, numbers.length - 1);
        System.out.println("Search for " + missing + ": " + notFound);
    }
}
