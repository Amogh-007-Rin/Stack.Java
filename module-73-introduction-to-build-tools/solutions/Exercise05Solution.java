public class Exercise05Solution {
    public static void main(String[] args) {
        System.out.println("=== Exercise 5: Maven vs Gradle ===");
        System.out.println();
        System.out.println("Maven:");
        System.out.println("- XML-based configuration (verbose but predictable)");
        System.out.println("- Strict project structure and lifecycle");
        System.out.println("- Large plugin ecosystem");
        System.out.println("- Good for standard Java projects");
        System.out.println();
        System.out.println("Gradle:");
        System.out.println("- Groovy/Kotlin DSL (concise and programmable)");
        System.out.println("- Faster build times (incremental builds, build daemon)");
        System.out.println("- Highly customizable");
        System.out.println("- Preferred for Android and multi-module projects");
        System.out.println();
        System.out.println("Recommendation:");
        System.out.println("For a new Java project, I would choose Gradle because:");
        System.out.println("1. Faster builds save developer time");
        System.out.println("2. build.gradle is more readable than pom.xml");
        System.out.println("3. Easier to customize build logic without plugins");
        System.out.println("4. Better dependency conflict resolution");
        System.out.println("However, Maven is still very popular in enterprise Java,");
        System.out.println("so familiarity with both is valuable.");
    }
}
