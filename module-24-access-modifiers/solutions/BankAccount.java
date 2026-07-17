class BankAccount {
    private double balance;
    public String accountHolder;
    String accountNumber;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        logTransaction("DEPOSIT", amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            logTransaction("WITHDRAW", amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    private void logTransaction(String type, double amount) {
        System.out.println("[LOG] " + type + " $" + amount + " | New balance: $" + balance);
    }
}
