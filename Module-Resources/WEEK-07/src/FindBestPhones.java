// Student : Amogh Dath Kalasapura Arunkumar
// Student id : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk

// FindBestPhones class containing the main function
public class FindBestPhones {
    
    // public static String PHONES_FILE = "WEEK-07\\src\\phone-data-short.txt";
    // (When tested with the phone-data-short.txt it returns Samsung Galaxy S8 Plus 
    // Huawei Mate 10 Pro as the best phones)
    
    public static String PHONES_FILE = "WEEK-07\\src\\phone-data.txt";
    
    // When tested with the phone-data.txt it will return the following phones as the best phones
    // Doogee BL12000
    // Xiaomi Mi Max 2 64GB
    // Oukitel K10
    // Asus ZenFone 3 Ultra ZU680KL (4GB RAM), 64GB
    
    public static void main(String[] args) {
        // Todo: use the parseFile method to get the phone data from the file
        try {
            PhoneList list = PhoneParser.parseFile(PHONES_FILE);
            
            // Todo: print the model names of all the best phones
            System.out.println("Best (undominated) phones:");
            for (Phone p : list.getBestPhones()) {
                System.out.println(p.getModel());
            }
        } catch (java.io.IOException e) {
            // Todo: handle I/O failures by printing an error message
            System.err.println("Failed to read phones file: " + e.getMessage());
        }
    }
}
