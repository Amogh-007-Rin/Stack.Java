public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice", 1001);

        System.out.println("=== Adding Grades ===");
        s.addGrade(85);
        s.addGrade(92);
        s.addGrade(78);
        s.display();

        System.out.println("\n=== Getter Returns Copy ===");
        int[] gradesCopy = s.getGrades();
        gradesCopy[0] = 0;
        System.out.println("Modified copy[0] to 0, but original is unaffected:");
        s.display();

        System.out.println("\n=== Validation Test ===");
        try {
            s.addGrade(105);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
