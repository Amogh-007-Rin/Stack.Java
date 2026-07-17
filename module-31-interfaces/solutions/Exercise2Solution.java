interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new PayPalPayment()
        };

        for (Payment p : payments) {
            p.processPayment(100.0);
        }
    }
}
