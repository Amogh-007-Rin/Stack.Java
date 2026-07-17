public class VisibilityTable {
    public static void main(String[] args) {
        System.out.println("=== Java Access Modifier Visibility Table ===");
        System.out.println("Modifier    | Same Class | Same Pkg | Subclass | Anywhere");
        System.out.println("------------|------------|----------|----------|---------");
        System.out.println("private     |    Yes     |    No    |    No    |    No");
        System.out.println("default     |    Yes     |    Yes   |    No    |    No");
        System.out.println("protected   |    Yes     |    Yes   |    Yes   |    No");
        System.out.println("public      |    Yes     |    Yes   |    Yes   |    Yes");

        System.out.println("\n=== Best Practice ===");
        System.out.println("1. Start with private — increase visibility only when needed.");
        System.out.println("2. Fields should almost always be private.");
        System.out.println("3. Public methods define the class API.");
        System.out.println("4. Protected is for inheritance contracts.");
        System.out.println("5. Default is useful for internal package cooperation.");
    }
}
