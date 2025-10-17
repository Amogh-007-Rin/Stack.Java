package Lab_03;
// NAME : AMOGH DATH KALASAPURA
// STUDENT ID : 24168333

public class VendingMachineMain {
    
    public static void main(String args[]) {
        System.out.println("\n=============== VENDING MACHINE MANUAL TESTING ===============\n");
        
        // Create new vending machine instance
        VendingMachine v1 = new VendingMachine();
        
        // Test Case 1: Initial State
        System.out.println("TEST CASE 1: Initial State");
        System.out.println("-------------------------");
        System.out.println("Initial balance: " + v1.getBalance() + " coins");
        System.out.println("Initial revenue: " + v1.getRevenue() + " coins");
        System.out.println();
        
        // Test Case 2: Inserting Coins
        System.out.println("TEST CASE 2: Inserting Coins");
        System.out.println("--------------------------");
        System.out.println("Before insertion:");
        System.out.println("Balance: " + v1.getBalance() + " coins");
        v1.insertCoin(3);
        System.out.println("After inserting 3 coins:");
        System.out.println("Balance: " + v1.getBalance() + " coins");
        System.out.println();
        
        // Test Case 3: Refund Operation
        System.out.println("TEST CASE 3: Refund Operation");
        System.out.println("---------------------------");
        System.out.println("Balance before refund: " + v1.getBalance() + " coins");
        int refundAmount = v1.refund();
        System.out.println("Refunded amount: " + refundAmount + " coins");
        System.out.println("Balance after refund: " + v1.getBalance() + " coins");
        System.out.println();
        
        // Test Case 4: Vending Operation - Insufficient Funds
        System.out.println("TEST CASE 4: Vending (Insufficient Funds)");
        System.out.println("-------------------------------------");
        System.out.println("Attempting to vend with no coins:");
        boolean vendResult1 = v1.vendCandyBar();
        System.out.println("Vend successful? " + vendResult1);
        System.out.println();
        
        // Test Case 5: Successful Vending
        System.out.println("TEST CASE 5: Successful Vending");
        System.out.println("----------------------------");
        System.out.println("Inserting 3 coins...");
        v1.insertCoin(3);
        System.out.println("Current balance: " + v1.getBalance() + " coins");
        boolean vendResult2 = v1.vendCandyBar();
        System.out.println("Vend successful? " + vendResult2);
        System.out.println("Remaining balance: " + v1.getBalance() + " coins");
        System.out.println("Current revenue: " + v1.getRevenue() + " coins");
        System.out.println();
        
        // Test Case 6: Stock Management
        System.out.println("TEST CASE 6: Stock Management");
        System.out.println("--------------------------");
        System.out.println("Attempting to buy out all stock...");
        for(int i = 0; i < 6; i++) {
            v1.insertCoin(3);
            boolean result = v1.vendCandyBar();
            System.out.println("Purchase " + (i+1) + " successful? " + result);
        }
        System.out.println("Final revenue: " + v1.getRevenue() + " coins");
        
        System.out.println("\n=============== END OF TESTING ===============\n");
    }
}