class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " meows: Meow!");
    }

    void purr() {
        System.out.println(name + " purrs happily.");
    }
}
