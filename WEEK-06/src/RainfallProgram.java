// Student : Amogh Dath Kalasapura Arunkumar.
// Student Id : 24168333.
// Student Email : amoghdath.kalasapuraarunkumar.


// imported the scanner class to take rainfall inputs.
import java.util.Scanner; 

// Rainfall Program class.
public class RainfallProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Takes measurements as input
        RainfallStats stats = new RainfallStats(); // Created a stats object of RainfallStats
        
        System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");
        
        // True while loop to continue taking measurement inputs
        while(true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            
            if("end".equalsIgnoreCase(input)) {
                break;
            }
            
            // Try catch method to catch the exceptions thrown.
            try {
                double measurement = Double.parseDouble(input);
                stats.addMeasurement(measurement);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number (enter \"end\" to stop).");
            } catch (InvalidRainfallException e) {
                System.out.println("Measurement must not be negative.");
            }
        }
        
        // prints the number of measurements returned.
        System.out.println(stats.getCount() + " measurement(s) entered.");
        
        // Prints mean and maximum values of the measurements taken only if the measurement counts is greater than . i.e only if any measurements are entered.
        if (stats.getCount() > 0) {
            System.out.printf("Mean rainfall: %.1f mm%n", stats.getMean());
            System.out.printf("Maximum rainfall: %.1f mm%n", stats.getMax());
        }
        
        scanner.close();
    }
}