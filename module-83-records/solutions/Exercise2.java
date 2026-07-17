record Student(String name, String id, double grade) {

    public Student {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        id = id.toUpperCase();
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "abc123", 92.5);
        System.out.println(s1);

        try {
            new Student("", "xyz", 50);
        } catch (IllegalArgumentException e) {
            System.out.println("Empty name rejected: " + e.getMessage());
        }

        try {
            new Student("Bob", "def456", 101);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid grade rejected: " + e.getMessage());
        }
    }
}
