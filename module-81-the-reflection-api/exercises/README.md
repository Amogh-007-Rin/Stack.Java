# Module 81 Exercises: The Reflection API

Compile with `javac *.java` and run with `java <ExerciseN>`.

## Exercise 1: Field Inspector
Write a method `printAllFields(Object obj)` that prints every field name, its type, and its current value for the given object. Include private fields. Test it with a `Person` instance.

**Example output:**
```
Fields of Person:
  String name = Alice
  int age = 30
```

## Exercise 2: Private Method Invoker
Write a program that uses reflection to invoke the private method `sayHello()` on a `Person` instance. Handle the necessary exceptions.

## Exercise 3: Dynamic Instance Creator
Write a program that reads a fully qualified class name from the command line, then uses `Class.forName()` and reflection to create a new instance (using the no-arg constructor). Print the created object.

**Example:**
```
java Exercise3 Person
```
