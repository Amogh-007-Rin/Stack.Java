sealed interface Expression permits Constant, Addition, Multiplication {
    int evaluate();
}

record Constant(int value) implements Expression {
    @Override
    public int evaluate() { return value; }
}

record Addition(Expression left, Expression right) implements Expression {
    @Override
    public int evaluate() { return left.evaluate() + right.evaluate(); }
}

record Multiplication(Expression left, Expression right) implements Expression {
    @Override
    public int evaluate() { return left.evaluate() * right.evaluate(); }
}

public class SealedInterfaceDemo {
    public static void main(String[] args) {
        Expression expr = new Addition(
            new Multiplication(new Constant(3), new Constant(4)),
            new Constant(5)
        );
        System.out.println("(3 * 4) + 5 = " + expr.evaluate());

        Expression expr2 = new Multiplication(
            new Constant(2),
            new Addition(new Constant(3), new Constant(4))
        );
        System.out.println("2 * (3 + 4) = " + expr2.evaluate());
    }
}
