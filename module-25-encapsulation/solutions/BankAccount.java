class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int transactionCount;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionCount = 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactionCount++;
        System.out.println("Deposited $" + amount + ". Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds. Balance: $" + balance + ", requested: $" + amount);
        }
        balance -= amount;
        transactionCount++;
        System.out.println("Withdrew $" + amount + ". Balance: $" + balance);
    }

    public void display() {
        System.out.println("Account " + accountNumber + " (" + accountHolder + "): $" + balance + " | " + transactionCount + " transactions");
    }
}
