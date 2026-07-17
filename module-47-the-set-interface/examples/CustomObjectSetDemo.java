import java.util.*;

class Book {
    String isbn;
    String title;

    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book b)) return false;
        return Objects.equals(isbn, b.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return title + " (" + isbn + ")";
    }
}

public class CustomObjectSetDemo {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        Book b1 = new Book("111", "Dune");
        Book b2 = new Book("222", "Neuromancer");
        Book b3 = new Book("111", "Dune (duplicate ISBN)");

        books.add(b1);
        books.add(b2);
        books.add(b3);  // considered equal to b1, not added

        System.out.println("Set size: " + books.size());
        for (Book b : books) {
            System.out.println("  " + b);
        }

        System.out.println("b1.equals(b3): " + b1.equals(b3));
    }
}
