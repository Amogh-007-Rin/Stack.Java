// Student : Amogh Dath Kalasapura Arunkumar
// Student Id : 24168333
// Student Email : amoghdath.kalasapuraarunkumar

// Added a InvalidRainfallException mainly customized to throw an exception in Rainfall class

public class InvalidRainfallException extends Exception {
    
    public InvalidRainfallException() {
        super();
    }
    
    public InvalidRainfallException(String message) {
        super(message);
    }
}

