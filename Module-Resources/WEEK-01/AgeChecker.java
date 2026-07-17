import java.util.*;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age!");
        } else if (age < 3) {
            System.out.println("You are an infant.");
        } else if (age >= 3 && age <= 5) {
            System.out.println("You are a toddler.");
        } else if (age >= 5 && age < 12) {
            System.out.println("You are a child.");
        } else if (age >= 12 && age < 18) {
            System.out.println("You are a young adult.");
        } else if (age >= 68) {
            System.out.println("You are a pensioner.");
        } else {
            System.out.println("You are an adult.");
        }

        scanner.close();
    }
}

