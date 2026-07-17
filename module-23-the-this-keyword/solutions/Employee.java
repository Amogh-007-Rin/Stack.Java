class Employee {
    String name;
    String position;
    double salary;

    Employee() {
        this("Unknown", "Unknown", 0.0);
    }

    Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPosition(String position) {
        this.position = position;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " | " + position + " | $" + salary);
    }
}
