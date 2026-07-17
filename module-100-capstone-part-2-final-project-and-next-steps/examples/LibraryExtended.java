import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class LibraryExtended {
    private static final Logger LOG = Logger.getLogger(LibraryExtended.class.getName());
    private static final double DAILY_FINE = 0.50;

    private List<Book> books;
    private List<Member> members;

    public LibraryExtended() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // --- Book operations ---

    public void addBook(Book book) {
        books.add(book);
        LOG.info("Book added: " + book.getTitle());
    }

    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> searchByTitle(String query) {
        return books.stream()
            .filter(b -> b.getTitle().toLowerCase().contains(query.toLowerCase()))
            .collect(Collectors.toList());
    }

    public List<Book> searchByAuthor(String query) {
        return books.stream()
            .filter(b -> b.getAuthor().toLowerCase().contains(query.toLowerCase()))
            .collect(Collectors.toList());
    }

    public Book findByIsbn(String isbn) {
        return books.stream()
            .filter(b -> b.getIsbn().equals(isbn))
            .findFirst()
            .orElse(null);
    }

    public void checkoutBook(String isbn, String memberId) throws Exception {
        Book book = findByIsbn(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + isbn);
        }
        if (!book.isAvailable()) {
            throw new IllegalStateException("No copies available for: " + book.getTitle());
        }
        Member member = findMember(memberId);
        if (member == null) {
            throw new IllegalArgumentException("Member not found: " + memberId);
        }
        book.checkout();
        Loan loan = new Loan(isbn, memberId, LocalDate.now());
        member.addLoan(loan);
        LOG.info("Checked out " + book.getTitle() + " to " + member.getName());
    }

    public void returnBook(String isbn, String memberId) throws Exception {
        Member member = findMember(memberId);
        if (member == null) {
            throw new IllegalArgumentException("Member not found: " + memberId);
        }
        if (!member.returnBook(isbn)) {
            throw new IllegalStateException("No active loan for ISBN: " + isbn);
        }
        Book book = findByIsbn(isbn);
        if (book != null) {
            book.returnCopy();
        }
        LOG.info("Returned " + (book != null ? book.getTitle() : isbn));
    }

    // --- Member operations ---

    public void addMember(Member member) {
        members.add(member);
        LOG.info("Member added: " + member.getName());
    }

    public Member findMember(String memberId) {
        return members.stream()
            .filter(m -> m.getMemberId().equals(memberId))
            .findFirst()
            .orElse(null);
    }

    public List<Member> listMembers() {
        return new ArrayList<>(members);
    }

    // --- Fine calculation ---

    public double calculateFine(String memberId) {
        Member member = findMember(memberId);
        if (member == null) return 0;
        return member.calculateTotalFines(DAILY_FINE);
    }

    // --- Sorting ---

    public List<Book> sortByTitle() {
        return books.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .collect(Collectors.toList());
    }

    public List<Book> sortByAuthor() {
        return books.stream()
            .sorted(Comparator.comparing(Book::getAuthor))
            .collect(Collectors.toList());
    }

    public List<Book> sortByCopies() {
        return books.stream()
            .sorted(Comparator.comparingInt(Book::getCopies).reversed())
            .collect(Collectors.toList());
    }

    // --- Persistence ---

    public void saveToFile(String bookFile, String memberFile) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter(bookFile))) {
            for (Book b : books) out.println(b.toCsv());
        }
        try (PrintWriter out = new PrintWriter(new FileWriter(memberFile))) {
            for (Member m : members) out.println(m.toCsv());
        }
        LOG.info("Data saved to " + bookFile + " and " + memberFile);
    }

    public void loadFromFile(String bookFile, String memberFile) throws IOException {
        books.clear();
        try (BufferedReader in = new BufferedReader(new FileReader(bookFile))) {
            String line;
            while ((line = in.readLine()) != null) books.add(Book.fromCsv(line));
        }
        members.clear();
        try (BufferedReader in = new BufferedReader(new FileReader(memberFile))) {
            String line;
            while ((line = in.readLine()) != null) members.add(Member.fromCsv(line));
        }
        LOG.info("Data loaded from " + bookFile + " and " + memberFile);
    }
}
