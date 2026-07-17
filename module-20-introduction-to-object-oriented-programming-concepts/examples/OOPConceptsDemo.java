public class OOPConceptsDemo {

    static class Book {
        String title;
        String author;
        boolean isCheckedOut;

        void displayInfo() {
            String status = isCheckedOut ? "Checked Out" : "Available";
            System.out.println(title + " by " + author + " [" + status + "]");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== OOP Concepts Demo ===");

        Book book1 = new Book();
        book1.title = "Moby Dick";
        book1.author = "Herman Melville";
        book1.isCheckedOut = false;

        Book book2 = new Book();
        book2.title = "1984";
        book2.author = "George Orwell";
        book2.isCheckedOut = true;

        book1.displayInfo();
        book2.displayInfo();

        System.out.println("\nEach Book object bundles its own state (title, author, status)");
        System.out.println("with behavior (displayInfo). This is the essence of OOP.");
    }
}
