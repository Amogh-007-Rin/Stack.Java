public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", "ACC-1001");
        System.out.println("=== New Account ===");
        acc.display();

        System.out.println("\n=== Deposits and Withdrawals ===");
        acc.deposit(1000);
        acc.deposit(250);
        acc.withdraw(300);
        acc.withdraw(50);
        acc.display();

        System.out.println("\n=== Validation Tests ===");
        try {
            acc.deposit(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            acc.withdraw(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            acc.withdraw(5000);
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
