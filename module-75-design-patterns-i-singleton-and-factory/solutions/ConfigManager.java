import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private final Map<String, String> properties = new HashMap<>();

    private ConfigManager() {
    }

    private static class Holder {
        private static final ConfigManager INSTANCE = new ConfigManager();
    }

    public static ConfigManager getInstance() {
        return Holder.INSTANCE;
    }

    public void set(String key, String value) {
        properties.put(key, value);
    }

    public String get(String key) {
        return properties.get(key);
    }

    public static void main(String[] args) {
        ConfigManager cm1 = ConfigManager.getInstance();
        ConfigManager cm2 = ConfigManager.getInstance();

        cm1.set("host", "localhost");
        cm1.set("port", "8080");

        System.out.println("cm2 get host: " + cm2.get("host"));
        System.out.println("cm2 get port: " + cm2.get("port"));
        System.out.println("Same instance: " + (cm1 == cm2));
    }
}
