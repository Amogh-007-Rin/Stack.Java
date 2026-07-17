public class Exercise4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            p1.setName("Alice");
            p1.setAge(25);
            System.out.println("Person: " + p1.getName() + ", " + p1.getAge());
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Person p2 = new Person();
        try {
            p2.setName("");
            p2.setAge(200);
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) throws ValidationException {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setAge(int age) throws ValidationException {
        if (age < 0 || age > 120) {
            throw new ValidationException("Age must be between 0 and 120: " + age);
        }
        this.age = age;
    }

    public String getName() { return name; }
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
