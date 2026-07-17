public class Exercise1 {
    public static void main(String[] args) {
        String raw = "A man a plan a canal Panama";
        String cleaned = raw.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        String reversed = sb.reverse().toString();

        boolean isPalindrome = cleaned.equals(reversed);
        System.out.println("\"" + raw + "\" is palindrome: " + isPalindrome);
    }
}
