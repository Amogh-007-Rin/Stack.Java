import org.junit.Test;
import static org.junit.Assert.*;    
    
public class VendingMachineTest {

   @Test
   public void testInitialBalance() {
       // Input: Create new vending machine
       VendingMachine machine = new VendingMachine();
       
       // Action: Get initial balance
       // Expected: Initial balance should be 0
       assertEquals(0, machine.getBalance());
   }

   @Test
   public void testInitialRevenue() {
       // Input: Create new vending machine
       VendingMachine machine = new VendingMachine();
       
       // Action: Get initial revenue
       // Expected: Initial revenue should be 0
       assertEquals(0, machine.getRevenue());
   }

   @Test
   public void testInsertCoin() {
       // Input: Create new vending machine
       VendingMachine machine = new VendingMachine();
       
       // Action: Insert coins
       machine.insertCoin(25);  // Inserted 25 coins into the vending machine
       machine.insertCoin(10);  // Inserted 10 coins into the vending machine
       
       // Expected: Balance should be sum of inserted coins ( 25 + 10 = 35 )
       assertEquals(35, machine.getBalance());
   }

   @Test
   public void testRefund() {
       // Input: Create new vending machine
       VendingMachine machine = new VendingMachine();
       
       // Action: Insert coins and request refund
       machine.insertCoin(25);
       machine.insertCoin(25);
       int refundedAmount = machine.refund();
       
       // Expected: 
       // 1. Refunded amount should equal inserted amount (50)
       // 2. Balance should be 0 after refund
       assertEquals(50, refundedAmount);
       assertEquals(0, machine.getBalance());
   }

   @Test
   public void testVendFailure() {
       // Input: Create new vending machine
       VendingMachine machine = new VendingMachine();
       
       // Action: Try to vend with insufficient balance
       machine.insertCoin(1);  // Insert only 1 coin but it needs 3 coins to vend a candy bar
       boolean result = machine.vendCandyBar();
       
       // Expected:
       // 1. Vend should return false (failure)
       // 2. Balance should remain unchanged
       // 3. Revenue should not increase
       assertFalse(result);
       assertEquals(1, machine.getBalance());
       assertEquals(0, machine.getRevenue());
   }

   @Test
   public void testVendSuccess() {
       // Input: Create new vending machine
       VendingMachine machine = new VendingMachine();
       
       // Action: Insert sufficient coins and vend
       machine.insertCoin(3);  // Quarter
       boolean result = machine.vendCandyBar();

       
       // Expected:
       // 1. Vend should return true (success)
       // 2. Balance should be 0 after successful vend
       // 3. Revenue should increase by vend amount (50)
       assertTrue(result);
       assertEquals(0, machine.getBalance());
       assertEquals(3, machine.getRevenue());
   }

   @Test
   public void testRestock() {
    // Input: Create new vending machine
    VendingMachine machine = new VendingMachine();
    
    // Action: Sell all candy bars and then restock
    // First sell all available candy bars (assuming initial stock is 5)
    for(int i = 0; i < 20; i++) {
        machine.insertCoin(3);  // Insert exact amount needed (3 coins)
        assertTrue(machine.vendCandyBar());  // Verify each sale succeeds
    }
    
    // Try to vend when empty
    machine.insertCoin(3);
    boolean resultBeforeRestock = machine.vendCandyBar();
    
    // Restock the machine
    machine.restock();
    
    // Try to vend after restock
    machine.insertCoin(3);
    boolean resultAfterRestock = machine.vendCandyBar();
    
    // Expected results:
    // 1. Vend should fail when out of stock
    assertFalse(resultBeforeRestock);
    // 2. Vend should succeed after restock
    assertTrue(resultAfterRestock);
    // 3. Balance should be 3 after successful vend
    assertEquals(3, machine.getBalance());
    // 4. Revenue should be 63 (21 successful sales at 3 coins each)
    assertEquals(63, machine.getRevenue());
}
}
