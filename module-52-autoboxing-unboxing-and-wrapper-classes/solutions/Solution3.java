public class Solution3 {
    public static void main(String[] args) {
        String num = "42";

        int asInt = Integer.parseInt(num);
        double asDouble = Double.parseDouble(num);
        Integer asInteger = Integer.valueOf(num);

        System.out.println("Parsed: int=" + asInt + " double=" + asDouble + " Integer=" + asInteger);

        int value = 255;
        System.out.println("\nConversions of " + value + ":");
        System.out.println("  Binary: " + Integer.toBinaryString(value));
        System.out.println("  Hex:    " + Integer.toHexString(value));
        System.out.println("  Octal:  " + Integer.toOctalString(value));

        System.out.println("\nBoolean parsing:");
        System.out.println("  'true' -> " + Boolean.parseBoolean("true"));
        System.out.println("  'false' -> " + Boolean.parseBoolean("false"));
        System.out.println("  'TRUE' -> " + Boolean.parseBoolean("TRUE"));
        System.out.println("  'yes' -> " + Boolean.parseBoolean("yes"));
    }
}
