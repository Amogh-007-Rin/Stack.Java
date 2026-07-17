import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceDecision {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "", "banana", "", "cherry");

        // Prefer method reference — single method call, clear intent
        words.stream()
             .filter(String::isEmpty)
             .forEach(System.out::println);  // prints blank lines

        // Lambda preferred — extra logic
        words.stream()
             .filter(s -> !s.isEmpty() && s.length() > 5)
             .forEach(s -> System.out.println("Long word: " + s));

        // Method reference fine — simple delegation
        Function<String, String> reverser = s -> new StringBuilder(s).reverse().toString();
        words.stream()
             .filter(Predicate.not(String::isEmpty))
             .map(reverser)  // lambda is fine here, method ref not possible
             .forEach(System.out::println);

        // Method reference preferred — existing utility
        words.stream()
             .map(String::toUpperCase)
             .forEach(s -> System.out.print(s + " "));
        System.out.println();

        // When both work, choose clearer one
        // Thread thread1 = new Thread(() -> System.out.println("Hi"));
        // Thread thread2 = new Thread(System.out::println);  // No, needs args
    }
}
