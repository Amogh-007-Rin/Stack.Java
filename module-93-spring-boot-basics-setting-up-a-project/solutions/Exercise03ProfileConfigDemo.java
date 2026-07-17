interface DataSourceConfig {
    String getUrl();
}

class DevDataSourceConfig implements DataSourceConfig {
    public String getUrl() {
        return "jdbc:h2:mem:devdb";
    }
}

class ProdDataSourceConfig implements DataSourceConfig {
    public String getUrl() {
        return "jdbc:postgresql://prod-server:5432/proddb";
    }
}

class DataSourceFactory {
    static DataSourceConfig getConfig(String profile) {
        if ("prod".equalsIgnoreCase(profile)) {
            return new ProdDataSourceConfig();
        }
        // dev is the default
        return new DevDataSourceConfig();
    }
}

public class Exercise03ProfileConfigDemo {
    public static void main(String[] args) {
        // Simulate reading spring.profiles.active
        String profile = System.getProperty("spring.profiles.active", "dev");
        DataSourceConfig config = DataSourceFactory.getConfig(profile);

        System.out.println("Active profile: " + profile);
        System.out.println("Database URL: " + config.getUrl());
    }
}
