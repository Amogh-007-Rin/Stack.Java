// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

package src;

// Bank Account class
public class BankAccount {
    public final String accountNumber;
    public final User accountHolder;
    public double balance;
    
    // Constructor 
    public BankAccount(String accountNumber, User accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
    // Returns the Account Number of the user
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Returns the Details of the account holder
    public User getAccountHolder() {
        return accountHolder;
    }
    
    // Returns the balance of the user account
    public double getBalance() {
        return balance;
    }
    
    // function to make a deposit to user account
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit completed successfully.");
            System.out.println("Deposited: £" + String.format("%.2f", amount));
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    // function to make a withdraw from the user account
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: £" + String.format("%.2f", amount));

        } else {
            System.out.println("Invalid amount.");
        }
    }
    

}