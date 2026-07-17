public class Exercise2 {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(n + " is prime: " + isPrime);
    }
}
