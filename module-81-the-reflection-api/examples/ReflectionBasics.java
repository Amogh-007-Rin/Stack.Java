import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionBasics {
    public static void main(String[] args) throws Exception {
        // Three ways to obtain a Class object
        Class<?> clazz1 = Person.class;
        Class<?> clazz2 = new Person().getClass();
        Class<?> clazz3 = Class.forName("Person");

        System.out.println("Same class? " + (clazz1 == clazz2 && clazz2 == clazz3));

        Person p = new Person("Alice", 30);
        Class<?> clazz = p.getClass();
        System.out.println("Class name: " + clazz.getName());

        System.out.println("\n--- Declared Fields ---");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println("  " + f.getType().getSimpleName() + " " + f.getName());
        }

        System.out.println("\n--- Declared Methods ---");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println("  " + m.getReturnType().getSimpleName() + " " + m.getName() + "()");
        }

        System.out.println("\n--- Constructors ---");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.print("  Person(");
            Class<?>[] params = c.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(params[i].getSimpleName());
            }
            System.out.println(")");
        }
    }
}
