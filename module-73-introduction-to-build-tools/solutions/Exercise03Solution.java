public class Exercise03Solution {
    public static void main(String[] args) {
        System.out.println("=== Exercise 3: Maven Lifecycle Order ===");
        String[] phases = {"validate", "compile", "test", "package", "install", "deploy"};
        for (int i = 0; i < phases.length; i++) {
            System.out.println((i + 1) + ". " + phases[i]);
        }
        System.out.println();
        System.out.println("Note: 'verify' phase comes between 'test' and 'package' in the full default lifecycle, but the standard order is:");
        System.out.println("validate -> compile -> test -> package -> verify -> install -> deploy");
    }
}
