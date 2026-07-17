public class IdentifiersDemo {
    public static void main(String[] args) {
        // Valid identifiers
        int count = 10;
        int _temp = 25;
        int $value = 100;
        String firstName = "Bob";
        final int MAX_SIZE = 50;

        System.out.println("count = " + count);
        System.out.println("_temp = " + _temp);
        System.out.println("$value = " + $value);
        System.out.println("firstName = " + firstName);
        System.out.println("MAX_SIZE = " + MAX_SIZE);

        // Demonstrating case sensitivity
        int myVar = 5;
        int myvar = 10;
        System.out.println("myVar = " + myVar + ", myvar = " + myvar);

        // Inline comment showing a keyword
        int result = count + _temp;  // 'int' is a keyword
        System.out.println("result = " + result);
    }
}
