public class Exercise3Solution {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("racecar: " + isPalindrome("racecar"));
        System.out.println("hello: " + isPalindrome("hello"));
        System.out.println("madam: " + isPalindrome("madam"));
        System.out.println("java: " + isPalindrome("java"));
    }
}
