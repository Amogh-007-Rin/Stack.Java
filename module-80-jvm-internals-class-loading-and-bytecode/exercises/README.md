# Module 80: Exercises - Class Loading and Bytecode

## Exercise 1: javap Analysis
Write a small Java class with a method that uses a loop, a conditional, and a string concatenation. Compile it and run `javap -c` on the `.class` file. In comments inside the Java source, document what each bytecode instruction does.

## Exercise 2: Class.forName() vs ClassLoader.loadClass()
Write a program that loads the same class using both `Class.forName()` and a classloader's `loadClass()` method. Show that `forName()` runs the static initializer but `loadClass()` does not (until the first active use). Use a class with a `static {}` block that prints a message.

## Exercise 3: Custom ClassLoader for Encrypted Classes
Create a custom classloader that reads a simple XOR-encrypted `.class` file, decrypts it, and defines the class. Create a simple `Message` class, encrypt it with XOR, and load/run it using your custom classloader.
