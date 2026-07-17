public class ThisFieldDemo {
    public static void main(String[] args) {
        BookWithThis book = new BookWithThis("Moby Dick", "Herman Melville", "978-0142437247");
        System.out.println("=== Using this for disambiguation ===");
        book.display();

        System.out.println("\n=== Changing title (parameter shadows field) ===");
        book.setTitle("Moby-Dick");
        book.display();

        System.out.println("\n=== Calling this.method() ===");
        book.showDetails();
    }
}
