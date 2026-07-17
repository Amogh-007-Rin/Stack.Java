public class LibraryDemo {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        System.out.println("=== No-Arg ===");
        b1.display();

        LibraryBook b2 = new LibraryBook("Dune", "Frank Herbert", 1965);
        System.out.println("\n=== Three-Parameter ===");
        b2.display();

        LibraryBook b3 = new LibraryBook("1984", "George Orwell", 1949, false);
        System.out.println("\n=== Full Constructor ===");
        b3.display();
    }
}
