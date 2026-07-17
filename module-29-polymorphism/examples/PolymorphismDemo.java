public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Runtime Polymorphism (Dynamic Method Dispatch) ===");

        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");

        a1.sound();
        a2.sound();

        System.out.println("\n=== Array of Animals ===");
        Animal[] animals = {
            new Dog("Rex"),
            new Cat("Luna"),
            new Dog("Max"),
            new Cat("Oliver")
        };

        for (Animal a : animals) {
            a.sound();
        }

        System.out.println("\n=== instanceof and Casting ===");
        for (Animal a : animals) {
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            } else if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.purr();
            }
        }

        System.out.println("\n=== Compile-Time vs Runtime ===");
        Animal ref = new Dog("Charlie");
        ref.eat();
        ref.sound();
        // ref.fetch();  // Would NOT compile — ref type is Animal, no fetch() method

        System.out.println("\nThe reference type (Animal) determines what you can CALL.");
        System.out.println("The object type (Dog) determines which METHOD runs.");
    }
}
