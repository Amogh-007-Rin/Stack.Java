public class GenericMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== Generic Methods ===");

        String[] words = {"apple", "banana", "cherry"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        Double[] decimals = {1.1, 2.2, 3.3};

        printArray(words);
        printArray(numbers);
        printArray(decimals);

        String maxStr = findMax("cat", "dog", "bird");
        System.out.println("Max string: " + maxStr);

        Integer maxInt = findMax(10, 25, 7);
        System.out.println("Max int: " + maxInt);
    }

    static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @SafeVarargs
    static <T extends Comparable<T>> T findMax(T... items) {
        T max = items[0];
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
