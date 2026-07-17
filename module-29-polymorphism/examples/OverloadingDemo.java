class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        System.out.println("=== Compile-Time Polymorphism (Overloading) ===");

        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(int, int, int): " + calc.add(10, 20, 30));
        System.out.println("add(double, double): " + calc.add(10.5, 20.3));
        System.out.println("add(String, String): " + calc.add("Hello ", "World"));

        System.out.println("\nThe correct overload is chosen at COMPILE TIME");
        System.out.println("based on the argument types and count.");
    }
}
