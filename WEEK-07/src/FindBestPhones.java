public class FindBestPhones {
    
    public static String PHONES_FILE = "WEEK-07\\src\\phone-data.txt";
    
    public static void main(String[] args) {
        // TODO: use the parseFile method to get the phone data from the file
        try {
            PhoneList list = PhoneParser.parseFile(PHONES_FILE);
            
            // TODO: print the model names of all the best phones
            System.out.println("Best (undominated) phones:");
            for (Phone p : list.getBestPhones()) {
                System.out.println(p.getModel());
            }
        } catch (java.io.IOException e) {
            // TODO: handle I/O failures by printing an error message
            System.err.println("Failed to read phones file: " + e.getMessage());
        }
    }
}
