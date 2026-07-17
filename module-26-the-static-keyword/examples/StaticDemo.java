public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("=== Static Initializer Block ===");
        LibraryConfig.displayConfig();

        System.out.println("\n=== Updating Static Data ===");
        LibraryConfig.updateLateFee(1.00);
        LibraryConfig.displayConfig();

        System.out.println("\n=== Math Utility Class ===");
        System.out.println("Math.max(10, 20): " + Math.max(10, 20));
        System.out.println("Math.min(10, 20): " + Math.min(10, 20));
        System.out.println("Math.sqrt(64): " + Math.sqrt(64));
        System.out.println("Math.abs(-42): " + Math.abs(-42));
        System.out.println("Math.random(): " + Math.random());

        System.out.println("\n=== Static vs Instance ===");
        System.out.println("Static members: accessed via ClassName.method()");
        System.out.println("Instance members: accessed via objectReference.method()");
        System.out.println("Static methods CANNOT access 'this' or instance fields.");
    }
}
