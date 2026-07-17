public class Exercise04Solution {
    public static void main(String[] args) {
        System.out.println("=== Exercise 4: Maven Dependency Scopes ===");
        System.out.println();
        System.out.println("compile (default):");
        System.out.println("  Available at compile time and runtime.");
        System.out.println("  Example: Apache Commons Lang - you use its classes in your code,");
        System.out.println("  and it must be present when the app runs.");
        System.out.println();
        System.out.println("test:");
        System.out.println("  Available only during test compilation and execution.");
        System.out.println("  Example: JUnit - you only need it to run tests, not in production.");
        System.out.println();
        System.out.println("runtime:");
        System.out.println("  Not needed for compilation but must be present at runtime.");
        System.out.println("  Example: JDBC driver - your code uses java.sql interfaces,");
        System.out.println("  but the actual driver (e.g., MySQL Connector) is only needed at runtime.");
    }
}
