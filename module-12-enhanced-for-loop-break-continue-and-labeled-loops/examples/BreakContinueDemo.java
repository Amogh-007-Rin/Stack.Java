public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("--- break example ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println("i = " + i);
        }

        System.out.println("--- continue example ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println("i = " + i);
        }
    }
}
