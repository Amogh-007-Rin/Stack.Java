public class ExEmployeeDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 90000);
        Developer dev = new Developer("Bob", 85000, "Java");

        System.out.println("=== Employees at Work ===");
        mgr.work();
        dev.work();
    }
}
