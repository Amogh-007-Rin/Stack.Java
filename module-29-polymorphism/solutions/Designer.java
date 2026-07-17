class Designer extends ExEmployee {

    Designer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is designing.");
    }
}
