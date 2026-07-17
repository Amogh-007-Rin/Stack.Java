interface StringProcessor {
    String process(String input);
}

public class Exercise2Solution {
    public static void main(String[] args) {
        StringProcessor toUpper = new StringProcessor() {
            @Override
            public String process(String input) {
                return input.toUpperCase();
            }
        };

        StringProcessor reverser = new StringProcessor() {
            @Override
            public String process(String input) {
                return new StringBuilder(input).reverse().toString();
            }
        };

        String test = "hello";
        System.out.println("Uppercase: " + toUpper.process(test));
        System.out.println("Reverse: " + reverser.process(test));
    }
}
