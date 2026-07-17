public class Exercise1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        System.out.println("Balance: $" + account.getBalance());

        try {
            account.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(200);
            System.out.println("New balance: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient funds. Balance: $" + balance + ", Requested: $" + amount
            );
        }
        balance -= amount;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
