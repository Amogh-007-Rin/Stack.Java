package bcu.changeme.expressiontree;

import java.util.*;

public class Variable extends Expression {
	private final String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	@Override
	public double evaluate(Map<String, Double> variables) {
		if(!variables.containsKey(name)) {
			String message = name + " not in map " + variables;
			throw new IllegalArgumentException(message);
		}
		return variables.get(name);
	}
	
	@Override
	public Set<String> freeVariables() {
		return Collections.singleton(name);
	}
}
