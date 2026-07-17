class ExManager extends ExEmployee {

    ExManager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing.");
    }
}
