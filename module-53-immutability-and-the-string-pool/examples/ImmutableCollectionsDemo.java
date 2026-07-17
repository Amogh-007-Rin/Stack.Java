import java.util.*;

public class ImmutableCollectionsDemo {
    public static void main(String[] args) {
        List<String> bookList = List.of("Dune", "Neuromancer", "Snow Crash");
        System.out.println("List.of: " + bookList);
        // bookList.add("Foundation");  // UnsupportedOperationException

        Set<String> bookSet = Set.of("Dune", "Neuromancer", "Snow Crash");
        System.out.println("Set.of: " + bookSet);

        Map<String, Integer> bookMap = Map.of(
            "Dune", 1965,
            "Neuromancer", 1984,
            "Snow Crash", 1992
        );
        System.out.println("Map.of: " + bookMap);

        // Copying into immutable
        List<String> mutable = new ArrayList<>(List.of("A", "B"));
        List<String> immutableCopy = List.copyOf(mutable);
        mutable.add("C");
        System.out.println("Original after add: " + mutable);
        System.out.println("Immutable copy: " + immutableCopy);

        System.out.println("\nAll collections are immutable and null-free.");
    }
}
