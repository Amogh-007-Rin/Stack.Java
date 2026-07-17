import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInInterfaces {
    public static void main(String[] args) {
        // Predicate — test a condition
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Empty string? " + isEmpty.test(""));
        System.out.println("Non-empty? " + isEmpty.test("hello"));

        // Function — transform input to output
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println("Length of 'Java': " + lengthFunc.apply("Java"));

        // Consumer — consume a value, produce nothing
        Consumer<String> printer = s -> System.out.println(">> " + s);
        printer.accept("Hello from Consumer");

        // Supplier — produce a value, take nothing
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random: " + randomSupplier.get());
        System.out.println("Random: " + randomSupplier.get());

        // Putting them together
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Predicate<String> longerThan3 = s -> s.length() > 3;
        Function<String, String> exclaim = s -> s + "!";
        Consumer<String> print = s -> System.out.println(s);

        names.stream()
             .filter(longerThan3)
             .map(exclaim)
             .forEach(print);
    }
}
