enum PizzaSize {
    SMALL(8.99),
    MEDIUM(11.99),
    LARGE(14.99);

    private final double price;

    PizzaSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return name() + " pizza: $" + price;
    }
}

public class Exercise3Solution {
    public static void main(String[] args) {
        for (PizzaSize size : PizzaSize.values()) {
            System.out.println(size.getDescription());
        }

        PizzaSize order = PizzaSize.MEDIUM;
        switch (order) {
            case SMALL:
                System.out.println("Good for one person");
                break;
            case MEDIUM:
                System.out.println("Good for two people");
                break;
            case LARGE:
                System.out.println("Good for a group");
                break;
        }
    }
}
