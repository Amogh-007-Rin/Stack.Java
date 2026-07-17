public class PersonDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20, "alice@example.com", "S1001");
        s.displayAccess();

        System.out.println("\n=== Direct access from same package ===");
        System.out.println("Public email: " + s.email);
        System.out.println("Protected age: " + s.age);
        System.out.println("Name via getter: " + s.getName());
    }
}
