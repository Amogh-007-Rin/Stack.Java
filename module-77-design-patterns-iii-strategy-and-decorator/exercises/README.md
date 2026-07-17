# Module 77: Exercises - Strategy and Decorator

## Exercise 1: Shipping Cost Strategy
Create a `ShippingStrategy` interface with a method `double calculate(double weight)`. Implement `StandardShipping`, `ExpressShipping`, and `InternationalShipping` strategies. Create an `Order` class that uses a shipping strategy. Demonstrate calculating shipping costs for different strategies.

## Exercise 2: Sorting Strategy with Lambdas
Create a list of `Person` objects (name, age, height). Use `Collections.sort()` with different `Comparator` strategies (by name, by age, by height). Use lambda expressions for the strategies. Demonstrate sorting with each strategy.

## Exercise 3: Pizza Decorator
Create a `Pizza` interface with `getDescription()` and `getCost()`. Implement `BasePizza`. Create decorators: `CheeseDecorator`, `PepperoniDecorator`, `OliveDecorator`. Build several pizza combinations and display their descriptions and total costs.

## Exercise 4: Text Processor with Multiple Decorators
Create a `TextProcessor` interface with `String process(String input)`. Implement `BaseTextProcessor`. Create decorators: `UpperCaseDecorator`, `TrimDecorator`, `RemoveExtraSpacesDecorator`. Chain multiple decorators and demonstrate processing text through the chain.
