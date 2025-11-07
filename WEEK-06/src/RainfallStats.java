// Student : Amogh Dath Kalasapura Arunkumar
// Student Id : 24168333
// Student Email : amoghdath.kalasapuraarunkumar

import java.lang.IllegalStateException;

public class RainfallStats {
    private int count;
    private double total;
    private double max;

    public RainfallStats() {
        count = 0;
        total = 0;
        max = 0;
    }
    
    // This method adds the measurement 
    public void addMeasurement(double measurement) throws InvalidRainfallException {
        if (measurement < 0) {
            throw new InvalidRainfallException("Rainfall measurement cannot be negative");
        }
        
        count++;
        total += measurement;
        
        if (count == 1 || measurement > max) {
            max = measurement;
        }
    }
    
    // This method returns the number of measurements taken 
    public int getCount() {
        return count;
    }
    
    // This method returns the mean value of measurements
    public double getMean() {
        if (count == 0) {
            throw new IllegalStateException("No measurements have been added yet");
        }
        return total / count;
    }
    
    // This method returns the maximum value recorded in the measurements
    public double getMax() {
        if (count == 0) {
            throw new IllegalStateException("No measurements have been added yet");
        }
        return max;
    }
}

