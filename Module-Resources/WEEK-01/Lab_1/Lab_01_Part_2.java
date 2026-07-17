// NAME : AMOGH DATH KALASAPURA
// STUDENT ID : 24168333

import java.util.*;  // This will import all the utilities present in the java frame

public class Lab_01_Part_2 {

    // ===================== Exercise 1 =====================


    static class FreshPrince {
        static void run() {
            // Task 1
            System.out.println("Yo, this is a story all about how");
            System.out.println("My life got flipped, turned upside-down");
            System.out.println("And I'd like to take a minute,");
            System.out.println("just sit right there");
            System.out.println("I'll tell you how I became the prince");
            System.out.println("of a town called Bel-Air");

            // Task 2
            String homeTown = "West Philadelphia";
            String place = "On the playground";
            String activity = "shootin' some b-ball";

            System.out.println();
            System.out.println("In " + homeTown + ", born and raised");
            System.out.println(place + " was where I spent most of my days");
            System.out.println("Chillin' out, maxin', relaxin' all cool");
            System.out.println("And all " + activity + " outside of the school");

            // Task 3
            String newTown = "Bel-Air";
            System.out.println("I’ll tell you how I became the prince of a town called " + newTown);
        }
    }

    // ===================== Exercise 2 =====================


    static class AgeChecker {
        static void run() {
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
        }
    }

    // ===================== Exercise 3 =====================


    static class WhileLoopExample {
        static void run() {
            int n = 3; // start at 3
            while (n <= 2000) {
                System.out.print(n + ". "); // print with dots
                n *= 5; // multiply by 5 instead of 2
            }
            System.out.println();
        }
    }

    // ===================== Exercise 4 =====================


    static class TenGreenBottles {
        static void run() {
            for (int n = 10; n > 0; n--) {
                String word = (n == 1) ? "bottle" : "bottles";
                String nextWord = (n - 1 == 1) ? "bottle" : "bottles";

                System.out.println(n + " green " + word + " hanging on the wall,");
                System.out.println(n + " green " + word + " hanging on the wall,");
                System.out.println("And if one green bottle should accidentally fall,");

                if (n - 1 > 0) {
                    System.out.println("There’ll be " + (n - 1) + " green " + nextWord + " hanging on the wall.");
                } else {
                    System.out.println("There’ll be no green bottles hanging on the wall.");
                }

                System.out.println(); // blank line between verses
            }
        }
    }

    // ===================== MAIN METHOD TO GET THE FINAL OUTPUT =====================


    public static void main(String[] args) {

        // Uncomment the one OF THE FUNCTIONS THAT YOU WANNA TEST TO GET THE DESIRED OUT PUT:
        
        // FreshPrince.run();
        // AgeChecker.run();
        // WhileLoopExample.run();
        TenGreenBottles.run();
    }
}

