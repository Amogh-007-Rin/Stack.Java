public class CountdownTimer {
    public static void main(String[] args) {
        Thread countdown = new Thread(() -> {
            String name = Thread.currentThread().getName();
            for (int i = 10; i >= 1; i--) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(name + " interrupted");
                    return;
                }
            }
            System.out.println(name + ": Liftoff!");
        }, "Countdown");

        countdown.start();
    }
}
