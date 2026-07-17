abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculatePay();

    public void displayInfo() {
        System.out.println("Employee: " + name + ", Pay: $" + calculatePay());
    }
}

class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return baseSalary / 12;
    }
}

class HourlyEmployee extends Employee {
    private int hoursWorked;

    public HourlyEmployee(String name, double baseSalary, int hoursWorked) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return baseSalary * hoursWorked;
    }
}

public class Exercise1Solution {
    public static void main(String[] args) {
        Employee sally = new SalariedEmployee("Alice", 60000);
        Employee hourly = new HourlyEmployee("Bob", 25, 80);

        sally.displayInfo();
        hourly.displayInfo();
    }
}
