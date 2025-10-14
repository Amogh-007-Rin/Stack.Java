package src;


public class BankAccount {
    private final String accountNumber;
    private final User accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, User accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public User getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit completed successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal completed successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

