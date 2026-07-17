interface ShippingStrategy {
    double calculate(double weight);
}

class StandardShipping implements ShippingStrategy {

    @Override
    public double calculate(double weight) {
        return weight * 1.5;
    }
}

class ExpressShipping implements ShippingStrategy {

    @Override
    public double calculate(double weight) {
        return weight * 3.0 + 5.0;
    }
}

class InternationalShipping implements ShippingStrategy {

    @Override
    public double calculate(double weight) {
        return weight * 5.0 + 10.0;
    }
}

class Order {

    private final double weight;
    private ShippingStrategy shippingStrategy;

    public Order(double weight) {
        this.weight = weight;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double getShippingCost() {
        if (shippingStrategy == null) {
            throw new IllegalStateException("No shipping strategy set");
        }
        return shippingStrategy.calculate(weight);
    }
}

public class ShippingStrategyDemo {

    public static void main(String[] args) {
        Order order = new Order(2.5);

        order.setShippingStrategy(new StandardShipping());
        System.out.println("Standard shipping: $" + order.getShippingCost());

        order.setShippingStrategy(new ExpressShipping());
        System.out.println("Express shipping: $" + order.getShippingCost());

        order.setShippingStrategy(new InternationalShipping());
        System.out.println("International shipping: $" + order.getShippingCost());
    }
}
