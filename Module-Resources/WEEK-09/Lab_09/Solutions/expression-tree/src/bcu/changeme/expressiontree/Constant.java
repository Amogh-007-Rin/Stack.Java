package bcu.changeme.expressiontree;

import java.util.*;

public class Constant extends Expression {
	private final double constant;
	
	public Constant(double constant) {
		this.constant = constant;
	}
	
	@Override
	public double evaluate(Map<String, Double> variables) {
		return constant;
	}
	
	@Override
	public Set<String> freeVariables() {
		return Collections.emptySet();
	}
}
