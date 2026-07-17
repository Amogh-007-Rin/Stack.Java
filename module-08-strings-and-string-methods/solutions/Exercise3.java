public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog The dog";
        String[] words = sentence.toLowerCase().split("\\s+");

        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.isEmpty()) continue;

            boolean found = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    counts[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        System.out.println("Word frequencies:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("  " + uniqueWords[i] + ": " + counts[i]);
        }
    }
}
