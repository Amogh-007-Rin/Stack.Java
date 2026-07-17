public class ProceduralVsOOP {

    static void proceduralLibraryDemo() {
        String[] titles = {"Moby Dick", "1984", "Pride and Prejudice"};
        String[] authors = {"Herman Melville", "George Orwell", "Jane Austen"};
        boolean[] checkedOut = {false, true, false};

        System.out.println("=== Procedural Library ===");
        for (int i = 0; i < titles.length; i++) {
            String status = checkedOut[i] ? "Checked Out" : "Available";
            System.out.println(titles[i] + " by " + authors[i] + " [" + status + "]");
        }
    }

    public static void main(String[] args) {
        proceduralLibraryDemo();

        System.out.println("\n--- Compare with OOP approach ---");
        System.out.println("In OOP, a Book class would bundle title, author,");
        System.out.println("and checkedOut status together, along with methods");
        System.out.println("like checkOut() and returnBook(). See examples in");
        System.out.println("later modules (21-22) for the full OOP version.");
    }
}
