// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/products")
public class Exercise02QueryController {

    private final List<Product> products = List.of(
            new Product(1, "Laptop", "electronics", 999.99),
            new Product(2, "Mouse", "electronics", 19.99),
            new Product(3, "Desk", "furniture", 249.99),
            new Product(4, "Chair", "furniture", 149.99),
            new Product(5, "Headphones", "electronics", 79.99)
    );

    @GetMapping
    public List<Product> getProducts(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {

        Stream<Product> stream = products.stream();

        if (category != null) {
            stream = stream.filter(p -> p.category().equalsIgnoreCase(category));
        }
        if (minPrice != null) {
            stream = stream.filter(p -> p.price() >= minPrice);
        }
        if (maxPrice != null) {
            stream = stream.filter(p -> p.price() <= maxPrice);
        }

        return stream.toList();
    }
}

record Product(int id, String name, String category, double price) {
}
