public class GradleConceptsDemo {
    public static void main(String[] args) {
        System.out.println("=== Gradle Build Structure ===");
        System.out.println("A build.gradle file is written in Groovy or Kotlin DSL.");
        System.out.println();
        System.out.println("Key Gradle concepts:");
        System.out.println("  plugins { }     - apply plugins (Java, Spring, etc.)");
        System.out.println("  repositories { } - where to find dependencies (mavenCentral())");
        System.out.println("  dependencies { } - declare libraries");
        System.out.println("    implementation 'group:name:version'");
        System.out.println("    testImplementation 'group:name:version'");
        System.out.println();
        System.out.println("Gradle vs Maven comparison:");
        System.out.println("  Aspect       | Maven                    | Gradle");
        System.out.println("  -------------------------------------------------");
        System.out.println("  Config file  | pom.xml (XML)            | build.gradle (Groovy/Kotlin)");
        System.out.println("  Performance  | Slower (fixed phases)    | Faster (incremental, daemon)");
        System.out.println("  Flexibility  | Rigid structure          | Highly customizable");
        System.out.println("  Learning     | Easy (declarative)       | Steeper (programmable)");
        System.out.println("  Convention   | Strict project structure | Flexible but has defaults");
        System.out.println();
        System.out.println("Both Maven and Gradle use standard Java project layout:");
        System.out.println("  src/main/java/     - production source");
        System.out.println("  src/main/resources/ - configuration files");
        System.out.println("  src/test/java/     - test source");
    }
}
