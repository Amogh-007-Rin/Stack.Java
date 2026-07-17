# Module 97: Exercises — Best Practices and Clean Code

## Exercise 1: Refactor Bad Code
Refactor the following code. Apply meaningful names, extract constants, and make the logic clear.
```java
public class Calc {
    public double c(double p, int y) {
        double r = 0.05;
        return p * Math.pow(1 + r / 12, y * 12) - p;
    }
}
```
Write the refactored version as `LoanCalculator.java`.

## Exercise 2: Composition vs Inheritance
The following class uses inheritance in a fragile way. Refactor it to use composition.
```java
import java.util.ArrayList;
class TodoList extends ArrayList<String> {
    public void addTask(String task) { add(task); }
    public void completeTask(int i) { remove(i); }
    public boolean hasTask(String t) { return contains(t); }
}
```
Write the refactored version as `TodoList.java`.

## Exercise 3: Try-with-Resources and Small Methods
Refactor the following method to use try-with-resources and extract helper methods:
```java
public static String[] loadLines(String path) throws IOException {
    java.io.BufferedReader r = new java.io.BufferedReader(new java.io.FileReader(path));
    String first = r.readLine();
    String second = r.readLine();
    r.close();
    return new String[]{first, second};
}
```
Write the refactored version as `FileLoader.java`.
