public class SplitTrim {
    public static void main(String[] args) {
        String data = "  one , two , three , four  ";
        String[] items = data.split(",");

        System.out.println("Without trim:");
        for (String item : items) {
            System.out.println("  [" + item + "]");
        }

        System.out.println("\nWith trim:");
        for (String item : items) {
            System.out.println("  [" + item.trim() + "]");
        }

        String sentence = "The quick brown fox";
        String[] words = sentence.split(" ");
        System.out.println("\nWords: " + words.length);

        String dotData = "www.example.com";
        String[] parts = dotData.split("\\.");  // escape dot
        System.out.println("\nSplit by dot:");
        for (String p : parts) {
            System.out.println("  " + p);
        }
    }
}
