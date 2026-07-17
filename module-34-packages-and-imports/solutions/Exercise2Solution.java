import com.stackjava.banking.Account;
import com.stackjava.banking.AccountUtils;

public class Exercise2Solution {
    public static void main(String[] args) {
        Account acc = new Account("ACC-12345", 1000.0);
        acc.deposit(500.0);
        acc.withdraw(200.0);
        AccountUtils.printAccount(acc);
    }
}
