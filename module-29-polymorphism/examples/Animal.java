class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes a sound.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}
