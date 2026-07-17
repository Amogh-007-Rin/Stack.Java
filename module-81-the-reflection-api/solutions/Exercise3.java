import java.lang.reflect.Constructor;

public class Exercise3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Exercise3 <fully-qualified-class-name>");
            return;
        }
        try {
            Class<?> clazz = Class.forName(args[0]);
            Constructor<?> cons = clazz.getDeclaredConstructor();
            Object instance = cons.newInstance();
            System.out.println("Created instance: " + instance);
        } catch (Exception e) {
            System.out.println("Failed to create instance: " + e.getMessage());
        }
    }
}
