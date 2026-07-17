interface DiscountStrategy {
    double applyDiscount(double amount);
}

class RegularDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.05;
    }
}

class VIPDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.15;
    }
}

class SeasonalDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.25;
    }
}

class DiscountCalculator {

    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double amount) {
        return strategy.applyDiscount(amount);
    }
}

public class DiscountCalculatorDemo {

    public static void main(String[] args) {
        double amount = 200.0;

        DiscountCalculator regular = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular discount: $" + regular.calculate(amount));

        DiscountCalculator vip = new DiscountCalculator(new VIPDiscount());
        System.out.println("VIP discount: $" + vip.calculate(amount));

        DiscountCalculator seasonal = new DiscountCalculator(new SeasonalDiscount());
        System.out.println("Seasonal discount: $" + seasonal.calculate(amount));

        DiscountCalculator noDiscount = new DiscountCalculator(a -> 0);
        System.out.println("No discount: $" + noDiscount.calculate(amount));
    }
}
