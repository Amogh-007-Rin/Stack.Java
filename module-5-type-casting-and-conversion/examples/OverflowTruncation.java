public class OverflowTruncation {
    public static void main(String[] args) {
        int bigInt = 2_000_000_000;
        int sum = bigInt + bigInt;           // silent overflow
        System.out.println(bigInt + " + " + bigInt + " = " + sum);

        double pi = 3.14159265;
        int truncated = (int) pi;
        System.out.println("Truncation: " + pi + " → " + truncated);

        long exceedsInt = 3_000_000_000L;
        int casted = (int) exceedsInt;
        System.out.println("Long " + exceedsInt + " → int " + casted);

        short sh = (short) 100_000;
        System.out.println("100000 → short " + sh);
    }
}
