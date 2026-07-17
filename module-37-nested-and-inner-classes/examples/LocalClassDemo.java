class StringFormatter {
    public String reverse(String input) {
        class Reverser {
            String reverse(String s) {
                return new StringBuilder(s).reverse().toString();
            }
        }
        Reverser r = new Reverser();
        return r.reverse(input);
    }
}

public class LocalClassDemo {
    public static void main(String[] args) {
        StringFormatter sf = new StringFormatter();
        System.out.println(sf.reverse("hello"));
        System.out.println(sf.reverse("world"));
    }
}
