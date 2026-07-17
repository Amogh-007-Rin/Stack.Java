public class AccessDemo {
    public static void main(String[] args) {
        LibraryItem item = new LibraryItem("Moby Dick", "Herman Melville", "978-0142437247");

        System.out.println("=== Access Demo (same package) ===");

        System.out.println("Public title: " + item.title);
        System.out.println("Protected author: " + item.author);
        System.out.println("Default isbn: " + item.isbn);

        item.checkout();
        item.checkout();
        System.out.println("Checkout count (via public getter): " + item.getCheckoutCount());

        item.resetCheckoutCount();
        System.out.println("After default resetCheckoutCount(): " + item.getCheckoutCount());

        // Cannot access private field directly:
        // System.out.println(item.checkoutCount);  // Would not compile

        // Cannot call private method:
        // item.logAccess("test");  // Would not compile

        System.out.println("\nVisibility summary:");
        System.out.println("  public title      → accessible");
        System.out.println("  protected author  → accessible (same package)");
        System.out.println("  default isbn      → accessible (same package)");
        System.out.println("  private checkout  → NOT accessible directly");
        System.out.println("  private logAccess → NOT callable directly");
    }
}
