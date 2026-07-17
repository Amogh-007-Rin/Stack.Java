import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();

        books.add("Dune");
        books.add("Neuromancer");
        books.add("Snow Crash");
        System.out.println("After add: " + books);

        books.add(1, "Foundation");
        System.out.println("After insert at 1: " + books);

        String first = books.get(0);
        System.out.println("First book: " + first);

        books.set(0, "Hyperion");
        System.out.println("After set(0, Hyperion): " + books);

        books.remove(2);
        System.out.println("After remove(2): " + books);

        System.out.println("Size: " + books.size());
        System.out.println("Contains 'Dune'? " + books.contains("Dune"));
        System.out.println("Index of 'Hyperion': " + books.indexOf("Hyperion"));
        System.out.println("Index of 'Dune': " + books.indexOf("Dune"));
    }
}
