import java.util.Scanner;

public class Exercise3Solution {
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

        if (count == 0) {
            System.out.println("No numbers entered. Average is undefined.");
        } else {
            double avg = (double) sum / count;
            System.out.println("Average: " + avg);
        }

        sc.close();
    }
}
