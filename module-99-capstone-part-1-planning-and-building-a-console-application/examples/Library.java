import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> searchByTitle(String query) {
        List<Book> results = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(query.toLowerCase())) {
                results.add(b);
            }
        }
        return results;
    }

    public List<Book> searchByAuthor(String query) {
        List<Book> results = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                results.add(b);
            }
        }
        return results;
    }

    public Book findByIsbn(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public boolean checkoutBook(String isbn) {
        Book book = findByIsbn(isbn);
        if (book != null && book.isAvailable()) {
            return book.checkout();
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findByIsbn(isbn);
        if (book != null) {
            book.returnCopy();
            return true;
        }
        return false;
    }

    public void saveToFile(String filename) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            for (Book b : books) {
                out.println(b.toCsv());
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        books.clear();
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = in.readLine()) != null) {
                books.add(Book.fromCsv(line));
            }
        }
    }
}
