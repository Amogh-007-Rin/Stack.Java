class Product {
    String name;
    double price;
    int quantity;

    Product() {
        this("Unknown", 0.0, 0);
    }

    Product(String name, double price) {
        this(name, price, 0);
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println(name + " | $" + price + " | Qty: " + quantity);
    }
}
