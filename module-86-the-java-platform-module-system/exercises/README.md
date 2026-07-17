# Module 86 Exercises: JPMS

Compile and run using the module path. For all exercises, create the proper directory structure with `module-info.java` files.

## Exercise 1: Calculator Module
Create a named module `calculator` that exports a package `com.stackjava.calculator` containing a `Calculator` class with static methods `add`, `subtract`, `multiply`, `divide`. Compile it with `--module-source-path`.

## Exercise 2: Calculator Consumer
Create a module `app` that `requires calculator` and uses the `Calculator` class to perform a few arithmetic operations. Print the results.

## Exercise 3: Open Module for Reflection
Create a module `person` that **opens** a package `com.stackjava.person` for reflection (containing a `Person` class with private fields). Create a second module `inspector` that uses reflection to read and print the private fields. Demonstrate that `opens` is required for reflection access.
