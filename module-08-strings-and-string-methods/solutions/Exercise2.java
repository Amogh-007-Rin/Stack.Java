public class Exercise2 {
    public static void main(String[] args) {
        String email = "user@example.com";

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        int dotIndex = email.lastIndexOf('.');

        boolean valid = true;

        if (atIndex <= 0 || atIndex != lastAtIndex) {
            valid = false;
        } else if (dotIndex <= atIndex + 1) {
            valid = false;
        } else if (dotIndex == email.length() - 1) {
            valid = false;
        }

        System.out.println(email + " is valid: " + valid);
    }
}
