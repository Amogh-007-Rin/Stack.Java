public class VendingMachine{
    static final int CANDY_PRICE = 3;
    static final int CANDY_CAPACITY = 20;
    
    int candyBars;
    int balance;
    int revenue;
    
    // CONSTRUCTOR 
    VendingMachine() {
        candyBars = CANDY_CAPACITY;
        balance = 0;
        revenue = 0;
    }
    
    // RETURNS THE BALANCE
    int getBalance() {
        return balance;
    }
    
    // RETURNS THE REVENUE
    int getRevenue() {
        return revenue;
    }
    
    // INSERTS A COIN INTO VENDING MACHINE
    void insertCoin() {
        balance++;
    }
    
    // INICIATES THE REFUND OF THE ENTIRE BALANCE LEFT IN THE VENDING MACHINE
    int refund() {
        int amount = balance;
        balance = 0;
        return amount;
    }
    
    // RETURN TRUE IF WE HAVE THE BALANCE TO PURCHASE THE CANDY (MINIMUM BALANCE : 3 COINS) & RETURNS FALSE IF WE DONT HAVE A MINIMUM BALANCE OF THREE COINS TO MAKE THE PURCHASE.
    boolean vendCandyBar() {
        if(candyBars >= 1 && balance >= CANDY_PRICE) {
            candyBars--;
            balance -= CANDY_PRICE;
            revenue += CANDY_PRICE;
            return true;
        } else {
            return false;
        }
    }
    
    // RESTOCKS THE CANDY BALANCE TO INITIAL CANDY BARS PRESENT --> 20 BARS
    void restock() {
        candyBars = CANDY_CAPACITY;
    }
}