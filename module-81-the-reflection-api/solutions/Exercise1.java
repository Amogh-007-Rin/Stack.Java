import java.lang.reflect.Field;

public class Exercise1 {
    public static void main(String[] args) {
        printAllFields(new Person("Alice", 30));
    }

    public static void printAllFields(Object obj) {
        Class<?> clazz = obj.getClass();
        System.out.println("Fields of " + clazz.getSimpleName() + ":");
        for (Field f : clazz.getDeclaredFields()) {
            f.setAccessible(true);
            try {
                System.out.println("  " + f.getType().getSimpleName() + " " + f.getName() + " = " + f.get(obj));
            } catch (IllegalAccessException e) {
                System.out.println("  " + f.getType().getSimpleName() + " " + f.getName() + " = <inaccessible>");
            }
        }
    }
}
