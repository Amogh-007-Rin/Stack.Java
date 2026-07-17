import java.util.*;

class Book2 {
    String title;
    int pages;

    Book2(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String toString() {
        return title + " (" + pages + "pp)";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Book2> books = new ArrayList<>();
        books.add(new Book2("Neuromancer", 271));
        books.add(new Book2("Dune", 412));
        books.add(new Book2("Snow Crash", 440));

        Comparator<Book2> byPages = (a, b) -> Integer.compare(a.pages, b.pages);
        Collections.sort(books, byPages);
        System.out.println("By pages: " + books);

        Comparator<Book2> byPagesDesc = (a, b) -> Integer.compare(b.pages, a.pages);
        Collections.sort(books, byPagesDesc);
        System.out.println("By pages desc: " + books);

        Comparator<Book2> byTitleLength = Comparator.comparingInt(b -> b.title.length());
        Collections.sort(books, byTitleLength);
        System.out.println("By title length: " + books);
    }
}
