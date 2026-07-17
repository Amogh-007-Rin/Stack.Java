import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Product(String name, String category, double price) {}

public class Exercise2 {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", "Electronics", 999.99),
            new Product("Mouse", "Electronics", 25.50),
            new Product("Keyboard", "Electronics", 75.00),
            new Product("Notebook", "Stationery", 3.99),
            new Product("Pen", "Stationery", 1.50),
            new Product("Desk", "Furniture", 250.00),
            new Product("Chair", "Furniture", 180.00),
            new Product("Lamp", "Furniture", 45.00)
        );

        Map<String, java.util.DoubleSummaryStatistics> statsByCategory = products.stream()
            .collect(Collectors.groupingBy(
                Product::category,
                Collectors.summarizingDouble(Product::price)
            ));

        statsByCategory.forEach((cat, stats) -> {
            System.out.println(cat + ": avg=$" + String.format("%.2f", stats.getAverage())
                + ", max=$" + String.format("%.2f", stats.getMax())
                + ", min=$" + String.format("%.2f", stats.getMin()));
        });

        Map<Boolean, List<Product>> partitioned = products.stream()
            .collect(Collectors.partitioningBy(p -> p.price() > 50));

        System.out.println("\nExpensive (> $50): " + partitioned.get(true).size());
        System.out.println("Cheap (<= $50): " + partitioned.get(false).size());
    }
}
