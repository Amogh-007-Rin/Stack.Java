class Developer extends ExEmployee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}
