import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapAndPeek {
    public static void main(String[] args) {
        // flatMap — flatten nested lists
        List<List<String>> nested = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("d", "e"),
            Arrays.asList("f", "g", "h", "i")
        );

        System.out.print("Flat mapped: ");
        nested.stream()
              .flatMap(List::stream)
              .forEach(s -> System.out.print(s + " "));
        System.out.println();

        // flatMap with sentences → words
        List<String> sentences = Arrays.asList(
            "Hello world",
            "Java streams are powerful",
            "flatMap is useful"
        );

        List<String> words = sentences.stream()
            .flatMap(s -> Arrays.stream(s.split(" ")))
            .toList();
        System.out.println("Words: " + words);

        // peek — debugging pipeline stages
        System.out.print("\nPipeline with peek: ");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
            .peek(n -> System.out.print("[" + n + "]"))
            .filter(n -> n % 2 == 0)
            .peek(n -> System.out.print("(filtered:" + n + ")"))
            .map(n -> n * n)
            .peek(n -> System.out.print("{squared:" + n + "}"))
            .toList();
        System.out.println("\nResult: " + result);

        // flatMap with distinct
        List<String> flattenedDistinct = nested.stream()
            .flatMap(List::stream)
            .map(String::toUpperCase)
            .distinct()
            .sorted()
            .toList();
        System.out.println("Distinct sorted: " + flattenedDistinct);
    }
}
