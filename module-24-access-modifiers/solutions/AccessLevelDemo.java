public class AccessLevelDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Access Modifier Overview ===");
        System.out.println();
        System.out.println("Access Modifier | Same Class | Same Pkg | Subclass | World");
        System.out.println("----------------|------------|----------|----------|-------");
        System.out.println("private         |     Y      |    N     |    N     |   N");
        System.out.println("default         |     Y      |    Y     |    N     |   N");
        System.out.println("protected       |     Y      |    Y     |    Y     |   N");
        System.out.println("public          |     Y      |    Y     |    Y     |   Y");
        System.out.println();
        System.out.println("When to use each:");
        System.out.println("  private   — Fields, helper methods (hide internals)");
        System.out.println("  default   — Package-internal cooperation");
        System.out.println("  protected — Base class members for subclasses");
        System.out.println("  public    — API methods intended for external use");
    }
}
