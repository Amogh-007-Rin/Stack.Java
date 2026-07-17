public class EmployeeDemo {
    public static void main(String[] args) {
        ExEmployee[] team = {
            new Developer("Alice"),
            new Designer("Bob"),
            new ExManager("Charlie"),
            new Developer("Diana")
        };

        System.out.println("=== Polymorphic Work Day ===");
        for (ExEmployee e : team) {
            e.work();
        }

        System.out.println("\n=== Finding the Manager ===");
        for (ExEmployee e : team) {
            if (e instanceof ExManager) {
                System.out.println("Found the manager: " + e.name);
            }
        }
    }
}
