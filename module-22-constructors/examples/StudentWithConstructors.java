class StudentWithConstructors {
    String name;
    int age;
    char grade;

    StudentWithConstructors() {
        this("Unnamed", 0, 'N');
    }

    StudentWithConstructors(String name) {
        this(name, 0, 'N');
    }

    StudentWithConstructors(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println(name + " | Age: " + age + " | Grade: " + grade);
    }
}
