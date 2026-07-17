import java.util.*;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>(List.of(5, 3, 4, 5, 2, 4, 3));

        System.out.println("Ratings: " + ratings);
        System.out.println("Max: " + Collections.max(ratings));
        System.out.println("Min: " + Collections.min(ratings));
        System.out.println("Frequency of 5: " + Collections.frequency(ratings, 5));

        List<Integer> copy = new ArrayList<>(List.of(0, 0, 0, 0, 0, 0, 0));
        Collections.copy(copy, ratings);
        System.out.println("Copied: " + copy);

        Collections.fill(copy, 1);
        System.out.println("Filled: " + copy);

        // Unmodifiable view
        List<String> readOnly = Collections.unmodifiableList(List.of("A", "B"));
        System.out.println("Read-only: " + readOnly);
        // readOnly.add("C");  // UnsupportedOperationException

        // Synchronized view
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Safe");
        System.out.println("Synchronized list: " + syncList);
    }
}
