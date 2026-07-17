public class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("=== Multiple Catch Blocks ===");

        String input = null;
        int[] array = new int[2];

        for (int i = 0; i < 3; i++) {
            try {
                switch (i) {
                    case 0 -> {
                        int x = 10 / 0;
                    }
                    case 1 -> {
                        input.length();
                    }
                    case 2 -> {
                        int x = array[5];
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("RuntimeException (general): " + e.getClass().getSimpleName());
            }
        }

        System.out.println("Program continues after multiple catches.");
    }
}
