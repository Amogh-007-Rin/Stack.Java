abstract class Animal {
    abstract void speak();
}

public class AnonymousExtendsDemo {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void speak() {
                System.out.println("Woof!");
            }
        };

        Animal cat = new Animal() {
            @Override
            void speak() {
                System.out.println("Meow!");
            }
        };

        dog.speak();
        cat.speak();
    }
}
