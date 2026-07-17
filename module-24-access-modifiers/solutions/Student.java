class Student extends Person {
    String studentId;

    Student(String name, int age, String email, String studentId) {
        super(name, age, email);
        this.studentId = studentId;
    }

    void displayAccess() {
        System.out.println("=== Student Access Check ===");
        // System.out.println(name);       // private — NOT accessible
        System.out.println("Name (via getter): " + getName());
        System.out.println("Protected age: " + age);
        System.out.println("Public email: " + email);
        System.out.println("Student ID: " + studentId);
    }
}
