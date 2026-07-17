// Standalone POJO demonstrating JPA entity mapping concepts.
// In a real project, this would be processed by Hibernate at runtime.
// Shows annotations conceptually — no JPA JAR needed to read/comprehend.

import java.time.LocalDateTime;

public class ProductEntity {

    private Long id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private LocalDateTime createdAt;

    // JPA requires a no-arg constructor
    public ProductEntity() {
    }

    public ProductEntity(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters — JPA and Jackson use these
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ProductEntity{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}
