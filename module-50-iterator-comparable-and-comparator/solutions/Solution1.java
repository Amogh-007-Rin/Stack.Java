import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class BookCollection implements Iterable<Book> {
    private List<Book> books;

    BookCollection(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}

public class Solution1 {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection(List.of(
            new Book("Dune"),
            new Book("Neuromancer"),
            new Book("Snow Crash")
        ));

        System.out.println("Books in collection:");
        for (Book b : collection) {
            System.out.println("  " + b);
        }
    }
}
