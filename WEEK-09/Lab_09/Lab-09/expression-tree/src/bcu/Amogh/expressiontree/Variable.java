package bcu.Amogh.expressiontree;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Variable extends Expression {
    private final String name;

    public Variable(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Variable name cannot be null");
        }
        this.name = name;
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        Double value = variables.get(name);
        if (value == null) {
            throw new IllegalArgumentException("Variable '" + name + "' not assigned");
        }
        return value;
    }

    @Override
    public Set<String> freeVariables() {
        return Collections.singleton(name);
    }
}