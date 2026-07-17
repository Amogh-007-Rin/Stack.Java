public class EmployeeDemo {
    public static void main(String[] args) {
        System.out.println("=== Creating Employees ===");
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        Employee e3 = new Employee("Charlie");

        e1.display();
        e2.display();
        e3.display();

        System.out.println("\nTotal employees: " + Employee.getEmployeeCount());

        Employee e4 = new Employee("Diana");
        System.out.println("\nAfter adding Diana:");
        e4.display();
        System.out.println("Total employees: " + Employee.getEmployeeCount());
    }
}
