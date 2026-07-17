import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 7, 5, 3, 8, 1, 9, 4);

        // filter — keep even numbers
        System.out.print("Even: ");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // map — square each number
        System.out.print("Squared: ");
        numbers.stream()
               .map(n -> n * n)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // distinct — remove duplicates
        System.out.print("Distinct: ");
        numbers.stream()
               .distinct()
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // sorted — natural order
        System.out.print("Sorted: ");
        numbers.stream()
               .sorted()
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // limit — first 4
        System.out.print("First 4: ");
        numbers.stream()
               .limit(4)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // skip — skip first 5
        System.out.print("Skip 5: ");
        numbers.stream()
               .skip(5)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Chained: distinct, filter, sorted, limit
        System.out.print("Chained: ");
        numbers.stream()
               .distinct()
               .filter(n -> n > 3)
               .sorted()
               .limit(3)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
