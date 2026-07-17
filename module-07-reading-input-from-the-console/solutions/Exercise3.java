import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter integers to sum (enter 0 to finish):");

        while (true) {
            System.out.print("> ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value == 0) {
                    break;
                }
                total += value;
            } else {
                String bad = scanner.next();
                System.out.println("Invalid input \"" + bad + "\", try again");
            }
        }

        System.out.println("Total: " + total);
        scanner.close();
    }
}
