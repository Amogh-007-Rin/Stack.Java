public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Max of " + a + " and " + b + " is " + max);

        int number = -5;
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(number + " is " + sign);

        boolean isEven = (number % 2 == 0) ? true : false;
        System.out.println(number + " is even: " + isEven);
    }
}
