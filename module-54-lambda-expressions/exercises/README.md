# Module 54 Exercises

## Exercise 1: String Transformer (Easy)

Define a functional interface `StringTransformer` with a method `String transform(String s)`. In `main`, create lambdas that:
- Convert the string to uppercase
- Reverse the string using `new StringBuilder(s).reverse().toString()`
- Strip whitespace from both ends

Test each lambda with the string `"  Hello World  "`.

## Exercise 2: Numeric Filter (Medium)

Define a functional interface `IntPredicate` (do NOT use `java.util.function.Predicate`) with a method `boolean test(int n)`. Write a method `static List<Integer> filter(List<Integer> values, IntPredicate predicate)` that returns a new list of matching values. In `main`, create lambdas to filter:
- Even numbers
- Numbers greater than 10
- Numbers between 5 and 15 (inclusive)

Test with `Arrays.asList(3, 10, 7, 15, 22, 8, 1)`.

## Exercise 3: Command Pattern (Hard)

Define a functional interface `Command` with `void execute()`. Write a `CommandRunner` class that stores a `List<Command>` and provides methods `addCommand(Command cmd)` and `runAll()`. In `main`:
- Create 3 commands using lambdas that print different messages
- Add them to the runner
- Invoke `runAll()`
- Demonstrate variable capture: use an effectively final counter so each command prints its index (1, 2, 3) alongside its message.
