/*
 * Intent: compute a user's display name.
 * Bug: NullPointerException when the middle name is null.
 */
public class NullPointerBugDemo {

    static String formatName(String first, String middle, String last) {
        // BUG: middle could be null; calling toUpperCase() on null throws NPE
        return first + " " + middle.toUpperCase() + " " + last;
    }

    public static void main(String[] args) {
        String result = formatName("John", null, "Doe");
        System.out.println("Formatted name: " + result);
    }
}
