public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", "Developer", 85000);
        Employee e2 = new Employee();

        System.out.println("=== Employee 1 ===");
        e1.display();

        System.out.println("\n=== Employee 2 (defaults, then setters) ===");
        e2.display();
        e2.setName("Bob");
        e2.setPosition("Manager");
        e2.setSalary(95000);
        e2.display();
    }
}
