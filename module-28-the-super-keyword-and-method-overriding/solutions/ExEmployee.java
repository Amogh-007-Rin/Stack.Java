class ExEmployee {
    protected String name;
    protected double baseSalary;

    ExEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: $" + baseSalary;
    }
}
