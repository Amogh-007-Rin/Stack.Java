public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 999.99, 10);
        System.out.println("=== Valid Product ===");
        p.display();

        System.out.println("\n=== Reduce Stock ===");
        p.reduceStock(3);
        p.display();

        System.out.println("\n=== Validation Tests ===");
        try {
            p.setPrice(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Price validation: " + e.getMessage());
        }

        try {
            p.setQuantityInStock(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Quantity validation: " + e.getMessage());
        }

        try {
            p.reduceStock(100);
        } catch (IllegalStateException e) {
            System.out.println("Stock check: " + e.getMessage());
        }

        System.out.println("\nFinal state:");
        p.display();
    }
}
