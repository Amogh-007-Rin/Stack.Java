import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReduceAndMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 5, 1, 8);

        // reduce — sum
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // reduce — product
        Optional<Integer> product = numbers.stream()
            .reduce((a, b) -> a * b);
        product.ifPresent(p -> System.out.println("Product: " + p));

        // reduce — concatenate as strings
        String concatenated = numbers.stream()
            .map(String::valueOf)
            .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated: " + concatenated);

        // min / max
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        min.ifPresent(m -> System.out.println("Min: " + m));
        max.ifPresent(m -> System.out.println("Max: " + m));

        // anyMatch, allMatch, noneMatch
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Has even: " + hasEven);
        System.out.println("All positive: " + allPositive);
        System.out.println("None negative: " + noneNegative);

        // findFirst, findAny
        Optional<Integer> firstEven = numbers.stream()
            .filter(n -> n % 2 == 0)
            .findFirst();
        firstEven.ifPresent(e -> System.out.println("First even: " + e));

        Optional<Integer> anyLarge = numbers.parallelStream()
            .filter(n -> n > 5)
            .findAny();
        anyLarge.ifPresent(a -> System.out.println("Any > 5: " + a));
    }
}
