import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<String> books = Arrays.asList("Dune", "Neuromancer", "Snow Crash");

        System.out.println("For-each loop (requires Iterable):");
        for (String book : books) {
            System.out.println("  " + book);
        }

        System.out.println("\nExplicit Iterator:");
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }

        System.out.println("\nforEach with lambda:");
        books.forEach(b -> System.out.println("  " + b));
    }
}
