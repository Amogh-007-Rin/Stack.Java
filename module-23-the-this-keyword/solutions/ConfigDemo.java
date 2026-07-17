public class ConfigDemo {
    public static void main(String[] args) {
        ServerConfig config = new ServerConfig();
        config.setHost("localhost")
              .setPort(8080)
              .setTimeout(5000)
              .setUseSSL(true)
              .display();

        ServerConfig config2 = new ServerConfig()
            .setHost("api.example.com")
            .setPort(443)
            .setTimeout(10000)
            .setUseSSL(true);
        config2.display();
    }
}
