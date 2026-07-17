// Student Name : Amogh Dath Kalasapura Arunkumar
// Student Id   : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk
// Submission Date : 31st October 2025

import java.util.HashMap;
import java.util.Map;

public class MapPrinterMain {
    public static void main(String[] args) {
        Map<String, String> phoneContacts = new HashMap<>();

        // FOR INSERTING THE VALUES TO THE PHONECONTACT MAP OBJECT I HAVE INSERTED THE VAUES OF MY FRIENDS PHONE NUMBERS AS A KEY VALUE PAIR.
        System.out.println("==================== INSERTED NAME AND CONTACT NUMBER =========================");

        // Used .put() method to place (key : value) inside the map object created (phoneContacts)
        phoneContacts.put("PARAM PATEL", "9900884993");
        phoneContacts.put("AKASH MOUDGALYA", "9900884333");
        phoneContacts.put("SANJAY R JOIS", "9900887793");
        phoneContacts.put("SANDEEP R JOIS", "9905384993");
        phoneContacts.put("RAJVEER SINGH SAINI", "99008843323");
        
        // Prints only the values of the key
        System.out.println("Printing Keys:");
        MapPrinter.printKeys(phoneContacts);
        
        // Prints only the values of the values
        System.out.println("\nPrinting Values:");
        MapPrinter.printValues(phoneContacts);
        
        // Prints whole key : value pair 
        System.out.println("\nPrinting Pairs:");
        MapPrinter.printPairs(phoneContacts);
    }
}
