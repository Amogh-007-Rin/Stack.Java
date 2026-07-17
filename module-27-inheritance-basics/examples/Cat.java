class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println(name + " meows: Meow!");
    }

    void purr() {
        System.out.println(name + " is purring.");
    }
}
