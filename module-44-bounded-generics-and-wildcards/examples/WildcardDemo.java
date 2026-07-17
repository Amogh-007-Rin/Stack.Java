import java.util.*;

public class WildcardDemo {
    public static void main(String[] args) {
        System.out.println("=== Wildcards ===");

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        List<String> stringList = List.of("a", "b", "c");

        // Unbounded wildcard works with any type
        printAll(intList);
        printAll(doubleList);
        printAll(stringList);

        // Upper bounded wildcard works with Number subclasses
        System.out.println("Sum of integers: " + sumList(intList));
        System.out.println("Sum of doubles: " + sumList(doubleList));
    }

    // Unbounded wildcard: accepts any List
    static void printAll(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // Upper bounded wildcard: accepts Number or subclasses
    static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
