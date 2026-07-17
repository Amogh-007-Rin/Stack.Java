public class BookDemo {
    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("=== Default Constructor ===");
        defaultBook.displayInfo();

        Book partialBook = new Book("Dune", "Frank Herbert");
        System.out.println("\n=== Two-Parameter Constructor ===");
        partialBook.displayInfo();

        Book fullBook = new Book("Moby Dick", "Herman Melville", "978-0142437247", 720);
        System.out.println("\n=== Full Constructor ===");
        fullBook.displayInfo();

        Book isbnBook = new Book("1984", "George Orwell", "978-0451524935");
        System.out.println("\n=== Three-Parameter Constructor ===");
        isbnBook.displayInfo();
    }
}
