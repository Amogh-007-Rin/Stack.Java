class StringUtils {
    static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    static int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        String lower = input.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

public class UtilityExample {
    public static void main(String[] args) {
        System.out.println("=== Static Utility Methods ===");
        System.out.println("capitalize(\"hello\"): " + StringUtils.capitalize("hello"));
        System.out.println("capitalize(\"JAVA\"): " + StringUtils.capitalize("JAVA"));
        System.out.println("reverse(\"hello\"): " + StringUtils.reverse("hello"));
        System.out.println("countVowels(\"Hello World\"): " + StringUtils.countVowels("Hello World"));

        System.out.println("\nUtility classes (like Math, Collections) group related");
        System.out.println("static methods together without requiring instances.");
    }
}
