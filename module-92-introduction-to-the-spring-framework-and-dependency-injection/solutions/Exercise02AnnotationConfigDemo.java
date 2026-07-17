import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Component {
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Autowired {
}

@Component
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

@Component
class Car {
    @Autowired
    private Engine engine;

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

class SimpleSpringContainer {
    private Map<Class<?>, Object> beans = new HashMap<>();

    void register(Class<?> cls) throws Exception {
        if (!cls.isAnnotationPresent(Component.class)) {
            return;
        }
        Object instance = cls.getDeclaredConstructor().newInstance();
        for (Field field : cls.getDeclaredFields()) {
            if (field.isAnnotationPresent(Autowired.class)) {
                Class<?> dependencyType = field.getType();
                if (!beans.containsKey(dependencyType)) {
                    register(dependencyType);
                }
                field.setAccessible(true);
                field.set(instance, beans.get(dependencyType));
            }
        }
        beans.put(cls, instance);
    }

    @SuppressWarnings("unchecked")
    <T> T getBean(Class<T> cls) {
        return (T) beans.get(cls);
    }
}

public class Exercise02AnnotationConfigDemo {
    public static void main(String[] args) throws Exception {
        SimpleSpringContainer container = new SimpleSpringContainer();
        container.register(Car.class);
        container.register(Engine.class);

        Car car = container.getBean(Car.class);
        car.drive();
    }
}
