import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface NotBlank {
    String message() default "must not be blank";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Email {
    String message() default "must be a valid email";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Min {
    long value();
    String message() default "must be at least {value}";
}

record UserDto(
        @NotBlank String name,
        @Email String email,
        @Min(value = 18, message = "must be at least 18") int age
) {
}

class SimpleValidator {
    static List<String> validate(Object obj) throws Exception {
        List<String> violations = new ArrayList<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(obj);

            if (field.isAnnotationPresent(NotBlank.class)) {
                if (value == null || value.toString().isBlank()) {
                    violations.add(field.getName() + " " + field.getAnnotation(NotBlank.class).message());
                }
            }
            if (field.isAnnotationPresent(Email.class)) {
                if (value == null || !value.toString().matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
                    violations.add(field.getName() + " " + field.getAnnotation(Email.class).message());
                }
            }
            if (field.isAnnotationPresent(Min.class)) {
                Min min = field.getAnnotation(Min.class);
                if (value instanceof Number n && n.longValue() < min.value()) {
                    violations.add(field.getName() + " " + min.message().replace("{value}", String.valueOf(min.value())));
                }
            }
        }
        return violations;
    }
}

public class Exercise03ValidatorDemo {
    public static void main(String[] args) throws Exception {
        UserDto valid = new UserDto("Alice", "alice@example.com", 25);
        System.out.println("Valid user violations: " + SimpleValidator.validate(valid));

        UserDto invalid = new UserDto("", "not-an-email", 16);
        System.out.println("Invalid user violations: " + SimpleValidator.validate(invalid));
    }
}
