import java.lang.reflect.Method;

public class Exercise2 {
    public static void main(String[] args) {
        Class<?> clazz = Exercise1.class;
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println("TODO on " + m.getName()
                    + ": " + todo.description()
                    + " (priority: " + todo.priority() + ")");
            }
        }
    }
}
