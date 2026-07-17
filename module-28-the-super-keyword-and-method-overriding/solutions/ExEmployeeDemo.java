public class ExEmployeeDemo {
    public static void main(String[] args) {
        ExEmployee emp = new ExEmployee("Alice", 60000);
        ExManager mgr = new ExManager("Bob", 80000, 15000);

        System.out.println("=== Employee Details ===");
        System.out.println("Employee: " + emp.getDetails());
        System.out.println("Manager:  " + mgr.getDetails());

        System.out.println("\nManager's getDetails() calls super.getDetails()");
        System.out.println("then appends bonus and total compensation.");
    }
}
