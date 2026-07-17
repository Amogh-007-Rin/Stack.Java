class Developer extends ExEmployee {

    Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is coding.");
    }
}
