package bcu.Amogh.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SquareRoot extends Expression {
    private final Expression operand;

    public SquareRoot(Expression operand) {
        this.operand = operand;
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        double val = operand.evaluate(variables);
        return Math.sqrt(val);
    }

    @Override
    public Set<String> freeVariables() {
        return Collections.unmodifiableSet(new HashSet<>(operand.freeVariables()));
    }
}