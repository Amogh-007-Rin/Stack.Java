import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("The Great Gatsby");
        books.add("1984");
        books.add("To Kill a Mockingbird");

        Set<Integer> ratings = new HashSet<>();
        ratings.add(5);
        ratings.add(4);
        ratings.add(5);  // duplicate, ignored

        Queue<String> queue = new LinkedList<>();
        queue.offer("Patron 1");
        queue.offer("Patron 2");

        Map<String, String> isbnToTitle = new HashMap<>();
        isbnToTitle.put("978-0-7432-7356-5", "The Great Gatsby");
        isbnToTitle.put("978-0-452-28423-4", "1984");

        System.out.println("List: " + books);
        System.out.println("Set: " + ratings);
        System.out.println("Queue: " + queue);
        System.out.println("Map: " + isbnToTitle);

        System.out.println("\nAll collections show size, add, remove, contains patterns.");
    }
}
