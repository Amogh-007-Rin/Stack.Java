public class Solution2 {
    static Integer getRating(boolean valid) {
        return valid ? 5 : null;
    }

    public static void main(String[] args) {
        try {
            int rating = getRating(false);
            System.out.println("Rating: " + rating);
        } catch (NullPointerException e) {
            System.out.println("Caught NPE: cannot unbox null Integer to int");
        }

        // Safe way
        Integer boxed = getRating(false);
        if (boxed != null) {
            int safe = boxed;
            System.out.println("Safe unbox: " + safe);
        } else {
            System.out.println("Rating was null, safely handled.");
        }
    }
}
