public class ExStudentDemo {
    public static void main(String[] args) {
        ExStudent s1 = new ExStudent();
        System.out.println("=== No-Arg ===");
        s1.display();

        ExStudent s2 = new ExStudent("Alice", 1001);
        System.out.println("\n=== Name + ID ===");
        s2.display();

        ExStudent s3 = new ExStudent("Bob", 1002, 3.8);
        System.out.println("\n=== Full Constructor ===");
        s3.display();
    }
}
