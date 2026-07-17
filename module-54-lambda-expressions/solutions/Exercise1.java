@FunctionalInterface
interface StringTransformer {
    String transform(String s);
}

public class Exercise1 {
    public static void main(String[] args) {
        String test = "  Hello World  ";

        StringTransformer toUpper = s -> s.toUpperCase();
        StringTransformer reverser = s -> new StringBuilder(s).reverse().toString();
        StringTransformer stripper = s -> s.strip();

        System.out.println("Original: '" + test + "'");
        System.out.println("Uppercase: '" + toUpper.transform(test) + "'");
        System.out.println("Reversed: '" + reverser.transform(test) + "'");
        System.out.println("Stripped: '" + stripper.transform(test) + "'");
    }
}
