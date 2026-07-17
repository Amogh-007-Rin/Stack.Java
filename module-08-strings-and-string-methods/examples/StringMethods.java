public class StringMethods {
    public static void main(String[] args) {
        String s = "  Hello, World!  ";

        System.out.println("Original:    \"" + s + "\"");
        System.out.println("length():    " + s.length());
        System.out.println("charAt(1):   " + s.charAt(1));
        System.out.println("substring(2,7): \"" + s.substring(2, 7) + "\"");
        System.out.println("indexOf(','): " + s.indexOf(','));
        System.out.println("indexOf('x'): " + s.indexOf('x'));
        System.out.println("toUpperCase(): \"" + s.toUpperCase() + "\"");
        System.out.println("toLowerCase(): \"" + s.toLowerCase() + "\"");
        System.out.println("trim():      \"" + s.trim() + "\"");

        String csv = "apple,banana,cherry";
        String[] parts = csv.split(",");
        System.out.println("\nsplit result:");
        for (String p : parts) {
            System.out.println("  [" + p + "]");
        }
    }
}
