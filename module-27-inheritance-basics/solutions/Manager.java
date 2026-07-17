class Manager extends ExEmployee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}
