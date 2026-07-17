import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;

record Product(String name, String category, double price) {}

public class Exercise4 {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", "Electronics", 999.99),
            new Product("Mouse", "Electronics", 25.50),
            new Product("Notebook", "Stationery", 3.99),
            new Product("Desk Lamp", "Furniture", 45.00),
            new Product("Pen", "Stationery", 1.50),
            new Product("Monitor", "Electronics", 299.99)
        );

        List<String> result = products.stream()
            .filter(p -> p.price() > 10.0)
            .sorted(Comparator.comparingDouble(Product::price).reversed())
            .limit(3)
            .map(p -> String.format("%s: $%.2f", p.name(), p.price()))
            .toList();

        result.forEach(System.out::println);
    }
}
