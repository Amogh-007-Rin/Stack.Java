@FunctionalInterface
interface StringProcessor {
    String process(String input);
}

public class LambdaSyntax {
    public static void main(String[] args) {
        // No parameters
        Runnable greet = () -> System.out.println("Hello from lambda!");
        greet.run();

        // Single parameter, no parentheses needed
        StringProcessor toUpper = s -> s.toUpperCase();
        System.out.println(toUpper.process("hello"));

        // Single parameter with parentheses
        StringProcessor repeat = (s) -> s + s;
        System.out.println(repeat.process("ab"));

        // Multiple parameters — parentheses required
        MathOperation add = (a, b) -> a + b;
        System.out.println("3 + 4 = " + add.operate(3, 4));

        // Multi-statement body — braces and return required
        MathOperation multiplyAndPrint = (x, y) -> {
            int result = x * y;
            System.out.println("Multiplying " + x + " * " + y);
            return result;
        };
        System.out.println("Result: " + multiplyAndPrint.operate(5, 6));

        // Type inference — omit parameter types
        MathOperation subtract = (a, b) -> a - b;
        System.out.println("10 - 3 = " + subtract.operate(10, 3));
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
