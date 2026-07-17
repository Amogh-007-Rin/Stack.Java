import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = CustomAnnotationDemo.class;

        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Class authored by: " + author.name() + " (" + author.date() + ")");
        }

        System.out.println("\nAnnotated methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Loggable.class)) {
                Loggable log = m.getAnnotation(Loggable.class);
                System.out.println("  " + m.getName() + " is @Loggable (" + log.value() + ")");
            }
            if (m.isAnnotationPresent(Author.class)) {
                Author a = m.getAnnotation(Author.class);
                System.out.println("  " + m.getName() + " is @Author (" + a.name() + ")");
            }
        }

        System.out.println("\nExecuting @Loggable methods:");
        CustomAnnotationDemo demo = new CustomAnnotationDemo();
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Loggable.class)) {
                System.out.print("  >> Executing " + m.getName() + ": ");
                m.invoke(demo);
            }
        }
    }
}
