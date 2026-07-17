public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demo ===");

        Animal generic = new Animal("Generic Animal", 1);
        generic.eat();
        generic.sleep();
        generic.sound();

        System.out.println();

        Dog dog = new Dog("Buddy", 3);
        dog.eat();
        dog.sleep();
        dog.sound();
        dog.fetch();

        System.out.println();

        Cat cat = new Cat("Whiskers", 2);
        cat.eat();
        cat.sleep();
        cat.sound();
        cat.purr();

        System.out.println("\n=== IS-A Test ===");
        System.out.println("Dog IS-A Animal: " + (dog instanceof Animal));
        System.out.println("Cat IS-A Animal: " + (cat instanceof Animal));
        System.out.println("Dog IS-A Dog: " + (dog instanceof Dog));
        System.out.println("Cat IS-A Cat: " + (cat instanceof Cat));
    }
}
