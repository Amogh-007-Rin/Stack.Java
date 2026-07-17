interface UtilityInterface {
    default void logInfo(String message) {
        log("INFO", message);
    }

    default void logError(String message) {
        log("ERROR", message);
    }

    private void log(String level, String message) {
        System.out.println("[" + level + "] " + message);
    }

    static boolean isPositive(int value) {
        return value > 0;
    }
}
