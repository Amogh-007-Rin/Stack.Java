class ExManager extends ExEmployee {
    private double bonus;

    ExManager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Bonus: $" + bonus + ", Total: $" + (baseSalary + bonus);
    }
}
