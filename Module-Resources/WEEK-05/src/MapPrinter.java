// Student Name : Amogh Dath Kalasapura Arunkumar
// Student Id   : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk
// Submission Date : 31st October 2025

import java.util.Map;

// MapPrinter Class
public class MapPrinter {
	
    // Static Methods to print values of (keyset) stored inside the MapPrinter object
    public static void printKeys(Map<String, String> map) {
		for (String key : map.keySet()) {
			System.out.println("Key: " + key);
		}
	}
    
    // Static Methods to print values of (value set) stored in the MapPrinter object
	public static void printValues(Map<String, String> map) {
		for (String value : map.values()) {
			System.out.println("Value: " + value);
		}
	}
    
    // Static Method to print (key : values) pair stored inside the MapPrinter object
	public static void printPairs(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}