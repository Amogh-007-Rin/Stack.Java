// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootStartupDemo {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootStartupDemo.class, args);

        System.out.println("ApplicationContext type: " + ctx.getClass().getName());
        System.out.println("Bean count: " + ctx.getBeanDefinitionCount());

        String appName = ctx.getEnvironment().getProperty("spring.application.name");
        System.out.println("Application name: " + appName);
    }

    @Bean
    public String greeting() {
        return "Hello from Spring Boot!";
    }
}
