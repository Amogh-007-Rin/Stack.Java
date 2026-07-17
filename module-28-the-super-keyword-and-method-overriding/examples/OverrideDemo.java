public class OverrideDemo {
    public static void main(String[] args) {
        System.out.println("=== Method Overriding with super ===");

        Book book = new Book("Moby Dick", "Herman Melville", 1851, 720);
        DVD dvd = new DVD("Inception", "Christopher Nolan", 2010, 148);

        System.out.println("Book description: " + book.getDescription());
        System.out.println("DVD description: " + dvd.getDescription());

        System.out.println("\n=== super calls in action ===");
        System.out.println("Each subclass calls super.getDescription()");
        System.out.println("and appends its own detail.");

        System.out.println("\n=== Constructor Chaining ===");
        System.out.println("Both Book and DVD call super(title, author, year).");
        System.out.println("This ensures Item's constructor initializes shared fields.");

        System.out.println("\n=== @Override catches errors ===");
        System.out.println("If I wrote getdiscription() instead of getDescription(),");
        System.out.println("@Override would cause a compile error.");
    }
}
