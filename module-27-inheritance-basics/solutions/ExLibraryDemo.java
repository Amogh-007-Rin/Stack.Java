public class ExLibraryDemo {
    public static void main(String[] args) {
        ExBook book = new ExBook("Moby Dick", "Herman Melville", 1851, 720);
        DVD dvd = new DVD("Inception", "Christopher Nolan", 2010, 148);

        System.out.println("=== Library Items ===");
        System.out.println(book.getDescription());
        System.out.println(dvd.getDescription());
    }
}
