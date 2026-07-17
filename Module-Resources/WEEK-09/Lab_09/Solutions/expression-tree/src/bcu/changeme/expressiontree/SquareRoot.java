package bcu.changeme.expressiontree;

import java.util.Map;
import java.util.Set;

public class SquareRoot extends Expression {
	private final Expression child;
	
	public SquareRoot(Expression child) {
		this.child = child;
	}
	
	@Override
	public double evaluate(Map<String, Double> variables) {
		double a = child.evaluate(variables);
		return Math.sqrt(a);
	}
	
	@Override
	public Set<String> freeVariables() {
		return child.freeVariables();
	}
}
