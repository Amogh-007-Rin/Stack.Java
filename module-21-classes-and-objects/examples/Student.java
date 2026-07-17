class Student {
    String name;
    int age;
    char grade;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    void promote() {
        if (grade == 'A') {
            System.out.println(name + " is already at the top grade.");
        } else if (grade == 'B') {
            grade = 'A';
            System.out.println(name + " promoted to A!");
        } else if (grade == 'C') {
            grade = 'B';
            System.out.println(name + " promoted to B!");
        } else {
            grade = 'C';
            System.out.println(name + " promoted to C!");
        }
    }
}
