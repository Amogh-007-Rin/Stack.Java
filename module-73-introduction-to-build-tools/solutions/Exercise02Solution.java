public class Exercise02Solution {
    public static void main(String[] args) {
        System.out.println("=== Exercise 2: Maven POM to Gradle build.gradle ===");
        System.out.println("plugins {");
        System.out.println("    id 'java'");
        System.out.println("}");
        System.out.println();
        System.out.println("group = 'org.myorg'");
        System.out.println("version = '2.1'");
        System.out.println();
        System.out.println("repositories {");
        System.out.println("    mavenCentral()");
        System.out.println("}");
        System.out.println();
        System.out.println("dependencies {");
        System.out.println("    implementation 'org.apache.commons:commons-lang3:3.12.0'");
        System.out.println("}");
    }
}
