import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryApp {
    private static final Logger LOG = Logger.getLogger(LibraryApp.class.getName());
    private static final String BOOK_FILE = "library_books.csv";
    private static final String MEMBER_FILE = "library_members.csv";

    private Library library;
    private Scanner scanner;

    public LibraryApp() {
        library = new Library();
        scanner = new Scanner(System.in);
    }

    public void run() {
        loadData();
        boolean running = true;
        while (running) {
            showMenu();
            String choice = scanner.nextLine().trim();
            try {
                running = handleChoice(choice);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                LOG.log(Level.WARNING, "User operation failed: {0}", e.getMessage());
            }
        }
        System.out.println("Goodbye!");
    }

    private boolean handleChoice(String choice) {
        return switch (choice) {
            case "1" -> { addBook(); yield true; }
            case "2" -> { listBooks(); yield true; }
            case "3" -> { searchByTitle(); yield true; }
            case "4" -> { searchByAuthor(); yield true; }
            case "5" -> { checkoutBook(); yield true; }
            case "6" -> { returnBook(); yield true; }
            case "7" -> { addMember(); yield true; }
            case "8" -> { listMembers(); yield true; }
            case "9" -> { calculateFine(); yield true; }
            case "10" -> { sortBooks(); yield true; }
            case "11" -> { saveData(); yield false; }
            default -> { System.out.println("Invalid choice. Enter 1-11."); yield true; }
        };
    }

    private void showMenu() {
        System.out.println("\n=== Library Management System v2 ===");
        System.out.println("1.  Add Book");
        System.out.println("2.  List All Books");
        System.out.println("3.  Search by Title");
        System.out.println("4.  Search by Author");
        System.out.println("5.  Checkout Book");
        System.out.println("6.  Return Book");
        System.out.println("7.  Add Member");
        System.out.println("8.  List Members");
        System.out.println("9.  Calculate Fine");
        System.out.println("10. Sort Books");
        System.out.println("11. Save & Exit");
        System.out.print("Choice: ");
    }

    private void addBook() {
        System.out.print("Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Author: ");
        String author = scanner.nextLine().trim();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine().trim();
        System.out.print("Copies: ");
        int copies = Integer.parseInt(scanner.nextLine().trim());
        if (copies < 0) {
            System.out.println("Copies cannot be negative.");
            return;
        }
        library.addBook(new Book(title, author, isbn, copies));
        System.out.println("Book added.");
    }

    private void listBooks() {
        List<Book> books = library.listBooks();
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nLibrary catalog (" + books.size() + " books):");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    private void searchByTitle() {
        System.out.print("Enter title keyword: ");
        String query = scanner.nextLine().trim();
        List<Book> results = library.searchByTitle(query);
        if (results.isEmpty()) {
            System.out.println("No matches for \"" + query + "\".");
        } else {
            System.out.println("Found " + results.size() + " match(es):");
            results.forEach(System.out::println);
        }
    }

    private void searchByAuthor() {
        System.out.print("Enter author keyword: ");
        String query = scanner.nextLine().trim();
        List<Book> results = library.searchByAuthor(query);
        if (results.isEmpty()) {
            System.out.println("No matches for \"" + query + "\".");
        } else {
            System.out.println("Found " + results.size() + " match(es):");
            results.forEach(System.out::println);
        }
    }

    private void checkoutBook() {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine().trim();
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine().trim();
        library.checkoutBook(isbn, memberId);
        System.out.println("Checked out successfully.");
    }

    private void returnBook() {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine().trim();
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine().trim();
        library.returnBook(isbn, memberId);
        System.out.println("Returned successfully.");
    }

    private void addMember() {
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine().trim();
        if (library.findMember(memberId) != null) {
            System.out.println("Member ID already exists.");
            return;
        }
        library.addMember(new Member(name, memberId));
        System.out.println("Member added.");
    }

    private void listMembers() {
        List<Member> members = library.listMembers();
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        System.out.println("\nRegistered members:");
        members.forEach(m -> System.out.println("  " + m));
    }

    private void calculateFine() {
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine().trim();
        double fine = library.calculateFine(memberId);
        System.out.printf("Total fine for %s: $%.2f%n", memberId, fine);
    }

    private void sortBooks() {
        System.out.println("Sort by: 1=Title  2=Author  3=Copies (descending)");
        String choice = scanner.nextLine().trim();
        List<Book> sorted;
        switch (choice) {
            case "1" -> sorted = library.sortByTitle();
            case "2" -> sorted = library.sortByAuthor();
            case "3" -> sorted = library.sortByCopies();
            default -> {
                System.out.println("Invalid sort option.");
                return;
            }
        }
        sorted.forEach(System.out::println);
    }

    private void loadData() {
        try {
            library.loadFromFile(BOOK_FILE, MEMBER_FILE);
            System.out.println("Data loaded successfully.");
        } catch (Exception e) {
            System.out.println("No existing data found. Starting fresh.");
            LOG.log(Level.INFO, "No data files found, starting with empty library");
        }
    }

    private void saveData() {
        try {
            library.saveToFile(BOOK_FILE, MEMBER_FILE);
            System.out.println("Data saved successfully.");
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
            LOG.log(Level.SEVERE, "Failed to save data", e);
        }
    }

    public static void main(String[] args) {
        new LibraryApp().run();
    }
}
