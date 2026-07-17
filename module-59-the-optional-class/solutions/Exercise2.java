import java.util.Map;
import java.util.Optional;

public class Exercise2 {
    public static Optional<String> getConfig(Map<String, String> config, String key) {
        return Optional.ofNullable(config.get(key));
    }

    public static void main(String[] args) {
        Map<String, String> config = Map.of(
            "host", "localhost",
            "port", "3000",
            "debug", "true"
        );

        int port = getConfig(config, "port")
            .map(s -> {
                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    return null;
                }
            })
            .flatMap(Optional::ofNullable)
            .orElse(8080);
        System.out.println("Port: " + port);

        // Test with missing key
        int missingPort = getConfig(config, "db.port")
            .map(s -> {
                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    return null;
                }
            })
            .flatMap(Optional::ofNullable)
            .orElse(8080);
        System.out.println("Missing port (default): " + missingPort);
    }
}
