class LibraryConfig {
    static String libraryName;
    static String address;
    static int maxBooksPerMember;
    static double lateFeePerDay;

    static {
        libraryName = "Central Library";
        address = "123 Main St";
        maxBooksPerMember = 5;
        lateFeePerDay = 0.50;
        System.out.println("[Static Init] LibraryConfig initialized.");
    }

    static void displayConfig() {
        System.out.println("=== Library Configuration ===");
        System.out.println("Name: " + libraryName);
        System.out.println("Address: " + address);
        System.out.println("Max Books Per Member: " + maxBooksPerMember);
        System.out.println("Late Fee Per Day: $" + lateFeePerDay);
    }

    static void updateLateFee(double newFee) {
        if (newFee >= 0) {
            lateFeePerDay = newFee;
            System.out.println("Late fee updated to $" + newFee);
        }
    }
}
