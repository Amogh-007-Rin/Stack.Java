public class StudentDemo {
    public static void main(String[] args) {
        StudentWithConstructors s1 = new StudentWithConstructors();
        System.out.println("=== No-Arg Constructor ===");
        s1.displayInfo();

        StudentWithConstructors s2 = new StudentWithConstructors("Alice");
        System.out.println("\n=== Name-Only Constructor ===");
        s2.displayInfo();

        StudentWithConstructors s3 = new StudentWithConstructors("Bob", 22, 'A');
        System.out.println("\n=== Full Constructor ===");
        s3.displayInfo();
    }
}
