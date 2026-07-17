# Module 98: Exercises — Debugging Techniques and Tools

## Exercise 1: Fix the Off-by-One Bug
The following program intends to print all numbers from 1 to 10. Fix the bug.
```java
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
```
Write the fixed version as `PrintNumbers.java`.

## Exercise 2: Fix NullPointerException
The following program crashes with a `NullPointerException`. Fix it without removing the null value.
```java
public class Greeting {
    static String createGreeting(String name, String greeting) {
        return greeting.toUpperCase() + ", " + name + "!";
    }
    public static void main(String[] args) {
        System.out.println(createGreeting("Alice", null));
        System.out.println(createGreeting("Bob", "Hello"));
    }
}
```
Write the fixed version as `Greeting.java`.

## Exercise 3: Fix Division by Zero
The following program crashes when the user enters 0. Fix it by handling the edge case gracefully.
```java
import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter number (-1 to quit): ");
            int n = Integer.parseInt(sc.nextLine());
            if (n == -1) break;
            sum += n;
            count++;
        }
        double avg = sum / count;
        System.out.println("Average: " + avg);
        sc.close();
    }
}
```
Write the fixed version as `AverageCalculator.java`.
