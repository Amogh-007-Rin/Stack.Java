public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.grade = 'B';

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.grade = 'A';

        System.out.println("=== Student 1 ===");
        s1.displayInfo();
        System.out.println();

        System.out.println("=== Student 2 ===");
        s2.displayInfo();
        System.out.println();

        System.out.println("=== Promoting Alice ===");
        s1.promote();
        s1.displayInfo();

        System.out.println("\n=== Reference Demo ===");
        Student s3 = s1;
        System.out.println("s3.name = " + s3.name + " (s3 references same object as s1)");
        s3.name = "Alice (modified via s3)";
        System.out.println("s1.name after s3 modified it: " + s1.name);
    }
}
