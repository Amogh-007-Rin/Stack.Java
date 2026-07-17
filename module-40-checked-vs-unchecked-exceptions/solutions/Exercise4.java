import java.io.*;

public class Exercise4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Balance: $" + account.getBalance());

        try {
            account.withdraw(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        try {
            account.withdraw(200);
            System.out.println("After withdrawal: $" + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        try {
            account.saveToFile("account.txt");
        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public void saveToFile(String filename) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(filename));
        writer.println("Balance: " + balance);
        writer.close();
        System.out.println("Saved to " + filename);
    }
}
