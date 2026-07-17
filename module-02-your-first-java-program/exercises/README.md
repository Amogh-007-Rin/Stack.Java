# Module 2: Exercises

## Instructions

Complete the following exercises to practice writing Java programs with `main` methods, variables, and output statements.

## Exercises

### Exercise 1: Personalized Greeting (Easy)

Create a file called `PersonalGreeting.java` that declares a `String` variable named `name` containing your first name. Print the message `"Hello, [name]!"` using string concatenation with the `+` operator.

Example output:
```
Hello, Alice!
```

---

### Exercise 2: Banner (Medium)

Create a file called `Banner.java` that prints a decorative banner using three `System.out.println` calls. The output must look exactly like this:

```
******************************
*  Welcome to Stack.Java!    *
******************************
```

Use a `String` variable to store the title text, then print it inside the banner.

---

### Exercise 3: Command-Line Greeting (Hard)

Create a file called `CommandGreeting.java` that reads a name from the command-line argument (`args[0]`) and greets that person. If no argument is provided (check `args.length`), greet `"stranger"`.

Use an `if` statement to check the length of `args`. Use a `String` variable to store the name.

Example runs:
```
$ java CommandGreeting Alice
Hello, Alice!

$ java CommandGreeting
Hello, stranger!
```
