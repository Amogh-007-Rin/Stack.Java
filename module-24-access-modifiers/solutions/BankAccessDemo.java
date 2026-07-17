public class BankAccessDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", "ACC-1001");

        System.out.println("=== Access Test ===");
        System.out.println("Public accountHolder: " + acc.accountHolder);
        System.out.println("Default accountNumber: " + acc.accountNumber);

        acc.deposit(500);
        acc.withdraw(100);
        System.out.println("Balance via getter: $" + acc.getBalance());

        // Cannot access private field directly:
        // System.out.println(acc.balance);  // Would not compile

        // Cannot call private method:
        // acc.logTransaction("TEST", 0);  // Would not compile

        System.out.println("\nConclusion: public and default fields are accessible.");
        System.out.println("Private fields/methods are NOT accessible from outside the class.");
    }
}
