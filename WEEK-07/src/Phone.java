// Student : Amogh Dath Kalasapura Arunkumar
// Student id : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk


// Implimented the mentioned todo sections of the Phone class
public class Phone {
    private final String model;
    private final double screenSize;
    private final int batteryCapacity;
    
    public Phone(String model, double screenSize, int batteryCapacity) {
        // Todo: ensure the screenSize and batteryCapacity are positive
        // by throwing an IllegalArgumentException otherwise
        
        if (screenSize <= 0.0) {
            throw new IllegalArgumentException("Condition : screenSize must be positive");
        }
        if (batteryCapacity <= 0) {
            throw new IllegalArgumentException("Condition : batteryCapacity must be positive");
        }
        
        this.model = model;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }
    
    /*
     * Gets the phone's model name.
     */
    public String getModel() {
        return model; 
    }
    
    /*
     * Gets the phone's diagonal screen size (in inches).
     */
    public double getScreenSize() {
        return screenSize;
    }
    
    /*
     * Gets the phone's battery capacity (in mAh).
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    
    /*
     * Determines whether this phone "dominates" another phone, meaning
     * this phone is better in one criterion, and at least as good in the
     * other criterion.
     */
    public boolean dominates(Phone other) {
        // Todo: implement this method
        // dominates if strictly better in one metric and >= in the other
        boolean strictlyBetterInScreen = this.screenSize > other.screenSize;
        boolean strictlyBetterInBattery = this.batteryCapacity > other.batteryCapacity;
        boolean atLeastAsGoodInBoth = this.screenSize >= other.screenSize && this.batteryCapacity >= other.batteryCapacity;
        
        return atLeastAsGoodInBoth && (strictlyBetterInScreen || strictlyBetterInBattery);
    }
}
