import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Dune");
        books.add("Neuromancer");
        books.add("Snow Crash");
        books.add("Foundation");
        books.add("Hyperion");

        System.out.println("All books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("  [" + i + "] " + books.get(i));
        }

        books.add(2, "Altered Carbon");
        System.out.println("\nAfter inserting at index 2: " + books);

        books.remove(3);
        System.out.println("After removing index 3: " + books);

        System.out.println("Contains 'Dune'? " + books.contains("Dune"));
        System.out.println("Final list: " + books);
    }
}
