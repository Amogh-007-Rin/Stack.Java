import java.util.List;

record Book(String title, String author, String isbn) {}

public class Exercise3 {
    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("1984", "George Orwell", "978-0451524935"),
            new Book("Brave New World", "Aldous Huxley", "978-0060850524"),
            new Book("Animal Farm", "George Orwell", "978-0451526342")
        );

        System.out.println("All books:");
        books.forEach(System.out::println);

        System.out.println("\nBooks by George Orwell:");
        books.stream()
            .filter(b -> b.author().equals("George Orwell"))
            .forEach(System.out::println);

        Book b1 = new Book("1984", "George Orwell", "978-0451524935");
        Book b2 = new Book("1984", "George Orwell", "978-0451524935");
        System.out.println("\nequals and hashCode test: " + b1.equals(b2) + " (expected true)");
        System.out.println("Hash codes: " + b1.hashCode() + " == " + b2.hashCode());
    }
}
