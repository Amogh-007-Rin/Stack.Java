import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of("Dune", "Neuromancer", "Snow Crash", "Foundation"));

        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            String book = it.next();
            if (book.startsWith("N")) {
                it.remove();  // safe removal
            }
        }
        System.out.println("After safe removal: " + books);

        // forEachRemaining
        Iterator<String> remaining = books.iterator();
        System.out.println("\nforEachRemaining:");
        remaining.forEachRemaining(b -> System.out.println("  " + b));
    }
}
