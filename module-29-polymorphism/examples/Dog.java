class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " barks: Woof!");
    }

    void fetch() {
        System.out.println(name + " fetches the stick.");
    }
}
