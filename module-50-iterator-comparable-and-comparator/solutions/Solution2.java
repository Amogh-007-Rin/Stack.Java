import java.util.*;

class Book2 implements Comparable<Book2> {
    String title;
    int pageCount;

    Book2(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book2 other) {
        return Integer.compare(this.pageCount, other.pageCount);
    }

    @Override
    public String toString() {
        return title + " (" + pageCount + "pp)";
    }
}

public class Solution2 {
    public static void main(String[] args) {
        List<Book2> books = new ArrayList<>();
        books.add(new Book2("Dune", 412));
        books.add(new Book2("Neuromancer", 271));
        books.add(new Book2("Snow Crash", 440));
        books.add(new Book2("Foundation", 244));
        books.add(new Book2("Snow Crash", 440));

        System.out.println("Before: " + books);
        Collections.sort(books);
        System.out.println("After (by pages): " + books);
    }
}
