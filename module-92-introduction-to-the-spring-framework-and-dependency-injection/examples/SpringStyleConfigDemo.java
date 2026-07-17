// This example demonstrates Spring concepts but requires Maven/Gradle
// and Spring Boot dependencies to compile and run.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

interface GreetingService {
    String greet(String name);
}

@Component
class EnglishGreeting implements GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}

@Component
class SpanishGreeting implements GreetingService {
    public String greet(String name) {
        return "Hola, " + name + "!";
    }
}

@Component
class Greeter {
    private final GreetingService greeting;

    public Greeter(GreetingService greeting) {
        this.greeting = greeting;
    }

    void greet(String name) {
        System.out.println(greeting.greet(name));
    }
}

@Configuration
@ComponentScan(basePackages = "com.example")
class AppConfig {

    @Bean
    public String appName() {
        return "Spring DI Demo";
    }
}

public class SpringStyleConfigDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Greeter greeter = ctx.getBean(Greeter.class);
        greeter.greet("World");

        String name = ctx.getBean(String.class);
        System.out.println("Application: " + name);

        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
