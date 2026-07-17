public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableBook book = new ImmutableBook("Moby Dick", "Herman Melville", "978-0142437247");
        System.out.println("=== Immutable Book ===");
        book.display();

        System.out.println("\nNo setters exist — the object's state never changes after creation.");
        System.out.println("This is safe to share and pass around without defensive copies.");

        // Cannot do:
        // book.title = "New Title";  // Won't compile (final field)
        // book.setTitle("...");       // Won't compile (no setter)
    }
}
