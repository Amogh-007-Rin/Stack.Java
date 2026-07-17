class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    class Account {
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void display() {
            System.out.println("Bank: " + bankName + ", Account: " + accountNumber + ", Balance: $" + balance);
        }
    }
}

public class Exercise2Solution {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Bank.Account acc = bank.new Account("ACC-001", 5000.0);
        acc.display();
    }
}
