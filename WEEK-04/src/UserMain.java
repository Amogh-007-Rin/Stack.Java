// StudentName : Amogh Dath Kalasapura Arunkumar
// StudentId : 24168333
// StudentEmail : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

package src;

public class UserMain {
    public static void main(String args[]) {
        
        // Output record for User.java file
        System.out.println("\n================================================");
        System.out.println("             USER AUTHENTICATION TESTING          ");
        System.out.println("================================================");
        
        User personA = new User("Superman007", "Superman@123");
        System.out.println("\n[USER CREDENTIALS]");
        System.out.println("------------------");
        System.out.println("Username: " + personA.getUsername());
        System.out.println("Password: " + personA.getPassword());
        
        System.out.println("\n[PASSWORD VALIDATION]");
        System.out.println("--------------------");
        System.out.println("Testing correct password: " + personA.checkPassword("Superman@123"));
        System.out.println("Testing wrong password: " + personA.checkPassword("password"));
        
        System.out.println("\n[PASSWORD CHANGE]");
        System.out.println("----------------");
        personA.setPassword("Superman@123", "Batman@123");
        
        // out put record for Bankaccount.java file
        System.out.println("\n================================================");
        System.out.println("              BANK ACCOUNT TESTING               ");
        System.out.println("================================================");
        
        User personB = new User("Spiderman@007", "Spiderman@password");
        BankAccount account1 = new BankAccount("99399288399203", personB);
        
        System.out.println("\n[ACCOUNT DETAILS]");
        System.out.println("------------------");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolder().getUsername());
        System.out.println("Current Balance: £" + String.format("%.2f", account1.getBalance()));
        
        System.out.println("\n[TRANSACTION TESTING]");
        System.out.println("---------------------");
        System.out.println("| DEPOSIT TRANSACTION |");
        account1.deposit(200);
        System.out.println("\n| WITHDRAWAL TRANSACTION |");
        account1.withdraw(10);
        
        System.out.println("\n[FINAL BALANCE SUMMARY]");
        System.out.println("----------------------");
        System.out.println("Final Balance: £" + String.format("%.2f", account1.getBalance()));
        
        System.out.println("\n================================================");
        System.out.println("                 END OF TESTING                  ");
        System.out.println("================================================\n");
    }
}
