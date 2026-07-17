import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String description();
    int priority() default 5;
}

public class Exercise1 {
    @Todo(description = "Implement login", priority = 1)
    public void login() {
        System.out.println("Login implemented");
    }

    @Todo(description = "Add logout button", priority = 3)
    public void logout() {
        System.out.println("Logout implemented");
    }

    @Todo(description = "Fix minor bug")
    public void fixBug() {
        System.out.println("Bug fixed");
    }

    public static void main(String[] args) {
        System.out.println("Exercise1: @Todo annotation defined and applied.");
    }
}
