sealed interface Operation permits Add, Subtract, Multiply, Divide {
    int apply(int a, int b);
}

record Add() implements Operation {
    @Override
    public int apply(int a, int b) { return a + b; }
}

record Subtract() implements Operation {
    @Override
    public int apply(int a, int b) { return a - b; }
}

record Multiply() implements Operation {
    @Override
    public int apply(int a, int b) { return a * b; }
}

record Divide() implements Operation {
    @Override
    public int apply(int a, int b) { return a / b; }
}

public class Exercise3 {
    static int calculate(int a, int b, Operation op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        System.out.println("10 + 5 = " + calculate(10, 5, new Add()));
        System.out.println("10 - 5 = " + calculate(10, 5, new Subtract()));
        System.out.println("10 * 5 = " + calculate(10, 5, new Multiply()));
        System.out.println("10 / 5 = " + calculate(10, 5, new Divide()));
    }
}
