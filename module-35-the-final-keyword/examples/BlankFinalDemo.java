class Employee {
    private final int employeeId;
    private final String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee #" + employeeId + ": " + name);
    }
}

public class BlankFinalDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice");
        Employee e2 = new Employee(102, "Bob");
        e1.display();
        e2.display();
    }
}
