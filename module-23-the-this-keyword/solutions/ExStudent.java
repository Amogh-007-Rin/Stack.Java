class ExStudent {
    String name;
    int id;
    double gpa;

    ExStudent() {
        this("Unknown", 0, 0.0);
    }

    ExStudent(String name, int id) {
        this(name, id, 0.0);
    }

    ExStudent(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    void display() {
        System.out.println("ID: " + id + " | " + name + " | GPA: " + gpa);
    }
}
