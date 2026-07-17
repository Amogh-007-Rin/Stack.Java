public class LabeledLoopDemo {
    public static void main(String[] args) {
        System.out.println("--- labeled break ---");
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) break outer;
                System.out.println("(" + i + "," + j + ")");
            }
        }

        System.out.println("--- labeled continue ---");
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) continue outer;
                System.out.println("(" + i + "," + j + ")");
            }
        }
    }
}
