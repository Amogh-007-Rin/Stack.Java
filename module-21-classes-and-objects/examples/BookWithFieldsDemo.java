public class BookWithFieldsDemo {
    public static void main(String[] args) {
        BookWithFields b1 = new BookWithFields();
        b1.title = "Moby Dick";
        b1.author = "Herman Melville";
        b1.isbn = "978-0142437247";
        b1.pages = 720;
        b1.isCheckedOut = false;

        BookWithFields b2 = new BookWithFields();
        b2.title = "1984";
        b2.author = "George Orwell";
        b2.isbn = "978-0451524935";
        b2.pages = 328;
        b2.isCheckedOut = true;

        System.out.println("=== Library Books ===");
        b1.printDetails();
        b2.printDetails();

        System.out.println("\n=== Checking out Moby Dick ===");
        b1.checkOut();
        b1.printDetails();

        System.out.println("\n=== Returning 1984 ===");
        b2.returnBook();
        b2.printDetails();

        System.out.println("\n=== Primitive vs Reference ===");
        int x = 5;
        int y = x;
        y = 10;
        System.out.println("x = " + x + ", y = " + y + " (primitives are independent)");

        BookWithFields b3 = b1;
        b3.title = "Moby Dick (copy)";
        System.out.println("b1.title after b3 modified: " + b1.title + " (references share the object)");
    }
}
