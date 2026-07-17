// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exercise01MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(Exercise01MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            String port = System.getProperty("server.port", "8080");
            System.out.println("Application started on port: " + port);
        };
    }

    @Bean
    public String appVersion() {
        return "1.0.0";
    }
}
