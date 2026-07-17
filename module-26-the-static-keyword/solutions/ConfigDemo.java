public class ConfigDemo {
    public static void main(String[] args) {
        System.out.println("=== Initial Config ===");
        AppConfig.displayConfig();

        System.out.println("\n=== Enabling Debug Mode ===");
        AppConfig.setDebugMode(true);
        AppConfig.displayConfig();

        System.out.println("\nDebug mode is: " + AppConfig.isDebugMode());
    }
}
