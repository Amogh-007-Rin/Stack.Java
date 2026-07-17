public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "John Doe";
        acc.accountNumber = "ACC-1001";
        acc.balance = 0.0;

        acc.displayBalance();
        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.withdraw(400.0);
        acc.displayBalance();
    }
}
