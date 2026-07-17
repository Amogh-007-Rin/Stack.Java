interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card ending in "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}

class PayPalPayment implements Payment {

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + email);
    }
}

class CryptoPayment implements Payment {

    private final String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " in crypto to wallet " + walletAddress);
    }
}

class PaymentFactory {

    private PaymentFactory() {
    }

    public static Payment createPayment(String type, String details) {
        return switch (type.toLowerCase()) {
            case "creditcard" -> new CreditCardPayment(details);
            case "paypal" -> new PayPalPayment(details);
            case "crypto" -> new CryptoPayment(details);
            default -> throw new IllegalArgumentException("Unknown payment type: " + type);
        };
    }
}

public class PaymentFactoryDemo {

    public static void main(String[] args) {
        Payment cc = PaymentFactory.createPayment("creditcard", "1234567890123456");
        Payment pp = PaymentFactory.createPayment("paypal", "user@example.com");
        Payment cr = PaymentFactory.createPayment("crypto", "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

        cc.pay(49.99);
        pp.pay(89.99);
        cr.pay(0.005);
    }
}
