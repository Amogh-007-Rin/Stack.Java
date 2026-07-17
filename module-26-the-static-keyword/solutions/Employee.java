class Employee {
    private String name;
    private int id;
    private static int nextId = 1000;
    private static int employeeCount = 0;

    public Employee(String name) {
        this.name = name;
        this.id = nextId++;
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name);
    }
}
