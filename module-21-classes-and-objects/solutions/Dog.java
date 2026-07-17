class Dog {
    String name;
    String breed;
    int age;

    void bark() {
        System.out.println("Woof! My name is " + name + ".");
    }

    void haveBirthday() {
        age++;
        System.out.println("Happy birthday, " + name + "! Now " + age + " years old.");
    }
}
