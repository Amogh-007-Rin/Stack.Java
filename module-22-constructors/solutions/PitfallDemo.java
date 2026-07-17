class NoNoArg {
    String name;

    NoNoArg(String name) {
        this.name = name;
    }
}

class FixedClass {
    String name;

    FixedClass() {
        this("Default");
    }

    FixedClass(String name) {
        this.name = name;
    }
}

public class PitfallDemo {
    public static void main(String[] args) {
        System.out.println("=== Pitfall Demo ===");

        // The line below would NOT compile if uncommented:
        // NoNoArg n = new NoNoArg();
        // Error: constructor NoNoArg() is undefined
        // Because NoNoArg only has a parameterized constructor,
        // the default no-arg constructor is NOT provided.

        NoNoArg n2 = new NoNoArg("Works");
        System.out.println("Created with parameterized constructor: " + n2.name);

        FixedClass f1 = new FixedClass();
        System.out.println("FixedClass with no-arg: " + f1.name);

        FixedClass f2 = new FixedClass("Custom");
        System.out.println("FixedClass with param: " + f2.name);

        System.out.println("\nLesson: If you define ANY constructor, the default");
        System.out.println("no-arg constructor disappears. Write it explicitly if needed.");
    }
}
