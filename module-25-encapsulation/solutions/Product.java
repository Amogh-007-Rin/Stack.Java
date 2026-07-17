class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        setName(name);
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantityInStock = quantityInStock;
    }

    public void reduceStock(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot reduce by negative amount");
        }
        if (amount > quantityInStock) {
            throw new IllegalStateException("Insufficient stock. Available: " + quantityInStock + ", requested: " + amount);
        }
        quantityInStock -= amount;
    }

    public void display() {
        System.out.println(name + " | $" + price + " | In stock: " + quantityInStock);
    }
}
