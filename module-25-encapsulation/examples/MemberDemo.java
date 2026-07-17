public class MemberDemo {
    public static void main(String[] args) {
        LibraryMember m1 = new LibraryMember("Alice", 1001);
        m1.setAge(25);
        m1.setEmail("alice@library.com");

        System.out.println("=== Valid Member ===");
        m1.display();

        m1.checkOutBook();
        m1.checkOutBook();
        m1.checkOutBook();
        m1.returnBook();
        System.out.println("After some activity:");
        m1.display();

        System.out.println("\n=== Validation Tests ===");
        try {
            m1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            m1.setEmail("invalid-email");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            m1.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\nMember is still in valid state:");
        m1.display();
    }
}
