import java.util.Objects;

class Product {
    private String sku;
    private String name;
    private double price;

    public Product(String sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{sku='" + sku + "', name='" + name + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return sku.equals(product.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }
}

public class Exercise3Solution {
    public static void main(String[] args) {
        Product p1 = new Product("SKU-001", "Laptop", 999.99);
        Product p2 = new Product("SKU-001", "Gaming Laptop", 1299.99);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode()));
    }
}
