import java.util.*;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of("Dune", "Neuromancer", "Snow Crash", "Foundation"));

        System.out.println("Original: " + books);

        Collections.sort(books);
        System.out.println("Sorted: " + books);

        Collections.reverse(books);
        System.out.println("Reversed: " + books);

        Collections.shuffle(books);
        System.out.println("Shuffled: " + books);

        Collections.sort(books);
        int idx = Collections.binarySearch(books, "Dune");
        System.out.println("BinarySearch for 'Dune': index " + idx);

        int notFound = Collections.binarySearch(books, "Zoo");
        System.out.println("BinarySearch for 'Zoo': " + notFound + " (negative = not found)");
    }
}
