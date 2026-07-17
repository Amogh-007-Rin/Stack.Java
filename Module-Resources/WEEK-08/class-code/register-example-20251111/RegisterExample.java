public class RegisterExample {
    public static String getExampleNames(Register register) {
        try {
            register.addName("Alice");
            register.addName("Bob");
            register.addName("Charles");
            return register.getNames().toString();
        } catch(AlreadyPresentException ex) {
            // should never happen; convert to unchecked exception
            throw new RuntimeException(ex); 
        }
    }
}
