import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        // toMap — key by first letter, value is the word
        Map<String, String> byFirstLetter = items.stream()
            .collect(Collectors.toMap(
                s -> s.substring(0, 1),
                s -> s,
                (existing, replacement) -> existing  // keep first on conflict
            ));
        System.out.println("toMap: " + byFirstLetter);

        // joining — concatenate with delimiter
        String joined = items.stream()
            .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("joining: " + joined);

        // groupingBy — group by string length
        Map<Integer, List<String>> byLength = items.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println("groupingBy length: " + byLength);

        // groupingBy with downstream collector (counting)
        Map<Integer, Long> countByLength = items.stream()
            .collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
            ));
        System.out.println("countByLength: " + countByLength);

        // partitioningBy — split into two groups
        Map<Boolean, List<String>> partitioned = items.stream()
            .collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println("long (>4): " + partitioned.get(true));
        System.out.println("short (<=4): " + partitioned.get(false));

        // summarizingInt — stats
        IntSummaryStatistics stats = items.stream()
            .collect(Collectors.summarizingInt(String::length));
        System.out.println("Stats: " + stats);
        System.out.println("  avg: " + stats.getAverage());
        System.out.println("  max: " + stats.getMax());

        // toSet
        Set<String> uniqueFirstLetters = items.stream()
            .map(s -> s.substring(0, 1))
            .collect(Collectors.toSet());
        System.out.println("toSet: " + uniqueFirstLetters);
    }
}
