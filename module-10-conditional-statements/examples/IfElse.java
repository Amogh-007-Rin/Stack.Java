public class IfElse {
    public static void main(String[] args) {
        int score = 85;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Score: " + score + " -> Grade: " + grade);

        int age = 20;
        boolean hasId = true;

        if (age >= 18) {
            if (hasId) {
                System.out.println("Entry granted");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Underage");
        }
    }
}
