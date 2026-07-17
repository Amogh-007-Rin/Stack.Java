class Validator {
    public boolean isValidEmail(String email) {
        class EmailChecker {
            boolean check(String e) {
                return e != null && e.contains("@") && e.contains(".");
            }
        }
        EmailChecker checker = new EmailChecker();
        return checker.check(email);
    }
}

public class Exercise3Solution {
    public static void main(String[] args) {
        Validator v = new Validator();
        System.out.println("test@example.com: " + v.isValidEmail("test@example.com"));
        System.out.println("invalid: " + v.isValidEmail("invalid"));
        System.out.println("null: " + v.isValidEmail(null));
        System.out.println("user@domain: " + v.isValidEmail("user@domain"));
    }
}
