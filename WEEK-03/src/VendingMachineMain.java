

public class VendingMachineMain{

    public static void main(String args[]){
      
        VendingMachine v1 = new VendingMachine();
        // Return the initial balance
        System.out.println("The initial balance is : " + v1.getBalance());
        System.out.println();
        // Returns the initial Revenue
        System.out.println("The revenue is : " + v1.getRevenue());
        System.out.println();
        // checking if the insert coin function effect of balance and revenue
        System.out.println("initial balance before inserting a coin :" + v1.getBalance());
        System.out.println("Initial revenue before inserting a coin : " + v1.getRevenue());
        // inserting the coin into vending machine
        v1.insertCoin();
        v1.insertCoin();
        v1.insertCoin();
        v1.insertCoin();
        v1.insertCoin();
        v1.insertCoin();
        v1.insertCoin();
        System.out.println(" Balance after inserting a coin :" + v1.getBalance());
        System.out.println(" Revenue after inserting a coin : " + v1.getRevenue());
        System.out.println();
        System.out.println("Inserting a coin to the vending machine increases the balance and the revenue remains the same");
        System.out.println();
        // Refund request
        System.out.println(" Refunding your balance amount ");
        System.out.println("Refund amount : " + v1.refund());
        System.out.println("Your current Balance is : "+ v1.getBalance());
        
        // Vending Candy Bar function checking
        System.out.println(v1.vendCandyBar());
        v1.insertCoin();
        v1.insertCoin();
        v1.insertCoin();
        System.out.println(v1.vendCandyBar());
        

    }
}