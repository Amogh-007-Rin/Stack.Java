import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@interface Author {
    String name();
    String date() default "unknown";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Loggable {
    LogLevel value() default LogLevel.INFO;
}

enum LogLevel { INFO, DEBUG, WARN, ERROR }

@Author(name = "John", date = "2024-01-15")
public class CustomAnnotationDemo {

    @Loggable(LogLevel.DEBUG)
    @Author(name = "Jane")
    public void doWork() {
        System.out.println("Working...");
    }

    @Loggable
    public void doOtherWork() {
        System.out.println("Other work...");
    }

    public void unannotatedMethod() {
        System.out.println("No annotations here.");
    }

    public static void main(String[] args) {
        System.out.println("See AnnotationProcessor to process annotations at runtime.");
    }
}
