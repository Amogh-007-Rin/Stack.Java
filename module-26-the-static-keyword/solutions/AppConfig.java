class AppConfig {
    static String appName;
    static String version;
    static boolean debugMode;

    static {
        appName = "MyApp";
        version = "1.0.0";
        debugMode = false;
        System.out.println("[AppConfig] Static init complete.");
    }

    static void setDebugMode(boolean mode) {
        debugMode = mode;
        System.out.println("[AppConfig] Debug mode set to: " + debugMode);
    }

    static boolean isDebugMode() {
        return debugMode;
    }

    static void displayConfig() {
        System.out.println("=== App Config ===");
        System.out.println("Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Debug Mode: " + debugMode);
    }
}
