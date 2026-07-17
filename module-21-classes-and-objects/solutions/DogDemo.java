public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.breed = "Golden Retriever";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Max";
        dog2.breed = "Beagle";
        dog2.age = 5;

        System.out.println("=== Dog 1 ===");
        dog1.bark();
        dog1.haveBirthday();

        System.out.println("\n=== Dog 2 ===");
        dog2.bark();
        dog2.haveBirthday();
    }
}
