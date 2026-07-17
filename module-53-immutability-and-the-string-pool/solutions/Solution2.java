import java.util.*;

final class Patron {
    private final int id;
    private final String name;
    private final List<String> borrowedBooks;

    Patron(int id, String name, List<String> borrowedBooks) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = List.copyOf(borrowedBooks);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public List<String> getBorrowedBooks() { return borrowedBooks; }
}

public class Solution2 {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>(List.of("Dune", "Neuromancer"));
        Patron p = new Patron(1, "Alice", books);

        System.out.println("Before external modification: " + p.getBorrowedBooks());

        books.add("Snow Crash");
        System.out.println("After external modification: " + p.getBorrowedBooks());

        System.out.println("Patron is immutable - external changes don't affect it.");
    }
}
