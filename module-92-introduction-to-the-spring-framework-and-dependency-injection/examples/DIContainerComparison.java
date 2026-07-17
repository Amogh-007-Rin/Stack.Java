// Compares three DI approaches in plain Java: manual, annotation-based, and Guice-like

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

// ----- Interfaces -----
interface Logger {
    void log(String message);
}

interface UserRepository {
    String findUser(int id);
}

// ----- Implementations -----
class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

class InMemoryUserRepository implements UserRepository {
    private final Logger logger;

    InMemoryUserRepository(Logger logger) {
        this.logger = logger;
    }

    public String findUser(int id) {
        logger.log("Fetching user " + id);
        return "User" + id;
    }
}

// ----- Mini DI Container (Guice-like) -----
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Injectable {
}

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class MiniContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    void bind(Class<?> cls) {
        try {
            for (Constructor<?> ctor : cls.getConstructors()) {
                if (ctor.isAnnotationPresent(Inject.class)) {
                    Class<?>[] paramTypes = ctor.getParameterTypes();
                    Object[] params = new Object[paramTypes.length];
                    for (int i = 0; i < paramTypes.length; i++) {
                        if (!instances.containsKey(paramTypes[i])) {
                            bind(paramTypes[i]);
                        }
                        params[i] = instances.get(paramTypes[i]);
                    }
                    instances.put(cls, ctor.newInstance(params));
                    return;
                }
            }
            instances.put(cls, cls.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            throw new RuntimeException("Failed to create " + cls.getSimpleName(), e);
        }
    }

    @SuppressWarnings("unchecked")
    <T> T get(Class<T> cls) {
        return (T) instances.get(cls);
    }
}

public class DIContainerComparison {
    public static void main(String[] args) {
        // Approach 1: Manual DI
        System.out.println("=== Manual DI ===");
        Logger logger = new ConsoleLogger();
        UserRepository repo = new InMemoryUserRepository(logger);
        System.out.println(repo.findUser(1));

        // Approach 2: Mini Container (Guice-like)
        System.out.println("=== Mini Container DI ===");
        MiniContainer container = new MiniContainer();
        container.bind(ConsoleLogger.class);
        container.bind(InMemoryUserRepository.class);
        UserRepository repo2 = container.get(UserRepository.class);
        System.out.println(repo2.findUser(2));

        // Approach 3: Reflection-based auto-discovery
        System.out.println("=== Reflection Auto-DI (Spring-like) ===");
        // This mirrors what Spring's IoC container does — scan classpath,
        // find @Component classes, resolve dependencies via constructors.
        // The MiniContainer above shows the conceptual equivalent.
        System.out.println("Spring uses reflection like this, but with rich lifecycle management.");
    }
}
