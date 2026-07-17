import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class InstanceMethodReference {
    public static void main(String[] args) {
        // Specific instance — System.out::println
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("Using specific instance method reference:");
        names.forEach(System.out::println);

        // Arbitrary object — String::isEmpty
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println("\nEmpty checks:");
        System.out.println("'hello' empty? " + isEmpty.test("hello"));
        System.out.println("'' empty? " + isEmpty.test(""));

        // Arbitrary object — String::toLowerCase
        Function<String, String> lowerCase = String::toLowerCase;
        System.out.println("\nLowercase: " + lowerCase.apply("JAVA"));

        // Arbitrary object in stream
        System.out.println("\nSorted by length:");
        names.stream()
             .sorted(java.util.Comparator.comparingInt(String::length))
             .forEach(System.out::println);

        // Arbitrary object — combining
        List<String> mixed = Arrays.asList("  Hi  ", "  World  ");
        mixed.stream()
             .map(String::strip)
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
