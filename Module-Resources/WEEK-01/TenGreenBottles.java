public class TenGreenBottles {
    public static void main(String[] args) {
        for (int n = 10; n > 0; n--) {
            String word = (n == 1) ? "bottle" : "bottles";
            String nextWord = (n - 1 == 1) ? "bottle" : "bottles";

            System.out.println(n + " green " + word + " hanging on the wall,");
            System.out.println(n + " green " + word + " hanging on the wall,");
            System.out.println("And if one green bottle should accidentally fall,");
            
            if (n - 1 > 0) {
                System.out.println("There’ll be " + (n - 1) + " green " + nextWord + " hanging on the wall.");
            } else {
                System.out.println("There’ll be no green bottles hanging on the wall.");
            }

            System.out.println(); // blank line between verses
        }
    }
}
