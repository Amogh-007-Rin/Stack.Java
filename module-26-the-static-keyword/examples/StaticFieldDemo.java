public class StaticFieldDemo {
    public static void main(String[] args) {
        System.out.println("=== Static Field Demo ===");
        System.out.println("Books created so far: " + BookWithCounter.getTotalBooksCreated());

        BookWithCounter b1 = new BookWithCounter("Moby Dick");
        BookWithCounter b2 = new BookWithCounter("1984");
        BookWithCounter b3 = new BookWithCounter("Dune");

        System.out.println("After creating 3 books: " + BookWithCounter.getTotalBooksCreated());

        BookWithCounter b4 = new BookWithCounter("Neuromancer");
        System.out.println("After creating 4 books: " + BookWithCounter.getTotalBooksCreated());

        System.out.println("\nEach book's instance data is separate:");
        System.out.println("b1.title = " + b1.getTitle());
        System.out.println("b2.title = " + b2.getTitle());

        System.out.println("\nBut totalBooksCreated is shared across all instances.");
    }
}
