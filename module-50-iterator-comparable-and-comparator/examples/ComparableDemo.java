import java.util.*;

class Book implements Comparable<Book> {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title + " (" + pages + "pp)";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Neuromancer", 271));
        books.add(new Book("Dune", 412));
        books.add(new Book("Snow Crash", 440));

        System.out.println("Before sort: " + books);

        Collections.sort(books);
        System.out.println("After sort (by title): " + books);
    }
}
