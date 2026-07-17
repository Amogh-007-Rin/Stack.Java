import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;

// Standalone demo: shows Jackson serialization without Spring Boot.
// Requires jackson-databind on the classpath.
record Product(int id, String name, double price) {
}

public class JSONSerializationDemo {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Product product = new Product(1, "Keyboard", 49.99);
        String json = mapper.writeValueAsString(product);
        System.out.println("Single object:");
        System.out.println(json);

        List<Product> products = List.of(
                new Product(1, "Keyboard", 49.99),
                new Product(2, "Monitor", 199.99)
        );
        String jsonList = mapper.writeValueAsString(products);
        System.out.println("\nList of objects:");
        System.out.println(jsonList);

        // Deserialize back
        Product deserialized = mapper.readValue(json, Product.class);
        System.out.println("\nDeserialized: " + deserialized);
    }
}
