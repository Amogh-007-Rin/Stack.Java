import java.lang.reflect.Field;
import java.lang.reflect.Method;

class LegacyClass {
    @Deprecated
    int oldField;

    @Deprecated
    public void oldApi() {
        System.out.println("This is deprecated.");
    }

    public void currentApi() {
        System.out.println("This is current.");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Class<?> clazz = LegacyClass.class;
        System.out.println("Deprecated members of " + clazz.getSimpleName() + ":");

        for (Field f : clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(Deprecated.class)) {
                System.out.println("  Field: " + f.getName());
            }
        }

        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Deprecated.class)) {
                System.out.println("  Method: " + m.getName() + "()");
            }
        }
    }
}
