public class ValidationExample {
    public static void main(String[] args) {
        System.out.println("=== Validation with Custom Exceptions ===");
        User user = new User();

        try {
            user.setEmail("invalid-email");
        } catch (ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        try {
            user.setAge(-1);
        } catch (ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

        try {
            user.setEmail("user@example.com");
            user.setAge(25);
            System.out.println("User valid: " + user.getEmail() + ", " + user.getAge());
        } catch (ValidationException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

class User {
    private String email;
    private int age;

    public void setEmail(String email) throws ValidationException {
        if (email == null || !email.contains("@")) {
            throw new ValidationException("Invalid email: " + email);
        }
        this.email = email;
    }

    public void setAge(int age) throws ValidationException {
        if (age < 0 || age > 150) {
            throw new ValidationException("Age must be between 0 and 150: " + age);
        }
        this.age = age;
    }

    public String getEmail() { return email; }
    public int getAge() { return age; }
}

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
