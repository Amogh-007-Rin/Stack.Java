// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MinimalSpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(MinimalSpringBootApp.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            System.out.println("Spring Boot application started!");
            System.out.println("Active beans are auto-configured from classpath.");
            if (args.length > 0) {
                System.out.println("Arguments: " + String.join(", ", args));
            }
        };
    }
}
