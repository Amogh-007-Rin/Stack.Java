import java.util.Arrays;

class Student {
    private String name;
    private int id;
    private int[] grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new int[0];
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be 0-100");
        }
        int[] newGrades = Arrays.copyOf(grades, grades.length + 1);
        newGrades[grades.length] = grade;
        grades = newGrades;
    }

    public double getAverage() {
        if (grades.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public void display() {
        System.out.println("Student #" + id + ": " + name + " | Grades: " + Arrays.toString(grades) + " | Avg: " + getAverage());
    }
}
