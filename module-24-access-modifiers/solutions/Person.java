class Person {
    private String name;
    protected int age;
    public String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
