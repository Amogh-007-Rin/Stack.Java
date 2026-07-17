interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {

    private final String name;
    private final String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Credit Card (" + name + ")");
    }
}

class PayPalPayment implements PaymentStrategy {

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal (" + email + ")");
    }
}

class CryptoPayment implements PaymentStrategy {

    private final String walletId;

    public CryptoPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Crypto (wallet: " + walletId + ")");
    }
}

class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("No payment strategy set");
        }
        paymentStrategy.pay(amount);
    }
}

public class StrategyPattern {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("Alice", "1234-5678-9012-3456"));
        cart.checkout(99.99);

        cart.setPaymentStrategy(new PayPalPayment("alice@example.com"));
        cart.checkout(49.99);

        cart.setPaymentStrategy(new CryptoPayment("0xABC123"));
        cart.checkout(0.05);
    }
}
