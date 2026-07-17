import java.util.List;
import java.util.Scanner;

public class LibraryAppFinal {
    private static final String BOOK_FILE = "library_books.csv";
    private static final String MEMBER_FILE = "library_members.csv";
    private LibraryExtended library;
    private Scanner scanner;

    public LibraryAppFinal() {
        library = new LibraryExtended();
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
                case "7" -> addMember();
                case "8" -> listMembers();
                case "9" -> calculateFine();
                case "10" -> sortBooks();
                case "11" -> { saveData(); System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\n=== Library Management System v2 ===");
        System.out.println("1. Add Book");
        System.out.println("2. List All Books");
        System.out.println("3. Search by Title");
        System.out.println("4. Search by Author");
        System.out.println("5. Checkout Book");
        System.out.println("6. Return Book");
        System.out.println("7. Add Member");
        System.out.println("8. List Members");
        System.out.println("9. Calculate Fine");
        System.out.println("10. Sort Books");
        System.out.println("11. Save & Exit");
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
            System.out.println("No books.");
            return;
        }
        books.forEach(b -> System.out.println("  " + b));
    }

    private void searchByTitle() {
        System.out.print("Title: ");
        List<Book> results = library.searchByTitle(scanner.nextLine());
        if (results.isEmpty()) {
            System.out.println("No matches.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private void searchByAuthor() {
        System.out.print("Author: ");
        List<Book> results = library.searchByAuthor(scanner.nextLine());
        if (results.isEmpty()) {
            System.out.println("No matches.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private void checkoutBook() {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine();
        try {
            library.checkoutBook(isbn, memberId);
            System.out.println("Checked out successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void returnBook() {
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine();
        try {
            library.returnBook(isbn, memberId);
            System.out.println("Returned successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addMember() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine();
        library.addMember(new Member(name, memberId));
        System.out.println("Member added.");
    }

    private void listMembers() {
        List<Member> members = library.listMembers();
        if (members.isEmpty()) {
            System.out.println("No members.");
            return;
        }
        members.forEach(m -> System.out.println("  " + m));
    }

    private void calculateFine() {
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine();
        double fine = library.calculateFine(memberId);
        System.out.printf("Total fine: $%.2f%n", fine);
    }

    private void sortBooks() {
        System.out.println("Sort by: 1=Title  2=Author  3=Copies");
        String choice = scanner.nextLine();
        List<Book> sorted = switch (choice) {
            case "1" -> library.sortByTitle();
            case "2" -> library.sortByAuthor();
            case "3" -> library.sortByCopies();
            default -> { System.out.println("Invalid."); yield List.of(); }
        };
        sorted.forEach(b -> System.out.println("  " + b));
    }

    private void loadData() {
        try {
            library.loadFromFile(BOOK_FILE, MEMBER_FILE);
            System.out.println("Data loaded.");
        } catch (Exception e) {
            System.out.println("No existing data, starting fresh.");
        }
    }

    private void saveData() {
        try {
            library.saveToFile(BOOK_FILE, MEMBER_FILE);
            System.out.println("Data saved.");
        } catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new LibraryAppFinal().run();
    }
}
