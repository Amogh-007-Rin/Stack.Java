import java.util.Objects;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}

public class Exercise1Solution {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", 1949);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("Brave New World", "Aldous Huxley", 1932);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("b1.equals(b2): " + b1.equals(b2));
        System.out.println("b1.equals(b3): " + b1.equals(b3));
        System.out.println("b1.hashCode() == b2.hashCode(): " + (b1.hashCode() == b2.hashCode()));
    }
}
