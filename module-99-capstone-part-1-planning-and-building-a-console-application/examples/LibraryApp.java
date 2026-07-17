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
        while (true) {
            showMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addBook();
                case "2" -> listBooks();
                case "3" -> searchByTitle();
                case "4" -> searchByAuthor();
                case "5" -> checkoutBook();
                case "6" -> returnBook();
                case "7" -> { saveData(); System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
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
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Copies: ");
        int copies = Integer.parseInt(scanner.nextLine());
        library.addBook(new Book(title, author, isbn, copies));
        System.out.println("Book added.");
    }

    private void listBooks() {
        List<Book> books = library.listBooks();
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    private void searchByTitle() {
        System.out.print("Search title: ");
        String query = scanner.nextLine();
        List<Book> results = library.searchByTitle(query);
        if (results.isEmpty()) {
            System.out.println("No matches.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private void searchByAuthor() {
        System.out.print("Search author: ");
        String query = scanner.nextLine();
        List<Book> results = library.searchByAuthor(query);
        if (results.isEmpty()) {
            System.out.println("No matches.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private void checkoutBook() {
        System.out.print("ISBN to checkout: ");
        String isbn = scanner.nextLine();
        if (library.checkoutBook(isbn)) {
            System.out.println("Checked out successfully.");
        } else {
            System.out.println("Cannot checkout — book may not exist or no copies available.");
        }
    }

    private void returnBook() {
        System.out.print("ISBN to return: ");
        String isbn = scanner.nextLine();
        if (library.returnBook(isbn)) {
            System.out.println("Returned successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    private void loadData() {
        try {
            library.loadFromFile(DATA_FILE);
            System.out.println("Data loaded from " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("No existing data found, starting fresh.");
        }
    }

    private void saveData() {
        try {
            library.saveToFile(DATA_FILE);
            System.out.println("Data saved to " + DATA_FILE);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new LibraryApp().run();
    }
}
