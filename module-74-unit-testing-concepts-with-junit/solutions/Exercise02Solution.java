import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

class Exercise02Solution {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
        account.deposit(500);
    }

    @Test
    void withdrawReducesBalance() {
        account.withdraw(100);
        assertEquals(400, account.getBalance(), 0.001);
    }

    @Test
    void withdrawNegativeAmountThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(-50));
    }

    @Test
    void withdrawZeroAmountThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(0));
    }

    @Test
    void withdrawOverBalanceThrows() {
        assertThrows(IllegalStateException.class,
                () -> account.withdraw(600));
    }

    @Test
    void depositIncreasesBalance() {
        account.deposit(200);
        assertEquals(700, account.getBalance(), 0.001);
    }

    @Test
    void depositNegativeAmountThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-10));
    }
}
