class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    static class Department {
        private String deptName;

        public Department(String deptName) {
            this.deptName = deptName;
        }

        public void display() {
            System.out.println("Department: " + deptName);
        }
    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        University.Department cs = new University.Department("Computer Science");
        University.Department math = new University.Department("Mathematics");
        cs.display();
        math.display();
    }
}
