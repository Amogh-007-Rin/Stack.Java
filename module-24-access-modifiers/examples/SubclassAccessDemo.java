class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(String title, String author, String isbn, int issueNumber) {
        super(title, author, isbn);
        this.issueNumber = issueNumber;
    }

    void displayAccess() {
        System.out.println("=== Subclass Access (same package) ===");
        System.out.println("Public title: " + title);
        System.out.println("Protected author: " + author);
        System.out.println("Default isbn: " + isbn);

        // Private members are NOT accessible even in subclasses:
        // System.out.println(checkoutCount);  // Would not compile
        // logAccess("test");                   // Would not compile

        System.out.println("Issue #" + issueNumber);
    }
}

public class SubclassAccessDemo {
    public static void main(String[] args) {
        Magazine mag = new Magazine("Java Weekly", "Tech Press", "123-456789", 42);
        mag.displayAccess();
    }
}
