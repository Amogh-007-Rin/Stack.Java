import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
    private static final String DATA_FILE = "library.csv";
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
            switch (choice) {
                case "1" -> addBook();
                case "2" -> listBooks();
                case "3" -> searchByTitle();
                case "4" -> searchByAuthor();
                case "5" -> checkoutBook();
                case "6" -> returnBook();
                case "7" -> { saveData(); running = false; }
                default -> System.out.println("Invalid choice. Please enter 1-7.");
            }
        }
        System.out.println("Goodbye!");
    }

    private void showMenu() {
        System.out.println("\n=== Library Management System ===");
        System.out.println("1. Add Book");
        System.out.println("2. List All Books");
        System.out.println("3. Search by Title");
        System.out.println("4. Search by Author");
        System.out.println("5. Checkout Book");
        System.out.println("6. Return Book");
        System.out.println("7. Save & Exit");
        System.out.print("Choice: ");
    }

    private void addBook() {
        try {
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
            System.out.println("Book added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for copies.");
        }
    }

    private void listBooks() {
        List<Book> books = library.listBooks();
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
            return;
        }
        System.out.println("\nBooks (" + books.size() + " total):");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    private void searchByTitle() {
        System.out.print("Enter title to search: ");
        String query = scanner.nextLine().trim();
        List<Book> results = library.searchByTitle(query);
        if (results.isEmpty()) {
            System.out.println("No books found matching \"" + query + "\".");
        } else {
            System.out.println("Found " + results.size() + " match(es):");
            results.forEach(System.out::println);
        }
    }

    private void searchByAuthor() {
        System.out.print("Enter author to search: ");
        String query = scanner.nextLine().trim();
        List<Book> results = library.searchByAuthor(query);
        if (results.isEmpty()) {
            System.out.println("No books found by \"" + query + "\".");
        } else {
            System.out.println("Found " + results.size() + " match(es):");
            results.forEach(System.out::println);
        }
    }

    private void checkoutBook() {
        System.out.print("Enter ISBN to checkout: ");
        String isbn = scanner.nextLine().trim();
        if (library.checkoutBook(isbn)) {
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Could not checkout. Check ISBN or availability.");
        }
    }

    private void returnBook() {
        System.out.print("Enter ISBN to return: ");
        String isbn = scanner.nextLine().trim();
        if (library.returnBook(isbn)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found with ISBN: " + isbn);
        }
    }

    private void loadData() {
        try {
            library.loadFromFile(DATA_FILE);
            int count = library.listBooks().size();
            System.out.println("Loaded " + count + " book(s) from " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("No existing data file found. Starting with an empty library.");
        }
    }

    private void saveData() {
        try {
            library.saveToFile(DATA_FILE);
            int count = library.listBooks().size();
            System.out.println("Saved " + count + " book(s) to " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new LibraryApp().run();
    }
}
