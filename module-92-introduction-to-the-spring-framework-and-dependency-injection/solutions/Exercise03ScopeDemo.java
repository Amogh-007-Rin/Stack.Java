import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class ServiceRegistry {
    private Map<Class<?>, Object> singletons = new HashMap<>();

    @SuppressWarnings("unchecked")
    <T> T getSingleton(Class<T> cls, Supplier<T> factory) {
        return (T) singletons.computeIfAbsent(cls, k -> factory.get());
    }
}

class PrototypeFactory {
    <T> T create(Class<T> cls) throws Exception {
        return cls.getDeclaredConstructor().newInstance();
    }
}

class Worker {
    private static int counter = 0;
    private final int id = ++counter;

    int getId() {
        return id;
    }
}

public class Exercise03ScopeDemo {
    public static void main(String[] args) throws Exception {
        ServiceRegistry registry = new ServiceRegistry();
        PrototypeFactory factory = new PrototypeFactory();

        Worker s1 = registry.getSingleton(Worker.class, Worker::new);
        Worker s2 = registry.getSingleton(Worker.class, Worker::new);
        System.out.println("Singleton same instance: " + (s1 == s2));

        Worker p1 = factory.create(Worker.class);
        Worker p2 = factory.create(Worker.class);
        System.out.println("Prototype same instance: " + (p1 == p2));
        System.out.println("Prototype ids differ: " + (p1.getId() != p2.getId()));
    }
}
