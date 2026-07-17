class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
}
