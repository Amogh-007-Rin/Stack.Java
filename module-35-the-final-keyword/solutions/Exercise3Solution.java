final class StringUtils {
    public static final String EMPTY = "";

    public static boolean isBlank(String s) {
        return s == null || s.isBlank();
    }

    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }
}

public class Exercise3Solution {
    public static void main(String[] args) {
        System.out.println("Is 'hello' blank? " + StringUtils.isBlank("hello"));
        System.out.println("Is '' blank? " + StringUtils.isBlank(""));
        System.out.println("Reverse of 'hello': " + StringUtils.reverse("hello"));
        System.out.println("Reverse of 'Java': " + StringUtils.reverse("Java"));
    }
}
