public class PomStructureDemo {
    public static void main(String[] args) {
        System.out.println("=== Maven POM Structure ===");
        System.out.println("A pom.xml file contains:");
        System.out.println("  <project>         - root element");
        System.out.println("    <modelVersion>  - usually 4.0.0");
        System.out.println("    <groupId>       - organization identifier (e.g., com.mycompany)");
        System.out.println("    <artifactId>    - project name (e.g., my-app)");
        System.out.println("    <version>       - project version (e.g., 1.0-SNAPSHOT)");
        System.out.println("    <dependencies>  - external libraries");
        System.out.println("      <dependency>  - specific dependency");
        System.out.println("        <groupId>   - dependency's org");
        System.out.println("        <artifactId> - dependency name");
        System.out.println("        <version>   - dependency version");
        System.out.println("        <scope>     - compile/test/runtime/provided");
        System.out.println();
        System.out.println("Maven lifecycle phases (in order):");
        String[] phases = {"validate", "compile", "test", "package", "verify", "install", "deploy"};
        for (int i = 0; i < phases.length; i++) {
            System.out.println("  " + (i + 1) + ". " + phases[i]);
        }
    }
}
