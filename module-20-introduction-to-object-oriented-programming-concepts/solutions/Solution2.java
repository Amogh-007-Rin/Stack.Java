import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println("=== Procedural approach ===");
        String[] productNames = {"Milk", "Bread", "Eggs"};
        double[] productPrices = {2.50, 1.80, 3.00};
        String[] cartItems = new String[10];
        double[] cartPrices = new double[10];
        int cartSize = 0;

        cartItems[cartSize] = productNames[0];
        cartPrices[cartSize] = productPrices[0];
        cartSize++;
        cartItems[cartSize] = productNames[1];
        cartPrices[cartSize] = productPrices[1];
        cartSize++;

        double total = 0;
        for (int i = 0; i < cartSize; i++) {
            total += cartPrices[i];
        }
        System.out.println("Total (procedural): $" + total);

        System.out.println("\n=== OOP approach ===");
        Product milk = new Product("Milk", 2.50);
        Product bread = new Product("Bread", 1.80);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(milk);
        cart.addProduct(bread);
        System.out.println("Total (OOP): $" + cart.getTotal());
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product p) {
        items.add(p);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}
