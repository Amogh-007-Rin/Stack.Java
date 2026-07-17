import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date");

        // forEach — side effect
        System.out.print("forEach: ");
        words.stream().forEach(w -> System.out.print(w + " "));
        System.out.println();

        // count — returns long
        long count = words.stream()
                          .filter(w -> w.length() > 4)
                          .count();
        System.out.println("Words longer than 4: " + count);

        // collect — into a List
        List<String> longWords = words.stream()
                                      .filter(w -> w.length() > 4)
                                      .collect(Collectors.toList());
        System.out.println("Collected: " + longWords);

        // collect — into a Set
        Set<String> wordSet = words.stream()
                                   .collect(Collectors.toSet());
        System.out.println("Set: " + wordSet);

        // toList — Java 16+ (unmodifiable)
        List<String> upperList = words.stream()
                                      .map(String::toUpperCase)
                                      .toList();
        System.out.println("toList: " + upperList);
        // upperList.add("X");  // throws UnsupportedOperationException

        // Stream is single-use — this would fail:
        Stream<String> stream = words.stream();
        stream.forEach(System.out::print);
        // stream.count();  // IllegalStateException: stream has already been operated upon or closed
        System.out.println();
    }
}
