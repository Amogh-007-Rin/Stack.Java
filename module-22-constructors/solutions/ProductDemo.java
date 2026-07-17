public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("=== No-Arg Constructor ===");
        p1.displayProduct();

        Product p2 = new Product("Laptop", 999.99);
        System.out.println("\n=== Two-Parameter Constructor ===");
        p2.displayProduct();

        Product p3 = new Product("Mouse", 25.50, 50);
        System.out.println("\n=== Three-Parameter Constructor ===");
        p3.displayProduct();
    }
}
