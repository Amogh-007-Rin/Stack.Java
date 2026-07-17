@FunctionalInterface
interface Greeter {
    String greet(String name);
}

public class VariableCapture {
    private String instancePrefix = "Hello";

    public void demonstrateCapture() {
        // Local variable — effectively final
        String suffix = "!";

        Greeter greeter = (name) -> instancePrefix + " " + name + suffix;
        System.out.println(greeter.greet("Alice"));

        // Instance variable can be mutated (but not local)
        instancePrefix = "Hi";
        System.out.println(greeter.greet("Bob"));

        // Uncommenting the next line would cause a compile error:
        // suffix = "!!";
    }

    public static void main(String[] args) {
        new VariableCapture().demonstrateCapture();

        // Capturing a local variable that changes — illegal
        int factor = 10;
        MathOp op = (a, b) -> (a + b) * factor;
        System.out.println("(3+4)*10 = " + op.operate(3, 4));

        // factor = 20;  // Not allowed — would break effectively final
    }
}

@FunctionalInterface
interface MathOp {
    int operate(int a, int b);
}
